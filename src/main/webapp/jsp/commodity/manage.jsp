<%@ page import="java.util.List" %>
<%@ page import="model.Commodity" %><%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/3
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>

    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/common.js"></script>


    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }
    </style>
</head>
<body>
<form class="form-inline definewidth m20" action="${pageContext.request.contextPath}/queryCommodity" method="post" onsubmit="queryCommodityHandle()">
    <select name="commodityAttribute" id="commodityAttribute">
        <option value="model">编号</option>
        <option value="model">品类</option>
        <option value="color">颜色</option>
        <option value="remark">备注</option>
        <option value="status">产品状态</option>
    </select>
    <input type="text" name="commodityAttributeDetails" id="commodityAttributeDetails"class="abc input-default" value="">&nbsp;&nbsp;
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnewCommodity">新增产品</button>
</form>



<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>品类</th>
        <th>型号</th>
        <th>照片</th>
        <th>颜色</th>
        <th>面-面料型号</th>
        <th>底-面料型号</th>
        <th>出厂价</th>
        <th>零售价</th>
        <th>备注</th>
        <th>产品状态</th>
        <th>操作</th>
    </tr>
    </thead>


    <%
        List<Commodity> commodityList= (List<Commodity>) request.getAttribute("commodityList");
        if (commodityList!=null){
            for (Commodity commodity :commodityList) {
                out.println(
                    "   <tr>\n" +
                    "        <td>"+commodity.getCategory()+"</td>\n" +
                    "        <td>"+commodity.getModel()+"</td>\n" +
                    "        <td><img src=\""+request.getContextPath()+commodity.getPicture()+"\" width=\"150px\"></td>\n" +
                    "        <td>"+commodity.getColor()+"</td>\n" +
                    "        <td>"+commodity.getTopfabric()+"</td>\n" +
                    "        <td>"+commodity.getUnderfabric()+"</td>\n" +
                    "        <td>"+commodity.getFactoryprice()+"</td>\n" +
                    "        <td>"+commodity.getRetailprice()+"</td>\n" +
                    "        <td>"+commodity.getRemark()+"</td>\n" +
                    "        <td>"+commodity.getStatus()+"</td>\n" +
                    "        <td>\n" +
                    "            <button type=\"button\" class=\"btn btn-success\" id=\"editCommodity\">编辑</button>\n" +
                    "            <button type=\"button\" class=\"btn btn-success\" id=\"removeCommodity\">下架</button>\n" +
                    "            <span hidden>"+commodity.getIdcommodity()+"</span>\n" +
                    "        </td>\n" +
                    "    </tr>"
                );
            }
        }
    %>

</table>


<script>
    $(function () {
        $('#addnewCommodity').click(function(){
            window.location.href="${pageContext.request.contextPath}/jsp/commodity/add.jsp";
        });
        $('#editCommodity').click(function(){
            window.location.href="${pageContext.request.contextPath}/jsp/commodity/edit.jsp";
        });
        $('#removeCommodity').click(function(){
            var idcommodity=$('#removeCommodity').siblings("span").text();
            window.location.href="${pageContext.request.contextPath}/removeCommodity?idcommodity="+idcommodity;
        });
    });

</script>
</body>
</html>
