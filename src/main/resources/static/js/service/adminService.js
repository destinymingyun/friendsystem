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