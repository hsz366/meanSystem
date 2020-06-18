<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <link href="css/select.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="js/select-ui.min.js"></script>


    <script type="text/javascript">
        $(document).ready(function(e) {
            $(".select1").uedSelect({
                width : 345
            });
            $(".select2").uedSelect({
                width : 167
            });
            $(".select3").uedSelect({
                width : 100
            });
        });
    </script>
</head>

<body>
<form action="UserServlet?act=1" method="post">
    <div class="place">
        <span>位置：</span>
        <ul class="placeul">
            <li><a href="#">首页</a></li>
        </ul>
    </div>

    <div id="tab2" class="tabson">

        <table class="tablelist">
                <tr>
                    <td>编号</td>
                    <td>${user.id}</td>
                </tr>
            <tr>
                <td>姓名</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td>身份</td>
                <td id="cap"></td>
            </tr>
            <h1><a href="page/update.jsp">修改密码</a></h1>
            </tbody>
        </table>


    </div>


</form>
</body>
<script>
    if('${sessionScope.user.status}'==2){
        document.getElementById('cap').innerHTML = "超级管理员";
    }else if('${sessionScope.user.status}'==1){
        document.getElementById('cap').innerHTML = "管理员";
    }else if('${sessionScope.user.status}'==0){
        document.getElementById('cap').innerHTML = "普通用户";
    }
</script>
</html>
