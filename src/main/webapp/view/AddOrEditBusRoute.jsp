<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
      <title>Bus Driver Management</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
      <script src='<c:url value="/view/js/AddOrEditBusRoute.js" />'></script>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h2 class="mb-5">${status}</h2>
            <form:form action="./addOrEditBusRoute" method="POST">
                <div class="form-group">
                    <form:label path="busRouteId">Bus Route Id: </form:label>
                    <form:input path="busRouteId" readonly="true" class="form-control col-6"/>
                </div>
                <div class="form-group">
                    <form:label path="range">Range</form:label>
                    <form:input path="range" class="form-control col-6"/>
                    <label id="validRange" class="valid"></label>
                </div>
                <div class="form-group"
                    <form:label path="numberOfStops">Number of stops</form:label>
                    <form:input path="numberOfStops" class="form-control col-6"/>
                    <label id="validNumberOfStop" class="valid"></label>
                </div>
                <form:button id="submit" type="submit" class="btn btn-primary">Submit</form:button>
            </form:form>
        </div>
    </body>
</html>