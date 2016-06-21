<%@ page import="model.Player" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    ArrayList<Player> players = (ArrayList<Player>) request.getAttribute("players");
%>


<html>
<head>
    <title>Welcome to BTLeague</title>
</head>

<body style="width: 80%; margin-left: 10%; height: 95%">
    <%@include file="header.jsp"%>
    <div id = "left_side">
        Im left side
    </div>

    <div id = "main_form">
        <div class="list-group">
            <%
                for (Player pl : players) {%>
                    <a href="/showplayer?id=<%=pl.getPlayer_ID()%>" class="list-group-item list-group-item-success">
                        <%=pl.getFirstName()%>
                        <%=pl.getLastName()%>
                        <%=pl.getCity()%>
                        <%=pl.getAge()%>
                    </a>
                <%}
            %>
        </div>
    </div>

    <div id = "right_side">
        Im right_side
    </div>

    <div id = "bottom">
        Im bottom
    </div>

</body>
</html>
