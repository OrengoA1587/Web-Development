package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import Calculate.GPACalculator;

public final class calculatorPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>ManagementSystems</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"60; URL=calculatorPage.jsp\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets2/calculatorPage.css\">\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("         \r\n");
      out.write("    </head>\r\n");
      out.write("     \r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("    <nav class=\"navbar navbar-light navbar-expand-lg navigation-clean\">\r\n");
      out.write("        <div class=\"container\"><a class=\"navbar-brand\" href=\"index.jsp\">FTCC Home</a><button data-bs-toggle=\"collapse\" class=\"navbar-toggler\" data-bs-target=\"#navcol-1\"><span class=\"visually-hidden\">Toggle navigation</span><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\">\r\n");
      out.write("                <ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" href=\"https://faytechcc.blackboard.com/\">Blackboard</a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Self Service</a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Third Item</a></li>\r\n");
      out.write("                     \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write(" \r\n");
      out.write("    <div class=\"container-form\" style=\"margin-left:25px; margin-right:25px;\">\r\n");
      out.write("                \r\n");
      out.write("                       <form class=\"form-control-gpa \" id=\"wrapper2\" onclick=\"Calculate()\" >  \r\n");
      out.write("                           <table>\r\n");
      out.write("                               <tbody>\r\n");
      out.write("                                   <tr>\r\n");
      out.write("                                       <td></td> \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Letter Grade</strong>\r\n");
      out.write("                                       </td>\r\n");
      out.write("                                       <td></td> \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Letter Grade</strong>\r\n");
      out.write("                                       </td>      \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row1Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row1Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row2Letter\" name=\"row2Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row2Credits\" name=\"row2Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row3Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row3Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row4Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row4Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row5Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row5Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row6Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row6Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row7Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row7Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                   <tr>                                       \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <strong>Class1</strong>\r\n");
      out.write("                                       </td>                                        \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select\" id=\"row8Letter\" name=\"row1Letter\">\r\n");
      out.write("                                                <optgroup label=\"Letter Grade\">\r\n");
      out.write("                                                    <option value=\"0\" ></option>\r\n");
      out.write("                                                    <option value=\"4\">A</option>\r\n");
      out.write("                                                    <option value=\"3\">B</option>\r\n");
      out.write("                                                    <option value=\"2\">C</option>\r\n");
      out.write("                                                    <option value=\"1\">D</option>\r\n");
      out.write("                                                    <option value=\"0\">F</option>\r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>                                         \r\n");
      out.write("                                       <td width=\"24%\" align=\"center\" valign=\"bottom\">\r\n");
      out.write("                                           <select class=\"form-select2\" id=\"row8Credits\" name=\"row1Credits\" >\r\n");
      out.write("                                                <optgroup label=\"Credits\">\r\n");
      out.write("                                                    <option value=\"0\" selected=\"\">0</option>\r\n");
      out.write("                                                    <option value=\"1\">1</option>\r\n");
      out.write("                                                    <option value=\"2\">2</option>\r\n");
      out.write("                                                    <option value=\"3\">3</option>\r\n");
      out.write("                                                    <option value=\"4\">4</option>                        \r\n");
      out.write("                                                </optgroup>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                       </td>  \r\n");
      out.write("                                   </tr>\r\n");
      out.write("                                </tbody>                               \r\n");
      out.write("                           </table>\r\n");
      out.write("                            <div class=\"d-lg-flex align-items-lg-center \"><input class=\"submit-btn\" type=\"submit\" value=\"Reset\">\r\n");
      out.write("                               <label class=\"form-label\">GPA Score</label>           \r\n");
      out.write("                               <input id=\"gpaScore\" class=\"gpa-input\" type=\"text\" name=\"gpaScore\" placeholder=\"0.0\" readonly=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"table-explanantion\">\r\n");
      out.write("                                <table class=\"table-ex table-bordered\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th>Grade</th>\r\n");
      out.write("                                            <th>Grade Points</th>\r\n");
      out.write("                                            <th>Explanation</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>A</td>\r\n");
      out.write("                                            <td>4</td>\r\n");
      out.write("                                            <td>Excellent</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>B</td>\r\n");
      out.write("                                            <td>3</td>\r\n");
      out.write("                                            <td>Very Good</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>C</td>\r\n");
      out.write("                                            <td>2</td>\r\n");
      out.write("                                            <td>Satisfactory</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>D</td>\r\n");
      out.write("                                            <td>1</td>\r\n");
      out.write("                                            <td>Poor</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td>F</td>\r\n");
      out.write("                                            <td>0</td>\r\n");
      out.write("                                            <td>Failing</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                        <tr></tr>\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("              \r\n");
      out.write("                                 \r\n");
      out.write("               \r\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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