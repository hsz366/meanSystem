<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="../css/style.css">

</head>
<body>
<form action="../UserServlet?act=2" method="post">
<div id="tab1" class="tabson">

    <ul class="forminfo">
    <li><label>原密码<b>*</b></label><input name="oldPassword" type="text" class="dfinput"   style="width:518px;"/></li>
    <li><label>新密码<b>*</b></label><input name="newPassword" type="text" class="dfinput"   style="width:518px;"/></li>
    <li><label>确认密码<b>*</b></label><input name="rePassword" type="text" class="dfinput"   style="width:518px;"/></li>
   
    <li><label>&nbsp;</label><input  type="submit" class="btn" value="提交"/></li>
    </ul>
    
    </div> 
</form>
</body>
</html>