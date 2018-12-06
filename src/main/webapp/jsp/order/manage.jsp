<%@ page import="model.Order" %>
<%@ page import="java.util.List" %>
<%@ page import="model.PageModel" %><%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/5
  Time: 9:14
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/myjs.js"></script>

</head>
<body>



<br/>
<div style="float: left">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span>按状态查看状态</span>
</div>
<div style="float: right">
    <button type="button" class="btn btn-success" id="newOrder">创建新订单</button>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</div>

<hr/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="" onclick="queryOrderForStatus(this)">全部订单</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>|</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="待付订金" onclick="queryOrderForStatus(this)">待付定价</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="待付尾款" onclick="queryOrderForStatus(this)">待付尾款</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="待发货" onclick="queryOrderForStatus(this)">待 发 货</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="待收货" onclick="queryOrderForStatus(this)">待 收 货</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="完成交易" onclick="queryOrderForStatus(this)">完成交易</button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<strong>|</strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button type="button" class="btn btn-primary" value="退货" onclick="queryOrderForStatus(this)"> 退  货 </button>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br/>


<div class="showallorder">
    <%
        PageModel pageModel=(PageModel) request.getAttribute("PageModel");
        if(null!=pageModel){
            List<Order> list= pageModel.getList();
            if (list != null) {
                for(int i = 0; i < list.size(); i++) {
                    Order order=list.get(i);
                    if (0!=i%2){
                        out.println("<div class=\"one-order\"  style=\"float: left\">\n");
                    }else {
                        out.println("<div class=\"one-order\"  style=\"float: right\">\n");
                    }
                    out.println(
                                    "        <table border=\"1\">\n" +
                                    "            <tr>\n" +
                                    "                <td>下单时间：</td>\n" +
                                    "                <td>"+order.getOrderDate().getOrderdate()+"</td>\n" +
                                    "                <td>订单状态：</td>\n" +
                                    "                <td>"+order.getOrderstatus()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>购买单位：</td>\n" +
                                    "                <td colspan=\"3\">"+order.getCustomer()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>联系人：</td>\n" +
                                    "                <td colspan=\"3\">"+order.getShoppingaddress().getContactname()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>电话：</td>\n" +
                                    "                <td>"+order.getShoppingaddress().getContacttel()+"</td>\n" +
                                    "                <td>QQ：</td>\n" +
                                    "                <td>"+order.getShoppingaddress().getContactqq()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>地址：</td>\n" +
                                    "                <td colspan=\"3\">"+order.getShoppingaddress().getAddress()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>快递单号：</td>\n" +
                                    "                <td colspan=\"3\">"+order.getExpressnumber()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td>面单总额：</td>\n" +
                                    "                <td>"+order.getOrderMoney().getTotalamount()+"</td>\n" +
                                    "                <td>实收额度：</td>\n" +
                                    "                <td>"+order.getOrderMoney().getDownpayment()+"</td>\n" +
                                    "            </tr>\n" +
                                    "            <tr>\n" +
                                    "                <td><button>进入下一状态</button></td>\n" +
                                    "                <td><button>退回上一状态</button></td>\n" +
                                    "                <td><button>查看订单详情</button></td>\n" +
                                    "                <td><button>申请退货</button></td>\n" +
                                    "            </tr>\n" +
                                    "        </table>\n" +
                                    "    </div>" +
                                    "    <br/>"
                    );
                }
            }
        }
    %>



    <script>
        $(function () {
            $('#newOrder').click(function(){
                window.location.href="${pageContext.request.contextPath}/jsp/order/add.jsp";
            });
        });
    </script>
</body>
</html>
