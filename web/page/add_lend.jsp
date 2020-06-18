<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>


</head>
<body>
<form action="UserServlet?act=10" method="post">
<div id="tab1" class="tabson">
    
    <div class="formtext">Hi，<b>${user.name}</b>，添加申请！</div>
    
    <ul class="forminfo">
    <li>
        <label>物品名称<b>*</b></label>
        <select name="cpname">
            <c:forEach var="p" items="${assetServiceList}">
                <option name="1">${p.cpname}</option>
            </c:forEach>
        </select>
    </li>
    <li>
        <label>数量<b>*</b></label>
        <input name="count" type="text" class="dfinput"  style="width:518px;"/>
    </li>

    <li><label>&nbsp;</label><input  type="submit" class="btn" value="提交申请"/></li>
    </ul>
    
    </div> 
</form>
</body>
</html>