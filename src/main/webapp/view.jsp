<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/10 0010
  Time: 下午 3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <title>购物车</title>
</head>
<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel panel-heading text-center">
            <h1>购物车商品列表</h1>
        </div>
        <div class="panel-body">
            <table class="table table-striped table-hover table-bordered text-center">
                <tr>
                    <td>编号</td>
                    <td>图片</td>
                    <td>名称</td>
                    <td>标题</td>
                    <td>价格</td>
                    <td>数量</td>
                    <td>小计</td>
                    <td>操作</td>
                </tr>

                <c:forEach items="${cart.map}" var="cart">
                    <tr>
                        <td>${cart.value.id}</td>
                        <td><img src="img/${cart.value.img}" style="height: 80px;width: 80px"></td>
                        <td>${cart.value.pname}</td>
                        <td>${cart.value.ptitle}</td>
                        <td>${cart.value.price}</td>
                        <td>${cart.value.num}</td>
                        <td>${cart.value.sum}</td>
                        <td>
                            <a href="/remove?pid=${cart.value.id}" class="btn btn-danger">移出购物车</a>
                        </td>
                    </tr>

                </c:forEach>
                <tr>
                    <td colspan="9">
                        当前总数量是：${cart.totalCount},
                        总金额为：${cart.totalAmt}
                    </td>
                </tr>
            </table>
            <a href="index.html" class="btn btn-success btn-lg btn-block">继续购物</a>
        </div>
        <div class="panel-footer text-right">
            泽林出品，必属精品
        </div>

    </div>
</div>
</body>
</html>
