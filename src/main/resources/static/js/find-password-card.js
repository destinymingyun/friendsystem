/**
 * @author PQ
 * @Description find-password-card的切换
 * @Date 17:21 19/3/2020
 * @version 3.4.10
**/

/**
 * @author PQ
 * @Description 初始化表单,只显示第一张
 * @Date 18:27 19/3/2020
 * @version 3.4.10
**/
$(document).ready(function () {
    var cards = $(".find-password-card");
    cards.css("display", "none");
    $(cards[0]).css("display", "block");
})

var index = 0;
function buttonClick() {
    var cards = $(".find-password-card");
    console.log("aaa"+index);
    if (index != 3) {
        $(cards[index]).css("display", "none");
        $(cards[index+1]).css("display", "block");
    }
    index++;
}
