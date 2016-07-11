<%@page import="dao.ProfAvalDAO"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigInteger"%>
<%@page import="modelo.ProfAval"%>
<%@page import="modelo.Professor"%>
<%@include file="cabecalho.jsp"%>
<%
    BigInteger media = new BigInteger("0");
    
    if (request.getParameter("idProfessor") == null) {
        response.sendRedirect("index.jsp");
    } else {
        ProfAvalDAO dao = new ProfAvalDAO();
        Professor prof = new Professor();
        ProfAval profAval = new ProfAval();
        Long idProfessor = Long.parseLong(request.getParameter("idProfessor"));
        media = dao.verMedia(idProfessor);
        
    }
    
    


%>
   <h1 class="centro">Média dos professores</h1>
   Média:<%=media%><br />
  <a href="index.jsp">Voltar para página incial</a>
         
    </body>
</html>
 <%@include file="rodape.jsp"%>
