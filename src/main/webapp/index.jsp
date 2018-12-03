<%@ page import="model.Manager" %><%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/3
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>桃莉斯家纺</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />

</head>
<body>
<%
    Manager manager= (Manager) session.getAttribute("Manager");
%>
<div class="header">

    <div class="dl-title">
        <img src="assets/image/top.png">
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user"><%out.print(manager.getManagername());%></span><a href="" title="退出系统" class="dl-log-quit">[退出]</a><%--todo:退出系统的链接--%>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">商品管理</div></li>
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-order">库存管理</div></li>
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-order">订单管理</div></li>
        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="assets/js/bui-min.js"></script>
<script type="text/javascript" src="assets/js/common/main-min.js"></script>
<script type="text/javascript" src="assets/js/config-min.js"></script>
<script>
    BUI.use('common/main',function(){
        var config = [
            {
                id:'1',
                menu:
                    [
                        {
                            text:'商品管理',
                            items:
                            [
                                {id:'10',text:'查看商品',href:'Node/index.html'},
                                {id:'11',text:'角色管理',href:'Role/index.html'},
                                {id:'12',text:'用户管理',href:'User/index.html'},
                                {id:'13',text:'菜单管理',href:'Menu/index.html'}
                            ]
                        }
                    ]
            },
            {
                id:'2',
                homePage : '9',
                menu:
                    [
                        {
                            text:'业务管理',
                            items:
                            [
                                {id:'20', text:'查询业务', href:'Node/index.html'}
                            ]
                        }
                    ]
            }
        ];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
</body>
</html>
