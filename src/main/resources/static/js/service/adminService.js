/**
 * @author PQ
 * @Description 管理员服务
 * @Date 14:56 20/3/2020
 * @version 3.4.13
**/

/**
 * @author PQ
 * @Description 获取全部用户信息
 * @param func：回调函数，成功后会将返回的用户list传入此函数
 * @Date 14:58 20/3/2020
 * @version 3.4.13
**/
function getUsers(func ) {
    $.ajax({
        url: "/api/admin/users",
        type: "GET",
        success: function (list) {
            func(list);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    });
}

/**
 * @author PQ
 * @Description 修改用户状态
 * @param data：{"userId": userId, "status": status}
 * @param func: func(boolean); boolean会返回是否修改成功，true为修改成功，false为修改失败
 * @Date 16:32 20/3/2020
 * @version 3.4.14
**/
function changeUserStatus(data,func) {
    $.ajax({
        url: "/api/admin/status",
        type: "PUT",
        data: data,
        success: function (boolean) {
            func(boolean);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}
