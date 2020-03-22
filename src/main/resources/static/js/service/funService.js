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

/**
 * @author PQ
 * @Description 创建一个部落
 * @param fun：兴趣部落的json格式 示例
 *       {
             "funName": "TestFunName",
             "introduction": "TestFunIntroduction"
        }
 * @param func：回调函数（func（boolean）），成功返回true，失败返回false
 * 示例：
 * createFun(fun, function (boolena) {
            console.log(boolena)
        });
 * @Date 13:42 22/3/2020
 * @version 3.4.23
**/
function createFun(fun, func) {
    $.ajax({
        url: "/api/fun/create-fun",
        type: "POST",
        data: fun,
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
 * @Description 加入一个部落
 * @param funId：示例
 * {"funId": funId}
 * @param func：回调函数
 * @Date 14:27 22/3/2020
 * @version 3.4.24
**/
function joinFun(funId, func) {
    $.ajax({
        url: "/api/fun/create-fun",
        type: "POST",
        data: funId,
        success: function (boolean) {
            func(boolean);
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}