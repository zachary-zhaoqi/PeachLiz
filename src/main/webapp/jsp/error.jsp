<%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/3
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出现错误啦</title>
</head>
<body>
<p>如果看不懂记得联系技术支持人员，并提供这个信息与你是怎么操作的，18760338358。</p>
<h3>错误信息：</h3><br/>
<h1 style="color: #9d261d"><%=request.getAttribute("errormessage")%></h1><br/>
</body>
</html>
