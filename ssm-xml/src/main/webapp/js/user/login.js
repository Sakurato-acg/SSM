$(function () {
    axios.defaults.withCredentials = true
    let login = $(".login");
    if ($.cookie("username") !== undefined) {
        $("#username").val($.cookie("username"));
    }
    if ($.cookie("password") !== undefined) {
        $("#password").val($.cookie("password"));
    }


    $('#err').text("");

    login.click(function () {
        let username = $("#username").val();
        let password = $("#password").val();
        let remember = $("#rember").prop("checked");
        // let url = $(location).attr("hostname");
        if (username != "" && password != "") {
            axios({
                method: "post",
                url: "/anime/user/"+remember,
                data:{
                    "username": username,
                    "password": password
                }
            }).then(function (resp) {
                let data = resp.data;
                alert(data.username);
                if (data === '') {
                    $("#err").text("用户名或密码错误");
                } else {
                    window.sessionStorage.setItem("username", data.username);
                    window.sessionStorage.setItem("id", data.id);
                    $.cookie("username", resp.data.username, {expires: 7});
                    $.cookie("password", resp.data.password, {expires: 7});
                    location.href = "../../page/bangumi/etrieval.html"
                }

            })
        } else {
            $('#err').text("表单不能为空")
        }
    });

});
