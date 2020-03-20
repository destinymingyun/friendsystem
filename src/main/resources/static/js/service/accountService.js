/**
 * @author PQ
 * @Description 账户ajax请求
 * @Date 20:41 19/3/2020
 * @version 3.4.11
**/

/**
 * @author PQ
 * @Description 登录请求
 * @Date 20:44 19/3/2020
 * @version 3.4.11
**/
function login(data) {
    $.ajax({
        url: "/api/account/login",
        type: "POST",
        contentType: "application/json;charset=UTF-8",
        dataType: "json",
        data: data,
        success: function (code) {
            console.log(code);
            if (code == 0) {
                $(".login-error").css("display", "block");
            } else if(code == -1){
                console.log("账户已被禁用");
            } else if (code == 1){
                window.location.href = "/admin/index";
            } else if (code == 2) {

            } else {
                console.log("???");
            }
        },
        error: function (msg) {
            console.log("发送失败")
        }
    })
}

/**
 * @author PQ
 * @Description 检查账户是否有重复
 * @Date 23:34 19/3/2020
 * @version
**/
function repeatAccount(data) {
    $.ajax({
        url: "/api/account/repeat-account",
        type: "GET",
        contentType: "application/json;charset=UTF-8",
        dataType: "json",
        data: data,
        success: function (repeat) {
            console.log(repeat);
            if (repeat) {
                $("#account").css("border-color", "#DC143C");
                $(".error").css("display", "block");
            } else {
                $("#account").css("border-color", "black");
                $(".error").css("display", "none");
            }
        },
        error: function (msg) {
            console.log("发送失败")
        }
    })
}

/**
 * @author PQ
 * @Description 注册接口
 * @Date 22:41 19/3/2020
 * @version 3.4.11
**/
function register(data) {
    $.ajax({
        url: "/api/account/register",
        type: "POST",
        contentType: "application/json;charset=UTF-8",
        dataType: "json",
        data: data,
        success: function (userId) {
            if (userId == 0) {
                alert("注册异常,请联系管理员");
            } else {
                alert("注册成功,点击后跳转至登录页面");
                window.location.href = "/public/login";
            }
        },
        error: function (msg) {
            console.log("发送失败");
        }
    })
}

