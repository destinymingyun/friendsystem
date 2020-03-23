/**
 * @author PQ
 * @Description 返回
 * @Date 17:02 20/3/2020
 * @version 3.4.14
**/

/**
 * @author PQ
 * @Description 根据部落获取文章
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

/**
 * @author PQ
 * @Description 根据状态获取文章
 * @Date 17:18 20/3/2020
 * @version 3.4.14
 **/
function getLiteratureByStatus(status, func) {
    $.ajax({
        url: "/api/literature/literature-status-list",
        type: "GET",
        data: status,
        success: function (list) {
            func(list);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}

/**
 * @author PQ
 * @Description 同意文章发表
 * @param data：｛"literatureId": literatureId, "status": status｝
 * @param func: func(boolean)
 * @Date 00:36 21/3/2020
 * @version 3.4.19
 **/
function changeLiteratureStatus(data, func) {
    $.ajax({
        url: "/api/literature/update-status",
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

/**
 * @author PQ
 * @Description 写文章
 * @param literature: {"title": title, "context": context}
 * @param func: func(boolean)添加成功返回true，否则返回falsze
 * @Date 23:20 23/3/2020
 * @version 3.4.25
**/
function writeLiterature(literature, func) {
    $.ajax({
        url: "/api/literature/write",
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