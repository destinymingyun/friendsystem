/**
 * @author PQ
 * @Description 返回
 * @Date 17:02 20/3/2020
 * @version 3.4.14
**/

/**
 * @author PQ
 * @Description
 * @Date 17:18 20/3/2020
 * @version 3.4.14
**/
function getLiterature(funId, func) {
    $.ajax({
        url: "/api/literature/literature-list",
        type: "GET",
        data: funId,
        success: function (list) {
            func(list);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}