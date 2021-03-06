<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign-Up/Login Form</title>
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="form">
    <ul class="tab-group">
        <li class="tab active"><a href="#signup">注册</a></li>
        <li class="tab"><a href="#login">登录</a></li>
    </ul>
    <div class="tab-content">
        <div id="signup">
            <h1>免费注册</h1>
            <div class="top-row">
                <div class="field-wrap">
                    <label>
                        姓<span class="req">*</span>
                    </label>
                    <input type="text" required autocomplete="off"/>
                </div>
                <div class="field-wrap">
                    <label>
                        名<span class="req">*</span>
                    </label>
                    <input type="text" required autocomplete="off"/>
                </div>
            </div>
            <div class="field-wrap">
                <label>
                    邮箱<span class="req">*</span>
                </label>
                <input type="email" required autocomplete="off"/>
            </div>
            <div class="field-wrap">
                <label>
                    密码<span class="req">*</span>
                </label>
                <input type="password" required autocomplete="off"/>
            </div>
            <button type="submit" class="button button-block">
                去注册
            </button>
        </div>
        <div id="login">
            <h1>Welcome Back!</h1>
            <form method="post" action="login">
                <div class="field-wrap">
                    <label>
                        邮箱账号<span class="req">*</span>
                    </label>
                    <input type="email" name="userName" required autocomplete="off"/>
                </div>
                <div class="field-wrap">
                    <label>
                        密码<span class="req">*</span>
                    </label>
                    <input type="password" name="password" required autocomplete="off"/>
                </div>
                <p class="forgot"><a href="#">忘记密码?</a></p>
                <button class="button button-block" type="submit">
                    登录
                </button>
            </form>
        </div>
    </div><!-- tab-content -->
</div> <!-- /form -->
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="js/index.js"></script>
<script>
    $(function () {
        //登录
        /*$("#login_btn").click(()=>{
            var userName= $("#login input[name='userName']").val();
            var password= $("#login input[name='password']").val();
        $.ajax({
            type:"post",
            url:"login",
            data:JSON.stringify({userName,password},
            success:(da)=>{
                console.log(da);
            }
        });
        });*/
    });
</script>
</body>

</html>
