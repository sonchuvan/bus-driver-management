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
        <form:form action="./addOrEditBusRoute" method="POST">
          <form:label path="busRouteId">Bus Route Id: </form:label>
          <form:input path="busRouteId" readonly="true"/>
          <br/>
          <br/>
          <form:label path="range">Range</form:label>
          <form:input path="range"/>
          <br/>
          <br/>
          <form:label path="numberOfStops">Number of stops</form:label>
          <form:input path="numberOfStops"/>
          <br/>
          <br/>
          <form:button type="submit">Submit</form:button>
        </form:form>
    </body>
</html>