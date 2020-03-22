/**
 * @author PQ
 * @Description 查看兴趣部落的所有部落
 * @Date 21:43 20/3/2020
 * @version 3.4.17
 **/
function findAllFun(list) {
    for(var i=1;i<list.length;i++){
        var info = `
            <div class="card">
                <div class="title"><p>${list[i].funName}</p></div>
                <div class="content"><p>${list[i].introduction}</p></div>
                <div class="button"><button class="button-content" onclick="joinFunButton(${list[i].funId})">加入</button></div>
            </div>
            `
        $(".fun-card-box").append(info)
    }
}