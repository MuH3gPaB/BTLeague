<%--
  Created by IntelliJ IDEA.
  User: Muxa
  Date: 20.06.2016
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New player</title>
</head>
<body>
    <form name="newPlayer" action="/editplayer">
        <label>Имя : </label><input type="text" name="name">
        <br><br><br>
        <label>Фамилия : </label><input type="text" name="surname">
        <br><br><br>
        <input type="submit" value="Добавить">
    </form>
</body>
</html>
