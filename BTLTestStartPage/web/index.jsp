<%@ page import="BTTournaments.BTTournament.BTTournament" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Welcome to BeachTennis League Site</title>
  </head>

  <body>
<% session.removeAttribute("tournament");%>
  <form action="tournament.jsp" method="post">
      <label>
          Название: <input type="text" name="name" value="${param["name"]}"/>
      </label>

      <input type="submit" value="Создать">
  </form>

  </body>
</html>
