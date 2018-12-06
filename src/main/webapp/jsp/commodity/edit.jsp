<%--
  Created by IntelliJ IDEA.
  User: starr
  Date: 2018/12/3
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        //判断浏览器是否支持FileReader接口
        if (typeof FileReader == 'undefined') {
            document.getElementById("xmTanDiv").InnerHTML = "<h1>当前浏览器不支持FileReader接口</h1>";
            //使选择控件不可操作
            document.getElementById("xdaTanFileImg").setAttribute("disabled", "disabled");
        }

        //选择图片，马上预览
        function xmTanUploadImg(obj) {
            var file = obj.files[0];

            console.log(obj);console.log(file);
            console.log("file.size = " + file.size);  //file.size 单位为byte

            var reader = new FileReader();

            //读取文件过程方法
            reader.onloadstart = function (e) {
                console.log("开始读取....");
            }
            reader.onprogress = function (e) {
                console.log("正在读取中....");
            }
            reader.onabort = function (e) {
                console.log("中断读取....");
            }
            reader.onerror = function (e) {
                console.log("读取异常....");
            }
            reader.onload = function (e) {
                console.log("成功读取....");

                var img = document.getElementById("xmTanImg");
                img.src = e.target.result;
                //或者 img.src = this.result;  //e.target == this
            }

            reader.readAsDataURL(file)
        }

    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/addCommodity" method="post">
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
                <input type="file" name="picture" id="xdaTanFileImg" onchange="xmTanUploadImg(this)" accept="image/*"/>
            </td>
            <td>
                <img id="xmTanImg"/>
                <div id="xmTanDiv"></div>
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
