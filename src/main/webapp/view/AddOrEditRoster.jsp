<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
      <title>Bus Driver Management</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
        <h2>${status}</h2>
        <form:form action="./addOrEditRoster" method="POST">
          <form:label path="driver.driverId">Driver Id: </form:label>
          <form:input path="driver.driverId"/>
          <br/>
          <br/>
          <form:label path="busRoute.busRouteId">Bus Route Id:</form:label>
          <form:input path="busRoute.busRouteId"/>
          <br/>
          <br/>
          <form:label path="routeQuantity">Route Quantity:</form:label>
          <form:input path="routeQuantity"/>
          <br/>
          <br/>
          <form:button type="submit">Submit</form:button>
        </form:form>
    </body>
</html>