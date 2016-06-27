<%@ page import="config.PlayerEntityFields" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    HashMap<String, String> fields = (HashMap) request.getSession().getAttribute("playerFields");
%>

<html>
<head>
    <title>Edit player</title>
</head>


<body style="width: 80%; margin-left: 10%; height: 95%">
<%@include file="header.jsp"%>
<div id = "left_side">
    Im left side
</div>

<div id = "main_form">
    <ul class="list-group">
        <form name="edit_player_form" id="edit_player_form" action="/saveplayer">
            <%
                for (int i = 0; i < PlayerEntityFields.fields.length; i++) {%>
            <li class="list-group-item list-group-item-success">
                <%=PlayerEntityFields.fields[i]%>
                <%if((fields != null) &&
                        (fields.get(PlayerEntityFields.fields[i]) != null)){%>
                <input type="text" name="<%=PlayerEntityFields.fieldsNames[i]%>"
                                  value="<%=fields.get(PlayerEntityFields.fields[i])%>"/>

                <%}
                else { %>
                <input type="text" name="<%=PlayerEntityFields.fieldsNames[i]%>"/>
                <%}%>
            </li>
            <%}
            %>
        </form>
    </ul>
</div>

<div id = "right_side">
    <div style="width: 100%" class="btn-group-vertical" role="group" aria-label="...">
            <button style="width: inherit"
                    type="submit" value="save"
                    class="btn btn-default" form="edit_player_form">Сохранить</button>
            <button style="width: inherit"
                    type="button" value="back"
                    class="btn btn-default" onclick='window.location = "/players"'>Назад</button>
    </div>
</div>

<div id = "bottom">
    Im bottom
</div>

</body>
</html>
