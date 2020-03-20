/**
 * @author PQ
 * @Description 描述
 * @Date 19:15 20/3/2020
 * @version 3.4.14
**/
function selectAllUser(list) {
    for(var i=0;i<list.length;i++){
        var data = {
            "userId": list[i].userId,
            "status": list[i].status
        };
        var info = `
                <tr>
                    <td>${list[i].userId}</td>
                    <td>${list[i].account}</td>
                    <td>${list[i].status==0?"被禁用":"已激活"}</td>
                    <td><button class="button" onclick="change(${list[i].userId}, ${list[i].status})">${list[i].status==0?"激活":"禁用"}</button></td>
                </tr>
        `
        $("#tbody").append(info)
    }
}

/**
 * @author PQ
 * @Description 修改用户状态按钮事件函数
 * @Date 19:21 20/3/2020
 * @version 3.4.15
**/
function change(userId, status) {
    alert(userId);
    alert(status);
}
