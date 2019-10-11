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
    <title>商品页面</title>
</head>
<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel panel-heading text-center">
            <h1>手机商城</h1>
        </div>
        <div class="panel-body">
            <div class="row">
                <c:forEach items="${list}" var="item">
                    <div class="col-md-3">
                        <div class="thumbnail">
                            <img src="/img/${item.img}" alt="${item.pdesc}" >
                            <div class="caption">
                                <h4>${item.pname}/${item.ptitle}</h4>
                                <p style="color: red">${item.price}</p>
                                <p><a href="/add?pid=${item.id}" class="btn btn-primary" role="button">加入购物车</a>
                                    <a href="#" class="btn btn-default" role="button">查看详情</a></p>
                            </div>
                        </div>
                    </div>
                 </c:forEach>
            </div>
            <div>
                <a href="/view" class="btn btn-block btn-success">查看购物车</a>
            </div>
        </div>
        <div class="panel-footer text-right">
            泽林出品，必属精品
        </div>

    </div>
</div>
</body>
</html>
