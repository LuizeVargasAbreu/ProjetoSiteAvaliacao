<%@page import="java.math.BigInteger"%>
<%@page import="modelo.ProfAval"%>
<%@page import="modelo.Professor"%>
<%
    if(request.getParameter("idProfessor") == null)
    {
        response.sendRedirect("index.jsp");
    }
    else 
    {
        Professor prof = new Professor();
        ProfAval profAval = new ProfAval();
        Long idProfessor = Long.parseLong(request.getParameter("idProfessor"));
        
        if(prof.getIdProfessor()== idProfessor)
        {
            BigInteger num1 = profAval.getPaResposta1();
            BigInteger num2 = profAval.getPaResposta2();
            BigInteger num3 = profAval.getPaResposta3();
           
            BigInteger teste = new BigInteger("100");
            System.out.println(teste);
        //     System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        }
        ;
        
    }
    
    
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
