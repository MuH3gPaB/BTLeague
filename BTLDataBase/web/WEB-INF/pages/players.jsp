<%@ page import="model.Player" %>
<%@ page import="java.util.ArrayList" %>

<%
  ArrayList<Player> players = (ArrayList<Player>) request.getAttribute("players");
%>

<script scr="/static/resources/scripts/jquery-3.0.0.min.js"/>

<script type="text/javascript">
    function deletePlayer()
    {
        var playerChoice = $("input[type=radio]:checked");
        var id = playerChoice.val();
    }

</script>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Players list</title>
      <%@include file="header.jsp"%>
  </head>



  <body>




  <form name="pllist" action="/deleteplayer">
    <%for(Player pl:players){%>
       <table>
         <td>
             <input type="radio" name="radio">
             <%=pl.getFirstName()%>
             <%=pl.getLastName()%>
            </td>
       </table>
      <%}%>
      <input type="submit" name="delete" value="Удалить">
  </form>
  </body>
</html>
