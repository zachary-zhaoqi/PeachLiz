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
<h2>错误信息：</h2><br/>
<h5><%=request.getAttribute("errormessage")%></h5><br/>
</body>
</html>
