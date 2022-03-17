<!DOCTYPE html>
<html lang="en" >
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta charset="UTF-8">
    <title>Customer</title>
</head>
<body>
<div align="center">
    <h1>Customer manager</h1>
    <form method="get" action="#">
        <input type="text" name="keyword">
        <input type="submit" value="Search">
    </form>
    <table border="1">
        <tr>
            <th >Id</th>
            <th>Name</th>
            <th>E-mail</th>
            <th>Adress</th>
            <th>Action</th>
        </tr>
        <c:forEach var="custom" items="${customer}">
            <tr>
                <td>${custom.id}</td>
                <td>${custom.name}</td>
                <td>${custom.email}</td>
                <td>${custom.adress}</td>
            </tr>

        </c:forEach>
    </table>
</div>
</body>
</html>