<%--
  Created by IntelliJ IDEA.
  User: johntoan98gmail.com
  Date: 09/08/2023
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/products/edit" method="post">
        <input name="id" value="${product.id}"><br>
        <input name="name" value="${product.name}"><br>
        <input name="price" value="${product.price}"><br>
        <input name="img" value="${product.img}"><br>
        <button type="submit">Edit</button>
    </form>
</div>
</body>
</html>
