<%--
  Created by IntelliJ IDEA.
  User: pnikita
  Date: 13.12.2024
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
    <p>Название: ${equipment.getName()}</p>
    <p>Параметры: ${equipment.getParams()}</p>
    <p>Возраст: ${equipment.getAge()}</p>
    <p>Условия: ${equipment.getConditions()}</p>
</body>
</html>
