<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
        <form:form method="POST"
          action="/spring-mvc-xml/addEmployee" modelAttribute="employee">
             <table>
                <tr>
                    <td>Name</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>Id</td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><form:input path="contactNumber"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>