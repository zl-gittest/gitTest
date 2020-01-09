<%--
  Created by IntelliJ IDEA.
  User: 左亮
  Date: 2019/11/26
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/universalTextAcc" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>通用高精度文字识别：</div>
        <input type="file" value="选择文件"  name="huantu1">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>

<form action="${pageContext.request.contextPath}/universalTextReceipt" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>通用票据识别：</div>
        <input type="file" value="选择文件" name="huantu2">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>

<form action="${pageContext.request.contextPath}/universalHandwriting" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>手写文字识别：</div>
        <input type="file" value="选择文件" name="huantu3">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>

<form action="${pageContext.request.contextPath}/universalTextForm" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>表格文字识别：</div>
        <input type="file" value="选择文件" name="huantu4">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>

<form action="${pageContext.request.contextPath}/universalTextTaxiReceipt" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>出租车票识别：</div>
        <input type="file" value="选择文件" name="huantu5">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>

<form action="${pageContext.request.contextPath}/universalTextVatInvoice" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>增值税发票识别：</div>
        <input type="file" value="选择文件" name="huantu6">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>
<form action="${pageContext.request.contextPath}/universalTexttrainTicket" method="post" enctype="multipart/form-data">
    <div class="input-chunk">
        <div>火车票识别：</div>
        <input type="file" value="选择文件" name="huantu7">
        <br>
        <input type="submit" value="上传"><br><br>
    </div>
</form>
</body>
</html>
