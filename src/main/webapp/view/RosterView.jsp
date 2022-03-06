<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Bus Driver Management</title>
  <script src="<c:url value="/view/js/driver.js" />"></script>
</head>
<body>
<h2>Roster Management</h2>
<a href="/Bus-driver-management/roster/add">add New</a>
<input type="text" id="search"/>

<input type="button" value="Search" onclick="search();"/>
    <table border="1">
            <tr>
                <td>DriverId</td>
                <td>BusRouteId</td>
                <td>Quantity</td>
                <td colspan="2">Option</td>
            </tr>
            <c:forEach items="${object}" var="obj">
                <tr>
                    <td>${obj.driver.driverId}</td>
                    <td>${obj.busRoute.busRouteId}</td>
                    <td>${obj.routeQuantity}</td>
                    <td><a href="/Bus-driver-management/roster/edit?id=${obj.driver.driverId}">Edit</a></td>
                    <td><a href="/Bus-driver-management/roster/delete?id=${obj.driver.driverId}">Delete</a></td>
                </tr>
            </c:forEach>
</body>
</html>