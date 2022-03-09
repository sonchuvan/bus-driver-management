<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Bus-driver-management</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1 class="mb-3">Bus-driver-management</h1>
        <h2 class="mb-3">Hello ${message}</h2>
        <h3 class="mb-3">Menu</h3>

        <a href="/Bus-driver-management/driver" style="margin-right:30px">Quản lý tài xế</a>
        <a href="/Bus-driver-management/busRoute" style="margin-right:30px">Quản lý tuyến bus</a>
        <a href="/Bus-driver-management/roster" style="margin-right:30px">Quản lý phân công lái xe</a>
    </div>
</body>
</html>