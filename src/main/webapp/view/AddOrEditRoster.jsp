<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
      <title>Bus Driver Management</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h2 class="mb-5">${status}</h2>
            <form:form action="./addOrEditRoster" method="POST">
                <div class="from-group">
                    <form:label path="driver.driverId">Driver Id </form:label>
                      <form:select path="driver.driverId" class="form-control col-6">
                        <form:option value="0" label="Select driver id"/>
                        <form:options items="${driverIdList}"/>
                      </form:select>
                  </div>
                  <div class="from-group">
                  <form:label path="busRoute.busRouteId">BusRoute Id </form:label>
                    <form:select path="busRoute.busRouteId" class="form-control col-6">
                      <form:option value="0" label="Select busRoute id"/>
                      <form:options items="${busRouteIdList}"/>
                    </form:select>
                  </div>
                  <div class="from-group">
                      <form:label path="routeQuantity">Route Quantity:</form:label>
                      <form:input path="routeQuantity"  class="form-control col-6"/>
                  </div>
                  <br/>
                  <form:button type="submit" class="btn btn-primary">Submit</form:button>
            </form:form>
        </div>
    </body>
</html>