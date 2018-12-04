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
<h2>错误信息：</h2><br/>
<h5><%=request.getAttribute("errormessage")%></h5><br/>
<p>请联系技术支持人员，18760338358。</p>
</body>
</html>
