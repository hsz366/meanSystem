<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <link href="css/select.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="js/select-ui.min.js"></script>
    <script type="text/javascript" src="editor/kindeditor.js"></script>

    <script type="text/javascript">
        KE.show({
            id : 'content7',
            cssPath : './index.css'
        });
    </script>

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


        <ul class="seachform">

            <li><label>综合查询</label><input name="search" type="text" class="scinput" /></li>

            <li><label>&nbsp;</label><input type="button" class="scbtn" value="归还" onclick="location.href='UserServlet?act=11'"/></li>

            <li><label>&nbsp;</label><input type="button" class="scbtn" value="领用" onclick="location.href='UserServlet?act=9'"/></li>

        </ul>



        <table class="tablelist">
            <thead>
            <tr>
                <th>资产编码</th>
                <th>产品类别</th>
                <th>产品序列号</th>
                <th>产品名称</th>
                <th>规格型号</th>
                <th>数量</th>
                <th>领用人</th>
                <th>领用时间</th>
                <th>归还时间</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="p" items="${lender}">
                <tr>
                    <td>${p.zcid}</td>
                    <td>${p.family}</td>
                    <td>${p.cpid}</td>
                    <td>${p.cpname}</td>
                    <td>${p.cpnorm}</td>
                    <td>${p.count}</td>
                    <td>${p.applyname}</td>
                    <td>${p.sqtime}</td>
                    <td>${p.sptime}</td>
                </tr>
            </c:forEach>

            </tbody>
        </table>

    </div>


</form>
</body>

</html>
