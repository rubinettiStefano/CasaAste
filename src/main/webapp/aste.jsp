<%--
  Created by IntelliJ IDEA.
  User: rubin
  Date: 28/11/2024
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String nom =  (String)request.getAttribute("nominativo");
%>
<html>
<head>
    <title>Aste</title>

</head>
<body>
    <h1>CIAO SONO LA PAGINA ASTE</h1>
    <form action="aste?ciao=paperino" method="post">
        <input type="text" name="nominativo" placeholder="nominativo" />
        <input type="number" name="soldi" placeholder="soldi" />
        <input type="submit" value="VAI" />
    </form>

    <%if(nom!=null) {%>
        BENVENUTO <%=nom%>
    <% }%>
</body>
</html>
