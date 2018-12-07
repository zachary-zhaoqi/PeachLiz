<%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/5
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/mycss.css" />

    <style>
        input[type="text"],
        input[type="number"]{
            width: 100%;
            border: none;
        }
    </style>
</head>
<body>
<div class="order-create-button" style="float: right">
    <button>添加商品组</button>
</div>


<div class="order-show">

    <form action="" method="post">
        <table  border="1" style="text-align: center;border-collapse: collapse;border-spacing: 0;">
            <div class="order-date">
                <tr>
                    <td colspan="100">
                        <table style="width: 100%;text-align: center;font-size: 12px">
                            <tr>
                                <td style="width: 100px;text-align: right">
                                    下单时间:
                                </td>
                                <td  style="width: 100px;text-align: left">
                                    <input type="text" name="" />
                                </td>
                                <td style="width: 100px;text-align: right">
                                    付定价时间:
                                </td>
                                <td style="width: 100px;text-align: left">
                                    <input type="text" name="" />
                                </td>
                                <td style="width: 100px;text-align: right">
                                    付尾款时间:
                                </td>
                                <td style="width: 100px;text-align: left">
                                    <input type="text" name="" />
                                </td>
                                <td style="width: 100px;text-align: right">
                                    发货时间:
                                </td>
                                <td style="width: 100px;text-align: left">
                                    <input type="text" name="" />
                                </td>
                                <td style="width: 100px;text-align: right">
                                    交易完成时间:
                                </td>
                                <td style="width: 100px;text-align: left">
                                    <input type="text" name="" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </div>
            <%--一百个单元格--%>
            <div class="order-head">
                <tr>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>

                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>

                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>

                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>

                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>
                    <td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td><td style="background-color: #1a1a1a;"></td>

                </tr>
            </div>

            <div class="order-Shoppingaddress">
                <tr>
                    <td rowspan="3" colspan="20" style="background-color: #d9d9d9">
                        <table style="width: 100%;text-align: center;">
                            <tr>
                                <td ><h1>桃莉斯高端定制</h1></td>
                            </tr>
                            <tr>
                                <td style="vertical-align: middle"><img src="${pageContext.request.contextPath}/assets/image/wx.png" alt="微信二维码" width="100px"/></td>
                            </tr>
                        </table>
                    </td>
                    <td colspan="10">
                        订货单位:
                    </td>
                    <td colspan="20">
                        <input type="text" name="" />
                    </td>
                    <td colspan="6">
                        联系人:
                    </td>
                    <td colspan="10">
                        <input type="text" name="" />
                    </td>
                    <td colspan="6">
                        联系电话:
                    </td>
                    <td colspan="11">
                        <input type="text" name="" />
                    </td>
                    <td colspan="6">
                        QQ:
                    </td>
                    <td colspan="11">
                        <input type="text" name="" />
                    </td>
                </tr>
                <tr>
                    <td colspan="30">
                        收货地址:
                    </td>
                    <td colspan="50">
                        <input type="text" name="" />
                    </td>
                </tr>
                <tr>
                    <td colspan="30">
                        项目名称:
                    </td>
                    <td colspan="50">
                        <input type="text" name="" />
                    </td>
                </tr>
            </div>

            <tr><td colspan="100" style="background-color: #1a1a1a;"></td></tr>

            <div class="OrderCommodityGroup-div">

            </div>
            

            <div class="order-money">
                <tr style="background-color: #8f8f8f">
                    <td colspan="10" style="text-align: right">定金：</td>
                    <td colspan="15">￥200</td>
                    <td colspan="10" style="text-align: right">单面总额（不含税）：</td>
                    <td colspan="15">￥514782</td>
                    <td colspan="10" style="text-align: right">税金：</td>
                    <td colspan="15">￥514782</td>
                    <td colspan="10" style="text-align: right;color: #9d261d">实收额度：</td>
                    <td colspan="15">￥514782</td>
                </tr>
                <tr>
                    <td colspan="20">备注：</td>
                    <td colspan="80">我是关于整张订单的备注。我是关于整张订单的备注。我是关于整张订单的备注。</td>
                </tr>
            </div>

            <tr><td colspan="100" style="background-color: #1a1a1a;"></td></tr>

            <div>
                <tr>
                    <td colspan="50">
                        <table style="width: 100%;text-align: center;font-size: 12px">
                            <tr>
                                <td>
                                    开户行：
                                </td>
                                <td>
                                    平安银行
                                </td>
                                <td >深圳旭飞支行</td>
                            </tr>
                            <tr>
                                <td>卡号：</td>
                                <td colspan="2">6230 5820 0004 9578 464</td>
                            </tr>
                            <tr>
                                <td >
                                    户名：
                                </td>
                                <td colspan="2">
                                    于单
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td colspan="50">
                        <table style="width: 100%;text-align: center;font-size: 12px">
                            <tr>
                                <td>
                                    开户行：
                                </td>
                                <td>
                                    建设银行
                                </td>
                                <td>罗岗支行</td>
                            </tr>
                            <tr>
                                <td>卡号：</td>
                                <td colspan="2">6217 0072 0000 8278 783</td>
                            </tr>
                            <tr>
                                <td>户名：</td>
                                <td colspan="2">于单</td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="25">
                        <strong>微信付款二维码</strong>
                    </td>
                    <td colspan="25">
                        <img src="${pageContext.request.contextPath}/assets/image/wxzf.jpg" alt="微信付款二维码" width="100px"/>
                    </td>
                    <td colspan="25">
                        <strong>支付宝付款二维码</strong>
                    </td>
                    <td colspan="25">
                        <img src="${pageContext.request.contextPath}/assets/image/zfbzf.jpg" alt="支付宝付款二维码" width="100px"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="100" style="text-align: left">
                        <p>
                            1.订货需预交全部货款百分之50为定金<br/>
                            2.发货前请付清全部款.<br/>
                            3.甲方在收到货物时第一时间验货.在货运在场的情况下验清楚货物.如有问题请拍照回传乙方.<br/>
                            4.甲方收到货物如有疑议请在3天内通知乙方.如过期视为默认.<br/>
                        </p>
                    </td>
                </tr>
                <tr>
                    <td colspan="50" style="text-align: left">
                        <br/>
                        <br/>
                        <br/>
                        甲方代表签字：<br/>
                        盖章：<br/>
                        <br/>
                        <br/>
                        <br/>
                    </td>
                    <td colspan="50" style="text-align: left">
                        <br/>
                        <br/>
                        <br/>
                        乙方代表签字：<br/>
                        盖章：<br/>
                        <br/>
                        <br/>
                        <br/>
                    </td>
                </tr>
                <tr>
                    <td colspan="100">
                        联系人：黄先生   手机：187 1856 1573    QQ:2458403068                           地址：深圳市罗湖区展艺路803栋楼尚创意园1楼118
                    </td>
                </tr>
            </div>
        </table>
    </form>
</div>

<script>
    $(function () {
        function addOrderCommodityGroupone() {

        }
    });

</script>

</body>
</html>
