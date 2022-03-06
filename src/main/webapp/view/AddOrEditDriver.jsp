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
        <form:form action="./addOrEdit" method="POST">
          <form:label path="driverId">Driver Id: </form:label>
          <form:input path="driverId" readonly="true"/>
          <br/>
          <br/>
          <form:label path="fullName">Full Name: </form:label>
          <form:input path="fullName"/>
          <br/>
          <br/>
          <form:label path="address">address: </form:label>
          <form:input path="address"/>
          <br/>
          <br/>
          <form:label path="phone">Phone: </form:label>
          <form:input path="phone"/>
          <br/>
          <br/>
          <form:label path="level">Level: </form:label>
          <form:select path="level">
            <form:option value="0" label="Select"/>
            <%--    levelList này được lấy ngay tại HelloController, hàm getLevelList()    --%>
            <form:options items="${levelList}"/>
          </form:select>
          <br/>
          <br/>
          <form:button type="submit">Submit</form:button>
        </form:form>
    </body>
</html>