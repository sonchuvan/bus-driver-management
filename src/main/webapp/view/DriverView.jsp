<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Bus Driver Management</title>
  <script src="<c:url value="/view/js/driver.js" />"></script>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2 class="mb-5">Driver Management</h2>
    <a href="/Bus-driver-management/driver/add">add New</a>
    <input type="text" id="search"/>

    <input type="button" value="Search" onclick="search();"/>
    <table border="1" class="table mt-1 text-center">
        <thead class="thead-dark">
            <tr>
                <th scope="col">DriverId</th>
                <th scope="col">FullName:</th>
                <th scope="col">address</th>
                <th scope="col">Phone</th>
                <th scope="col">Level</th>
                <th colspan="2" scope="col">Option</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${object}" var="obj">
                <tr>
                    <td>${obj.driverId}</td>
                    <td>${obj.fullName}</td>
                    <td>${obj.address}</td>
                    <td>${obj.phone}</td>
                    <td>${obj.level}</td>
                    <td><a href="/Bus-driver-management/driver/edit?id=${obj.driverId}">Edit</a></td>
                    <td><a href="/Bus-driver-management/driver/delete?id=${obj.driverId}" onclick="return confirm('Do you want to delete driver?');">Delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
    </table>
</div>
</body>
</html>