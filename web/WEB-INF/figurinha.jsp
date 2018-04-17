<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.Figurinha"%>
<%@include file="jspf/header.jspf" %>
<h1>Lista de Figurinhas</h1>
<table class="table table-striped">
    <thead>
        <tr>
            <th scope="col">Nome</th>
        </tr>
    </thead>
    <tbody>
        <%
            for (Figurinha figurinha : (List<Figurinha>)request.getAttribute("figurinhas")) {
        %>
            <tr>
                <td><%=figurinha.getNome()%></td>
            </tr>
        <%
            }
        %>
    </tbody>
</table>
        <a href="index.html" class="btn btn-primary" role="button">Voltar</a>
<%@include file="jspf/footer.jspf" %>