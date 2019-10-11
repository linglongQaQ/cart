<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/8 0008
  Time: 下午 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading text-center">
            <h1>用户注册</h1>
            <span style="color: red" id="msg"></span>
        </div>

        <div class="panel-body">
            <form class="form-horizontal" action="/login" method="post">
                <div class="form-group">
                    <label class="control-label col-md-3">用户名：</label>
                    <div class="col-md-6">
                        <input class="form-control" name="uname" id="uname" onblur="checkUser(this)"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-md-3">密码：</label>
                    <div class="col-md-6">
                        <input class="form-control" name="upwd" id="upwd"/>
                    </div>
                </div>


                <div class="form-group">
                    <label class="control-label col-md-3"> </label>
                    <div class="col-md-6">
                        <input type="submit" class="btn btn-primary" value="确认提交">
                    </div>
                </div>

            </form>
        </div>

        <div class="panel-footer text-right">
           git出品，必属精品
        </div>
    </div>
</div>
<script>
    function checkUser(obj) {
        var  uname = $(obj).val();

       $.get("/check?uname="+uname,function (data) {
           $("#msg").text(data)
       },"text");
/*
       $.post("/check",
           "uname+"=uanme,
           function (data) {
               $("#msg").text(data)
           }
           ,"text");*/

    }

</script>
</body>
</html>
