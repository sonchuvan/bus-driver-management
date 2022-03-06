<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Bus Driver Management</title>
  <script src="<c:url value="/view/js/driver.js" />"></script>
</head>
<body>
<h2>Driver Management</h2>
<a href="/Bus-driver-management/busRoute/add">add New</a>
<input type="text" id="search"/>

<input type="button" value="Search" onclick="search();"/>
    <table border="1">
            <tr>
                <td>BusRouteId</td>
                <td>Range</td>
                <td>Stop numer</td>
                <td colspan="2">Option</td>
            </tr>
            <c:forEach items="${object}" var="obj">
                <tr>
                    <td>${obj.busRouteId}</td>
                    <td>${obj.range}</td>
                    <td>${obj.numberOfStops}</td>
                    <td><a href="/Bus-driver-management/busRoute/edit?id=${obj.busRouteId}">Edit</a></td>
                    <td><a href="/Bus-driver-management/busRoute/delete?id=${obj.busRouteId}">Delete</a></td>
                </tr>
            </c:forEach>
</body>
</html>