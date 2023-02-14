$(function () {
    $('#err').text("");
    let register = $(".register");
    register.click(function () {
        let username = $("#username").val();
        let usernamePatt = /^\w{5,12}$/;
        let email = $("#email").val();
        let first_password = $("#first-password").val();
        let second_password = $("#second-password").val();
        if (!usernamePatt.test(username)) {
            $("#err").text("用户名不合法！");
            return false;
        }
        let passwordPatt = /^\w{5,12}$/;
        //3 使用test方法验证
        if (!passwordPatt.test(second_password)) {
            //4 提示用户结果
            $("#err").text("密码不合法！");
            return false;
        }
        if (first_password != second_password) {
            //4 提示用户结果
            $("#err").text("密码不一致！");
            return false;
        }
        //2 创建正则表达式对象
        let emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
        //3 使用test方法验证是否合法
        if (!emailPatt.test(email)) {
            //4 提示用户
            $("#err").text("邮箱格式不合法！");
            return false;
        }
        // let url=$(location).attr("hostname");
        if (username != "" && email != "" && second_password != "" && first_password != "") {
            axios({
                method: "post",
                url: "/anime/user",
                data: {
                    "username": username,
                    "password": second_password,
                    "email": email
                }
            }).then(function (resp) {
                let data = resp.data;
                alert(data);

                if (data == 'success') {
                    setInterval(function () {
                            $('#err').text("注册成功");
                            $('#err').css("color", "green");
                        }, 10);
                    location.href="/anime/page/user/login.html"
                } else if (data == false) {
                    $('#err').text("注册失败");
                }

            })
        } else {
            $('#err').text("表单不能为空")
        }
    });
});
