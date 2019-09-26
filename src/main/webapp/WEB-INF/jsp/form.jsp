<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Employee Form</title>
</head>
<body>
    <h2>Add New Employee</h2>
    <br/>
    <form:form method="post" modelAttribute="user">
        <table>
            <tr>
                <td>Name</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:password path="password" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Employee"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>