package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ProfAvalDAO;
import dao.ProfessorDAO;
import java.util.List;
import java.math.BigInteger;
import modelo.ProfAval;
import modelo.Professor;

public final class professorIndex_002dok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


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
                    BigInteger numm;
                    num = new BigInteger("10");
                    BigInteger media2 = media.divide(num);
                    numm = new BigInteger("2");
                    BigInteger media3 = media2.multiply(numm);
                    System.out.println(media3);
                }
            }
        }
    }



      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
