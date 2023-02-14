let b = document.body;
let h = new Date().getHours();
let head = document.querySelector("header");
let time = document.getElementById("time");
// console.dir(b);
// console.dir(head);
// console.dir(time);

let alist = document.querySelectorAll("main .change");
for (let index = 0; index < alist.length; index++) {
    alist[index].addEventListener("mouseover", function () {
        // console.log(index);
        // console.log(this);
        for (let i = 0; i < alist.length; i++) {
            alist[i].style.backgroundColor = "inherit";
            alist[i].style.color = "#a97f70";
        }
        this.style.backgroundColor = "#ffc107";
        this.style.color = "white";
    });
    alist[index].addEventListener("mouseleave", function () {
        this.style.backgroundColor = "inherit";
        this.style.color = "#a97f70";
        alist[0].style.backgroundColor = "#28b9be";
        alist[0].style.color = "white";
    });
}

function showtime() {
    var date = new Date();
    // 我们写一个 2019年 5月 1日 星期三
    var arr = [
        "星期日",
        "星期一",
        "星期二",
        "星期三",
        "星期四",
        "星期五",
        "星期六",
    ];
    let day = date.getDay();
    let hh = date.getHours();
    let fen = date.getMinutes();
    let miao = date.getSeconds();
    if (miao < 10) {
        miao = "0" + miao;
    }
    if (hh < 10) {
        hh = "0" + hh;
    }
    if (fen < 10) {
        fen = "0" + fen;
    }
    // console.log(miao);
    time.innerText =
        arr[day] + "   " + hh + "    :   " + fen + "    :    " + miao;
    setTimeout(showtime, 1000);
}

showtime();
let menu = document.querySelector("header .head .head-menu");
let top_nav = document.querySelector("header .topnav");
let flag1 = false;
menu.addEventListener("click", function () {
    if (!flag1) {
        top_nav.style.display = "block";
        flag1 = !flag1;
    } else {
        top_nav.style.display = "none";
        flag1 = !flag1;
    }
});
let i_down = document.querySelector(".fa-angle-double-down");
let dropdown = document.querySelector(".dropdown");
let flag2 = false;

i_down.addEventListener("click", function () {
    if (!flag2) {
        dropdown.style.display = "block";
        flag2 = !flag2;
    } else {
        dropdown.style.display = "none";
        flag2 = !flag2;
    }
});
