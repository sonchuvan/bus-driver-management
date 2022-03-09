<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
      <title>Bus Driver Management</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
      <script src='<c:url value="/view/js/AddOrEditDriver.js" />'></script>
      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h2 class="mb-5">${status}</h2>
            <form:form action="./addOrEdit" method="POST">
                <div class="form-group">
                    <form:label path="driverId">Driver Id: </form:label>
                    <form:input path="driverId" readonly="true" class="form-control col-6"/>
                </div>
                <div class="form-group">
                    <form:label path="fullName">Full Name: </form:label>
                    <form:input path="fullName" class="form-control col-6"/>
                    <label id="validName" class="valid"></label>
                </div>
                <div class="form-group">
                    <form:label path="address">address: </form:label>
                    <form:input path="address" class="form-control col-6"/>
                    <label id="validAddress" class="valid"></label>
                </div>
                <div class="form-group">
                    <form:label path="phone">Phone: </form:label>
                    <form:input path="phone" class="form-control col-6"/>
                    <label id="validPhone" class="valid"></label>
                </div>
                <div class="form-group">
                    <form:label path="level">Level: </form:label>
                    <form:select path="level" class="form-control col-6">
                        <form:option value="0" label="Select"/>
                        <%--    levelList này được lấy ngay tại HelloController, hàm getLevelList()    --%>
                        <form:options items="${levelList}"/>
                    </form:select>
                    <label id="validLevel" class="valid"></label>
                </div>
                <br/>
                <form:button id="submit" type="submit" class="btn btn-primary">Submit</form:button>
            </form:form>
        </div>
    </body>
</html>