<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Login Page | Amaze UI Example</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="assets/i/favicon.png">
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>

    <style>
        .header {
            text-align: center;
        }

        .header h1 {
            font-size: 200%;
            color: #333;
            margin-top: 30px;
        }

        .header p {
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="header">
    <div class="am-g">
        <h1>几乎</h1>
        <p>分享知识<br/>一个知识分享的平台</p>
    </div>
    <hr/>
</div>


<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
    <div class="am-u-md-8 am-u-sm-centered">
        <form method="post" class="am-form am-form-horizontal" action="userAction!register.action" name="myform">

            <%--账号--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-user am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="user.username" placeholder="Username">
            </div>
            <%--密码--%>
            <div class="am-input-group am-form-group">
                <span class="am-input-group-label"><i class="am-icon-lock am-icon-fw"></i></span>
                <input type="text" class="am-form-field" name="user.password" placeholder="Password">
            </div>

            <div class="am-cf">
                <input type="submit" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
            </div>
        </form>
        <hr>
        <p>© 2016 -------------------------------------------</p>

    </div>

</div>
</body>
</html>


