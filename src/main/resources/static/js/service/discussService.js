/**
 * @author PQ
 * @Description 评论服务类
 * @Date 16:53 22/3/2020
 * @version 3.4.24
 **/

/**
 * @author PQ
 * @Description 写一个评论
 * @param discuss:示例
 *      {
            "literatureId": literatureId,
            "context": "context"
        }
 * @param func：func(boolean)
 * @Date 16:54 22/3/2020
 * @version 3.4.24
 **/
function writeDiscuss(discuss, func) {
    $.ajax({
        url: "/api/literature/write-discuss",
        type: "POST",
        data: discuss,
        success: function (boolean) {
            func(boolean);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    });
}

/**
 * @author PQ
 * @Description 根据文章id获取文章list
 * @param：literatureId: {
 *     "literatureId": literatureId
 * }
 * @param:func: func(list)
 * @Date 17:23 22/3/2020
 * @version
**/
function getDiscussList(literatureId, func) {
    $.ajax({
        url: "/api/literature/write-discuss",
        type: "GET",
        data: literatureId,
        success: function (list) {
            func(list);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    });
}