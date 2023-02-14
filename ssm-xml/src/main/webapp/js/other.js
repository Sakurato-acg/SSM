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

let menu = document.querySelector("header .head .head-menu");
let top_nav = document.querySelector("header .topnav");
let flag = false;
console.log(menu);
menu.addEventListener("click", function () {
    console.log(this);
    if (!flag) {
        top_nav.style.display = "block";
        flag = !flag;
    } else {
        top_nav.style.display = "none";
        flag = !flag;
    }
});
let i_down = document.querySelector(".fa-angle-double-down");
let dropdown = document.querySelector(".dropdown");
let flag2 = false;

i_down.addEventListener("click", function () {
  if (!flag2) {
        console.log(dropdown);
        dropdown.style.display = "block";
        flag2 = !flag2;
        let i=1/0;
    } else {
        dropdown.style.display = "none";
        flag2 = !flag2;
    }
});
