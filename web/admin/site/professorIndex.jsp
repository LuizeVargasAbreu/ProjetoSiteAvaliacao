<%@page import="java.util.List"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="modelo.Professor"%>
<%
    // Pesquisar o nome do professor e lhe entregar sua m�dia geral de avalia��o
    Professor p = new Professor();
    ProfessorDAO dao = new ProfessorDAO();
    List<Professor> lista;
//Verificar se veio algo do filtro, 
//se vier eu filtro pro nome
//caso contr�rio eu trago todos os professores
    if (request.getParameter("txtFiltro") != null && request.getParameter("txtFiltro") != "") {
        String txtFiltro = request.getParameter("txtFiltro");
        lista = dao.listar(txtFiltro);
    } else {
        lista = dao.listar();
    }
%>

<div>
    <h1 class="centro">Professores</h1>
    <form action="professores.jsp" method="post">
        <input type="text" name="txtFiltro" />
        <input type="submit" value="Pesquisar"/><br />
    </form>
    <table>
        <tr>
            <th>M�dia geral</th>

        </tr>
        <%
            for (Professor item : lista) {
        %>
        <tr>
            <td>M�dia geral></td> <%-- preciso calcular --%>
        </tr>
        <%
            }
        %>
    </table>


</div>
</body>
</html>
