<%@ page import="model.Commodity" %>
<%@ page import="model.PageModel" %>
<%@ page import="java.util.List" %>
<%@ page import="model.InventorySpecification" %><%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/4
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/mycss.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/common.js"></script>
</head>
<body>
    <form class="form-inline definewidth m20" action="${pageContext.request.contextPath}/queryInventory" method="post" onsubmit="queryCommodityHandle()">
        <select name="whereName">
            <option value="model">型号</option>
        </select>
        <input type="text" name="whereValue" class="abc input-default" value="">&nbsp;&nbsp;
        <button type="submit" class="btn btn-primary">查询库存</button>&nbsp;&nbsp;&nbsp;&nbsp;
        <button type="button" class="btn btn-success" id="addnewCommodity">新增产品</button>
    </form>

    <table class="table table-bordered table-hover definewidth m10">
        <thead>
        <tr>
            <th>品类</th>
            <th>箱号</th>
            <th>型号</th>
            <th>照片</th>
            <th>备注</th>
            <th>库存数</th>
            <th>操作</th>
        </tr>
        </thead>

        <%
            PageModel<InventorySpecification> pageModel= (PageModel<InventorySpecification>) request.getAttribute("InventorySpecification");
            if (pageModel!=null){
                List<InventorySpecification> inventorySpecificationList= pageModel.getList();
                if (inventorySpecificationList!=null){
                    for (InventorySpecification inventorySpecification :inventorySpecificationList) {
                        Commodity commodity=inventorySpecification.getCommodity();
                        out.println(
                                "   <tr>\n" +
                                        "        <td>"+commodity.getCategory()+"</td>\n" +
                                        "        <td>"+commodity.getContainer()+"</td>\n" +
                                        "        <td>"+commodity.getModel()+"</td>\n" +
                                        "        <td><img src=\""+request.getContextPath()+"/assets"+commodity.getPicture()+"\" width=\"150px\"></td>\n" +
                                        "        <td>"+commodity.getRemark()+"</td>\n" +
                                        "        <td>"+inventorySpecification.getNumber()+"</td>\n" +
                                        "        <td>\n" +
                                        "            <span hidden>"+commodity.getIdcommodity()+"</span>\n" +
                                        "        </td>\n" +
                                        "    </tr>"
                        );
                    }
                }
            }
        %>
    </table>

    <%
        //这块主要做分页的导航，更新页面
        if (pageModel!=null){
            if ("%"==pageModel.getWhereValue()){
                pageModel.setWhereValue("");
            }
            String pageParmeStr="&pageSize="+pageModel.getPageSize()+"&totalRecord="+pageModel.getTotalRecord()+"&commodityAttribute="+pageModel.getWhereName()+"&commodityAttributeDetails="+pageModel.getWhereValue();
            out.println(
                    "<a href=\""+request.getContextPath()+"/updatePageList?pageNumber=1"+pageParmeStr+"\">首页</a>" +
                            "<a href=\""+request.getContextPath()+"/updatePageList?pageNumber="+Integer.toString(pageModel.getPageNumber()-1)+pageParmeStr+"\">上一页</a>"
            );
            for (int i = 0; i < pageModel.getTotalPage(); i++) {
                if ((i+1)!=pageModel.getPageNumber()){
                    out.println("<a href=\""+request.getContextPath()+"/updatePageList?pageNumber="+Integer.toString(i+1)+pageParmeStr+"\">"+Integer.toString(i+1)+"</a>");
                }else {
                    out.println("<span>"+Integer.toString(i+1)+"</span>");
                }
            }
            out.println(
                    "<a href=\""+request.getContextPath()+"/updatePageList?pageNumber="+Integer.toString(pageModel.getPageNumber()+1)+pageParmeStr+"\">下一页</a>" +
                            "<a href=\""+request.getContextPath()+"/updatePageList?pageNumber="+pageModel.getTotalPage()+pageParmeStr+"\">尾页</a>"
            );
        }
    %>


</body>
</html>
