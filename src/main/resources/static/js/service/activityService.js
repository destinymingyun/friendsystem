/**
 * @author PQ
 * @Description 活动
 * @Date 17:41 23/3/2020
 * @version 3.4.25
**/

function addActivity(activity, func) {
    $.ajax({
        url: "/api/admin/status",
        type: "POST",
        data: data,
        success: function (boolean) {
            func(boolean);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}