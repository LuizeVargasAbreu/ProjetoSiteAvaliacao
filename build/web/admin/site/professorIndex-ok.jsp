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
        BigInteger num4 = profAval.getPaResposta4();
        BigInteger num5 = profAval.getPaResposta5();
        BigInteger num6 = profAval.getPaResposta6();
        BigInteger num7 = profAval.getPaResposta7();
        BigInteger num8 = profAval.getPaResposta8();
        BigInteger num9 = profAval.getPaResposta9();
        BigInteger num10 = profAval.getPaResposta10();
    
      
        BigInteger media = num1.add (num2).add (num3).add (num4).add (num5).add (num6).add (num7).add (num8).add (num9).add (num10);
        BigInteger num;
        BigInteger numm;
        num = new BigInteger("10");
        BigInteger media2 = media.divide(num); 
        numm = new BigInteger("2");
        BigInteger media3 = media2.multiply(numm); 
        System.out.println(media3);
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
