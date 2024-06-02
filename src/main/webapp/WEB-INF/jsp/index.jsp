<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <title>All Employees</title>
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body>
        <br>
        <b>All employees</b>
        <br><br>
        <table class = "table">
            <tr>
                <th>Id</th>
                <th>First name</th>
                <th>Last name</th>
                <th>Salary</th>
            </tr>
            <c:forEach var = "employee" items = "${employees}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.firstName}</td>
                    <td>${employee.lastName}</td>
                    <td>${employee.salary}</td>
                </tr>
            </c:forEach>
        </table>
    </body>

</html>
