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
        <h2 class="mb-5">Roster Management</h2>
        <a href="/Bus-driver-management/roster/add">add New</a>
        <input type="text" id="search"/>

        <input type="button" value="Search" onclick="search();"/>
        <table border="1" class="table mt-1 text-center">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">DriverId</th>
                    <th scope="col">BusRouteId</th>
                    <th scope="col">Quantity</th>
                    <th scope="col" colspan="2">Option</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${object}" var="obj">
                    <tr>
                        <td>${obj.driver.driverId}</td>
                        <td>${obj.busRoute.busRouteId}</td>
                        <td>${obj.routeQuantity}</td>
                        <td><a href="/Bus-driver-management/roster/edit?driverId=${obj.driver.driverId}&busRouteId=${obj.busRoute.busRouteId}">Edit</a></td>
                        <td><a href="/Bus-driver-management/roster/delete?driverId=${obj.driver.driverId}&busRouteId=${obj.busRoute.busRouteId}" onclick="return confirm('Do you want to delete?');">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>