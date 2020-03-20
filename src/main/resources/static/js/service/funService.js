/**
 * @author PQ
 * @Description fun服务调用接口
 * @Date 17:41 20/3/2020
 * @version 3.4.14
**/

/**
 * @author PQ
 * @Description 获取所有fun
 * @Date 17:42 20/3/2020
 * @version 3.4.14
**/
function getFun(func) {
    $.ajax({
        url: "/api/fun/get-fun-list",
        type: "GET",
        success: function (list) {
            func(list);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}