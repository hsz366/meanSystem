<%--
  Created by IntelliJ IDEA.
  User: TIMOR
  Date: 2020/4/11
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>biaoge</title>
</head>
<style>

    table tr td{
        width: 20px;
        height: 20px;
    }

    table tr td:first-child{
        width: auto;
        text-align: center;
    }
</style>
<body>
<table border="1">
    <%--   第一行   --%>
        <tr>
            <%
                for(int i=1;i<=3;i++){
                    out.println("<td>"+(char)(64+i)+"</td>");
                }
            %>
        </tr>
    <%--    第二行    --%>
    <tr>
        <%
            for(int i=1;i<=3;i++){
                out.println("<td>"+(char)(64+i)+"</td>");
            }
        %>
    </tr>
    <%--    第三行    --%>
    <tr>
        <%
            for(int i=1;i<=3;i++){
                out.println("<td>"+(char)(96+i)+"</td>");
            }
        %>
    </tr>
</table>
</body>
</html>
