<%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/5
  Time: 0:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新规格</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addInventorySpecification">
<%
    String model="";
    String Specification="";
%>
    <table>
        <tr>
            <td>
                产品编号：
            </td>
            <td>
                <input type="text" name="commodityModel" value="<%=model%>" />
            </td>
        </tr>
        <tr>
            <td>
                产品规格：
            </td>
            <td>
                <input type="text" name="Specification" value="<%=Specification%>" />
            </td>
        </tr>
        <tr>
            <td>
                库存数量：
            </td>
            <td>
                <input type="number" name="number" value="0" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="保存"/>
            </td>
            <td>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
