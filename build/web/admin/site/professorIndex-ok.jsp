<%@page import="dao.ProfAvalDAO"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.math.BigInteger"%>
<%@page import="modelo.ProfAval"%>
<%@page import="modelo.Professor"%>
<%@include file="cabecalho.jsp"%>
<%
    String msg = "";
    BigInteger teste;
    teste= new BigInteger("0");
    

    ProfAvalDAO dao2 = new ProfAvalDAO();
    List<ProfAval> lista2;

    if (request.getParameter("txtFiltro") != null && request.getParameter("txtFiltro") != "") {
        String txtFiltro = request.getParameter("txtFiltro");
        lista2 = dao2.listar(txtFiltro);

    } else {
        lista2 = dao2.listar();
    }

    ProfessorDAO dao = new ProfessorDAO();
    List<Professor> lista;

    if (request.getParameter("txtFiltro") != null && request.getParameter("txtFiltro") != "") {
        String txtFiltro = request.getParameter("txtFiltro");
        lista = dao.listar(txtFiltro);

    } else {
        lista = dao.listar();
    }

    if (request.getParameter("idProfessor") == null) {
        response.sendRedirect("index.jsp");
    } else {

        Professor prof = new Professor();
        ProfAval profAval = new ProfAval();
        Long idProfessor = Long.parseLong(request.getParameter("idProfessor"));

        for (Professor item : lista) {
            for (ProfAval item2 : lista2) {
                if (item.getIdProfessor().equals(idProfessor) && item2.getIdProfessor().equals(idProfessor)) {

                    BigInteger num1 = profAval.getPaResposta1();
                    BigInteger num2 = profAval.getPaResposta2();
                    BigInteger num3 = profAval.getPaResposta3();
                    BigInteger num4 = profAval.getPaResposta4();
                    BigInteger num5 = profAval.getPaResposta5();
                    BigInteger num6 = profAval.getPaResposta6();
                    BigInteger num7 = profAval.getPaResposta7();
                    BigInteger num8 = profAval.getPaResposta8();
                    BigInteger num9 = profAval.getPaResposta9();
                    BigInteger num10 = profAval.getPaResposta10();
                    BigInteger media;
                    media = num1.add(num2).add(num3).add(num4).add(num5).add(num6).add(num7).add(num8).add(num9).add(num10);
                    BigInteger num;
                    BigInteger numero;
                    num = new BigInteger("10");
                    BigInteger media2 = media.divide(num);
                    numero = new BigInteger("2");
                    teste = media2.multiply(numero);
                    
    
                }
            }
        }
    }
    
    


%>
   <h1 class="centro">Média dos professores</h1>
   Média:<%=teste%><br />
  <a href="index.jsp">Voltar para página incial</a>
         
    </body>
</html>
 <%@include file="rodape.jsp"%>
