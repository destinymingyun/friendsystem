/**
 * @author PQ
 * @Description 文章列表
 * @Date 20:49 20/3/2020
 * @version 3.4.17
**/

function funForeach(list) {
    for (var i = 0; i < list.length; i++) {
        var str = `<li><a onclick="getFunInfo(${list[i].funId}, ${list[i].memberNum},'${list[i].funName}')">
                    ${list[i].funName}
                    </a></li>
                    <li>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;</li>`;
        $("#fun").append(str);
    }
}

/**
 * @author PQ
 * @Description 点击后获取对应fun的文章
 * @Date 21:06 20/3/2020
 * @version 3.4.17
**/
function getFunInfo(funId, num, name) {
    $("#fun-name").html(name);
    $("#people-num").html("有:"+num+"人关注本部落");
    var data = {
        "funId": funId
    }
    getLiterature(data, function (list) {
        $("article").remove();
        console.log(list);
        for (var i = 0; i < list.length; i++) {
            var str = `<article class="auto" onclick="toliterature(${list[i].literatureId})">
            <div class="article-title"><h2>${list[i].title}</h2>
                <time>${Date(list[i].createTime)}</time>
            </div>
            <div class="article-context">
                ${list[i].context}
            </div>
            </article>`;
            $("#literature-box").append(str);


        }
    })
}

/**
 * @author PQ
 * @Description 点击进入该文章页面
 * @Date 21:43 20/3/2020
 * @version 3.4.17
**/
function toliterature(literatureId) {
    window.location.href = "/public/literature/"+literatureId;
}
