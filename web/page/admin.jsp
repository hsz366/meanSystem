<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />

</head>


<body>
<form action="UserServlet?act=51" method="post">
    <div class="place">
        <span>位置：</span>
        <ul class="placeul">
            <li><a href="#">首页</a></li>
        </ul>
    </div>

    <div id="tab2" class="tabson">


        <ul class="seachform">

            <li><label>用户ID</label><input name="id" type="text" class="scinput" /></li>
            <li><label>身份</label><input name="status" type="text" class="scinput" /></li>
            <li><label>是否锁定</label><input name="lock" type="text" class="scinput" /></li>
            <li><label>&nbsp;</label><input type="submit" class="scbtn" value="修改"/></li>

        </ul>


        <table class="tablelist">
            <thead>
            <tr>
                <th>ID</th>
                <th>用户名</th>
                <th>邮箱</th>
                <th>身份</th>
                <th>是否锁定</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="list" items="${userList}">
                <tr>
                    <td>${list.id}</td>
                    <td>${list.name}</td>
                    <td>${list.email}</td>
                    <td>${list.status}</td>
                    <td>${list.lock}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>

    </div>


</form>
</body>

</html>
