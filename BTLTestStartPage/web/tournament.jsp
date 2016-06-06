<%@ page import="BTTournaments.BTTournament.BTTournament" %>
<%@ page import="BTTournaments.BTMatch.BTPlayersPair" %>
<%@ page import="BTTournaments.BTPlayer.BTPlayer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    BTTournament t = (BTTournament) session.getAttribute("tournament");
    BTTournament tournament = new BTTournament();
    if(t == null) {
        String name = request.getParameter("name");
        String tournamentName = (name == null) ? "no name" : name;
        tournament.setName(tournamentName);
        session.setAttribute("tournament", tournament);
    } else tournament = t;

    if(request.getParameterMap().containsKey("player1name")) {
        String pl1n = request.getParameter("player1name");
        String pl1sn = request.getParameter("player1sname");
        String pl2n = request.getParameter("player2name");
        String pl2sn = request.getParameter("player2sname");
        if(!pl1n.isEmpty() && !pl1sn.isEmpty() && !pl2n.isEmpty() && !pl2sn.isEmpty())
            tournament.addPair(new BTPlayersPair(new BTPlayer(pl1n, pl1sn), new BTPlayer(pl2n, pl2sn)));
    }

%>

<html>
<head>
    <title><%=tournament.getName()%></title>
</head>
<body>

<h1><%=tournament.getName()%></h1>

<form action="tournament.jsp" method="post">
<table border="1">
    <% for (int i = 0; i < tournament.getPairs().size(); i++) {%>
    <tr>
        <td><%=i%></td>
        <td><%=tournament.getPairs().get(i).getPlayer1().getFirstName()%></td>
        <td><%=tournament.getPairs().get(i).getPlayer1().getLastName()%></td>
        <td><%=tournament.getPairs().get(i).getPlayer2().getFirstName()%></td>
        <td><%=tournament.getPairs().get(i).getPlayer2().getLastName()%></td>
    </tr>
    <%}%>


        <tr>
            <td></td>
            <td>
                <input type="text" name="player1name" value=${param[player1name]}>
            </td>
            <td>
                <input type="text" name="player1sname" value=${param[player1sname]}>
            </td>
            <td>
                <input type="text" name="player2name" value=${param[player2name]}>
            </td>
            <td>
                <input type="text" name="player2sname" value=${param[player2sname]}>
            </td>
        </tr>
</table>
    <input type="submit" value="Добавить">
</form>
</body>

</html>










