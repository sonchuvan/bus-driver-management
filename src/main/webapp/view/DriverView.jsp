<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Bus Driver Management</title>
</head>
<body>
<h2>Driver Management</h2>
<h3>Menu</h3>
<a href="/Bus-driver-management/driver/add">add New</a>
    <table border="1">
            <tr>
                <td>DriverId</td>
                <td>FullName:</td>
                <td>address</td>
                <td>Phone</td>
                <td>Level</td>
                <td colspan="2">Option</td>
            </tr>
            <c:forEach items="${object}" var="obj">
                <tr>
                    <td>${obj.driverId}</td>
                    <td>${obj.fullName}</td>
                    <td>${obj.address}</td>
                    <td>${obj.phone}</td>
                    <td>${obj.level}</td>
                    <td><a href="/Bus-driver-management/driver/edit?id=${obj.driverId}">Edit</a></td>
                    <td><a href="/Bus-driver-management/driver/delete?id=${obj.driverId}">Delete</a></td>
                </tr>
            </c:forEach>
</body>
</html>