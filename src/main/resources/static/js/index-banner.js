/**
 * @author PQ
 * @Description 主页轮播图定时器
 * @Date 上午12:56 16/3/2020
 * @version 1.1
**/
function indexBanner() {
    //  创建定时器
    var img = document.getElementById("banner");
    console.log(img);
    var bannerNum = 1;
    var speed = 1;
    var ret = true;
    setInterval(function () {
        img.src = "/static/img/banner" + bannerNum + ".jpg";
        bannerNum++;
        if (bannerNum > 4) {
            bannerNum = 1;
        }
    }, 5000);
}