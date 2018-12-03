<%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/3
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>添加商品</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/addCommodity" method="post" onsubmit="">
    <table>
        <tr>
            <td>
                品类：
            </td>
            <td>
                <input type="text" name="category" />
            </td>
        </tr>
        <tr>
            <td>
                型号：
            </td>
            <td>
                <input type="text" name="model" />
            </td>
        </tr>
        <tr>
            <td>
                图片：<%--todo：上传图片的问题--%>
            </td>
            <td>
                <input type="file" name="picture" />
            </td>
        </tr>
        <tr>
            <td>
                颜色：
            </td>
            <td>
                <input type="text" name="color" />
            </td>
        </tr>
        <tr>
            <td>
                面-面料型号：
            </td>
            <td>
                <input type="text" name="topfabric" />
            </td>
        </tr>
        <tr>
            <td>
                底-面料型号：
            </td>
            <td>
                <input type="text" name="underfabric" />
            </td>
        </tr>
        <tr>
            <td>
                出厂价：
            </td>
            <td>
                <input type="text" name="factoryprice" />
            </td>
        </tr>
        <tr>
            <td>
                零售价：
            </td>
            <td>
                <input type="text" name="retailprice" />
            </td>
        </tr>
        <tr>
            <td>
                备注：
            </td>
            <td>
                <input type="text" name="remark" />
            </td>
        </tr>
        <tr>
            <td>
                产品状态：
            </td>
            <td>
                <select name="status" >
                <option value="model">正常</option>
                <option value="model">冻结</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="添加"/>
            </td>
        </tr>
    </table>

</form>

</body>
</html>
