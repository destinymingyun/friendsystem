/**
 * @author PQ
 * @Description 活动
 * @Date 17:41 23/3/2020
 * @version 3.4.25
**/

/**
 * @author PQ
 * @Description 添加一个活动
 * @param activity:{"name": name, "context": context}
 * @Date 19:07 23/3/2020
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

/**
 * @author PQ
 * @Description 获取活动
 * @Date 19:09 23/3/2020
 * @version 3.4.25
**/
function getActivity(func) {
    $.ajax({
        url: "/api/admin/getActivity",
        type: "GET",
        success: function (boolean) {
            func(boolean);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}

