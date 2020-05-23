<%@ page contentType="text/html;charset=UTF-8" language="java"
%>
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
+ path + "/";


<html>
<head>
    <title>Title</title>
</head>
<body>
服务开启成功！
</br>

<script type="text/javascript">document.write(new Date())</script>
</body>
</html>
