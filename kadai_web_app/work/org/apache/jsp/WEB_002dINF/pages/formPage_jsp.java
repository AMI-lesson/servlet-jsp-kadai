package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Servlet/JSPの基礎を学ぼう</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>個人情報入力フォーム</h2>\r\n");
      out.write("        <form action=\"");
      out.print( request.getContextPath() );
      out.write("/confirm\" method=\"post\">\r\n");
      out.write("\t        <table>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td>氏名</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"user_name\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td>メールアドレス</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"user_email\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td>住所</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"user_address\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\t            <tr>\r\n");
      out.write("\t                <td>電話番号</td>\r\n");
      out.write("\t                <td>\r\n");
      out.write("\t                    <input type=\"text\" name=\"user_tel\">\r\n");
      out.write("\t                </td>\r\n");
      out.write("\t            </tr>\r\n");
      out.write("\r\n");
      out.write("\t        </table>\r\n");
      out.write("            <input type=\"submit\" value=\"送信\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
