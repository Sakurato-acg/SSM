let loginBtn_btn = document.querySelector(".loginBtn_btn");
let loginBtn_user = document.querySelector(".loginBtn_user");
let p = document.querySelector(".loginBtn_user p");
let a = document.querySelector(".loginBtn_user a");

let username = window.sessionStorage.getItem("username");
let id = window.sessionStorage.getItem("id");
if (username == null) {
    loginBtn_btn.style.display = "block";
    loginBtn_user.style.display = "none";
} else {
    loginBtn_btn.style.display = "none";
    loginBtn_user.style.display = "block";
    p.innerHTML = username;
}

a.addEventListener("click", function () {
    alert("注销");
    axios({
        method: "get",
        url: "/anime/user/"+id
    }).then(function (resp) {
        if (resp.data == 'success') {
            alert(resp.data);
            window.sessionStorage.clear();
            location.href = "/anime/index.html"
        }
    })
})
