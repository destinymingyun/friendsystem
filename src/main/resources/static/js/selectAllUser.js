/**
 * @author PQ
 * @Description 描述
 * @Date 19:15 20/3/2020
 * @version 3.4.14
**/
function selectAllUser(list) {
    for(var i=0;i<list.length;i++){
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
    var data = {
        "userId": userId,
        "status": status
    };
    changeUserStatus(data, function (boolean) {
        if (boolean) {
            alert("用户状态修改成功");
            window.location.href = "/admin/user";
        }
    })
}
