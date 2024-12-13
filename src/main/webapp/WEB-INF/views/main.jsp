<%--
  Created by IntelliJ IDEA.
  User: pnikita
  Date: 13.12.2024
  Time: 08:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored = "false"%>
<html>
<head>
    <title>List of equipment</title>
</head>
<body>
    <div>
        <ul>
            <c:forEach var="equip" items="${equipment}">
                <li onclick="location.href='/info/${equip.getId()}'">
                    <p><b>Имя: ${equip.getName()}</b>, возраст: ${equip.getAge()}</p>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
