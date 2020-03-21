/**
 * @author PQ
 * @Description 管理员页面和文章处理js
 * @Date 23:49 20/3/2020
 * @version 3.4.19
**/


/**
 * @author PQ
 * @Description 管理员处理页面
 * @param list：返回的列表
 * @Date 00:00 21/3/2020
 * @version 3.4.19
**/
function selectAllLiterature(list) {
    for(var i=0;i<list.length;i++){
        var info = `
                <tr>
                    <td>${list[i].literatureId}</td>
                    <td>${list[i].title}</td>
                    <td><a href="/public/literature/${list[i].literatureId}">链接</a></td>
                    <td><button class="button" onclick="agree(${list[i].literatureId})">通过</button></td>
                </tr>
        `
        $("#tbody").append(info)
    }
}

/**
 * @author PQ
 * @Description 通过
 * @Date 00:34 21/3/2020
 * @version 3.4.19
**/
function agree(literatureId) {
    var data = {
        "literatureId": literatureId,
        "status": 2,
    }
    changeLiteratureStatus(data, function (boolean) {
        if (boolean) {
            alert("修改成功");
            window.location.href = "/admin/literature";
        } else {
            alert("修改失败");
        }
    })
}
