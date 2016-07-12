package org.apache.jsp.admin.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.QuestionarioDAO;
import modelo.Questionario;
import java.math.BigDecimal;
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

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/site/cabecalho.jsp");
    _jspx_dependants.add("/admin/site/rodape.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SB Admin 2 - Bootstrap Admin Theme</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS -->\r\n");
      out.write("        <link href=\"../bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- MetisMenu CSS -->\r\n");
      out.write("        <link href=\"../bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"../dist/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom Fonts -->\r\n");
      out.write("        <link href=\"../bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Navigation -->\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.dropdown-alerts -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- /.dropdown -->\r\n");
      out.write("                     <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i>  <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"loginUsuario.jsp\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-user -->\r\n");
      out.write("                </li>\r\n");
      out.write("   \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("                    <!-- /.navbar-top-links -->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                        <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                            <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                                <li class=\"sidebar-search\">\r\n");
      out.write("                                    <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("                                        <span class=\"input-group-btn\">\r\n");
      out.write("                                            <button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("                                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- /input-group -->\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"index.jsp\"><i class=\"fa fa-dashboard fa-fw\"></i> Menu de início</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i>Clique aqui<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"professorIndex.jsp\">Média Professores</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"monitorIndex.jsp\">Média Monitores</a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"#\">Clique aqui <span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                            <ul class=\"nav nav-third-level\">\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"professorQuestionario.jsp\">Questionário professor</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"monitorQuestionario.jsp\">Questionário monitor</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                                <li>\r\n");
      out.write("                                                    <a href=\"index.jsp\">Index</a>\r\n");
      out.write("                                                </li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                            <!-- /.nav-third-level -->\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <!-- /.nav-second-level -->\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- /.sidebar-collapse -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.navbar-static-side -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');

    String p1="", p2="", p3="", p4="", p5="", p6="", p7="",p8="", p9="", p10="";
    BigDecimal media = BigDecimal.ZERO;
    BigDecimal media1 = BigDecimal.ZERO;
    BigDecimal media2 = BigDecimal.ZERO;
    BigDecimal media3 = BigDecimal.ZERO;
    BigDecimal media4 = BigDecimal.ZERO;
    BigDecimal media5 = BigDecimal.ZERO;
    BigDecimal media6 = BigDecimal.ZERO;
    BigDecimal media7 = BigDecimal.ZERO;
    BigDecimal media8 = BigDecimal.ZERO;
    BigDecimal media9 = BigDecimal.ZERO;
    BigDecimal media10 = BigDecimal.ZERO;
    
    
    if (request.getParameter("idProfessor") == null) {
        response.sendRedirect("index.jsp");
    } else {
        ProfAvalDAO dao = new ProfAvalDAO();
        Professor prof = new Professor();
        ProfAval profAval = new ProfAval();
        Questionario q;
        QuestionarioDAO qdao = new QuestionarioDAO();

        List<Questionario> qList = qdao.listar();

        q = qList.get(1);
        
        Long idProfessor = Long.parseLong(request.getParameter("idProfessor"));
        media = dao.verMedia(idProfessor);
        media1 = dao.verMedia1(idProfessor);
        media2 = dao.verMedia2(idProfessor);
        media3 = dao.verMedia3(idProfessor);
        media4 = dao.verMedia4(idProfessor);
        media5 = dao.verMedia5(idProfessor);
        media6 = dao.verMedia6(idProfessor);
        media7 = dao.verMedia7(idProfessor);
        media8 = dao.verMedia8(idProfessor);
        media9= dao.verMedia9(idProfessor);
        media10 = dao.verMedia10(idProfessor);
        p1 = qList.get(1).getPergunta1();
        /*
     //   p1 =profAval.getIdQuestionario().getPergunta1();
      //  p2 =profAval.getIdQuestionario().getPergunta2();
        p3 =profAval.getIdQuestionario().getPergunta3();
        p4 =profAval.getIdQuestionario().getPergunta4();
        p5 =profAval.getIdQuestionario().getPergunta5();
        p6 =profAval.getIdQuestionario().getPergunta6();
        p7 =profAval.getIdQuestionario().getPergunta7();
        p8 =profAval.getIdQuestionario().getPergunta8();
        p9 =profAval.getIdQuestionario().getPergunta9();
        p10 =profAval.getIdQuestionario().getPergunta10();
*/
        
   //     double num = media.doubleValue();
        
        
    }
    
    



      out.write("\r\n");
      out.write("   <h1 class=\"centro\">Média dos professores</h1>\r\n");
      out.write("   <h4>As notas estão de base 5, onde Ruim = 1 e Excelente = 5</h4>\r\n");
      out.write("   Média geral: ");
      out.print(media);
      out.write("<br />\r\n");
      out.write("   Média da pergunta \"");
      out.print(p1);
      out.write("\": <br />\r\n");
      out.write("   ");
      out.print(media1);
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("   <br />\r\n");
      out.write("  <a href=\"index.jsp\">Voltar para página incial</a>\r\n");
      out.write("         \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery -->\r\n");
      out.write("    <script src=\"../bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"../bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("    <script src=\"../bower_components/metisMenu/dist/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Theme JavaScript -->\r\n");
      out.write("    <script src=\"../dist/js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
