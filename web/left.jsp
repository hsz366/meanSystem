<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body style="background:#f0f9fd;">

    <dl class="leftmenu">

        <dd>
            <div class="title"><span><img src="images/leftico04.png" /></span>功能菜单</div>
            <ul class="menuson">
                <li><a href="UserServlet?act=1" target="rightFrame">个人资料</a></li>
                <li style="margin-left: 36px"><a href="UserServlet?act=3" target="rightFrame">物品管理</a></li>
                <li id="admin"></li>
                <li id="super"></li>
            </ul>
        </dd>

    </dl>

</body>
<script>
    if('${user.status}'>=1){
        document.getElementById('admin').innerHTML = "<li style=\"margin-left: 36px\"><a href=\"UserServlet?act=5\" target=\"rightFrame\">资产入账</a></li>" +
            "<li style=\"margin-left: 36px\"><a href=\"UserServlet?act=7\" target=\"rightFrame\">物品入库</a></li>";
    }
    if('${user.status}'>=2){
        document.getElementById('super').innerHTML = "<li style=\"margin-left: 36px\"><a href=\"UserServlet?act=8\" target=\"rightFrame\">人员管理</a></li>";
    }
</script>
</html>
