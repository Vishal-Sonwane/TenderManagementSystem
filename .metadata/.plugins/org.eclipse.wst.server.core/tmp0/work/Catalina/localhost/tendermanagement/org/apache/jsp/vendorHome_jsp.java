/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-17 09:45:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.hit.utility.DBUtil;
import javax.servlet.annotation.WebServlet;

public final class vendorHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.annotation.WebServlet");
    _jspx_imports_classes.add("com.hit.utility.DBUtil");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"errorpage.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"images/logo.png\">\r\n");
      out.write("    <!--link rel=\"shortcut icon\" type=\"image/ico\" href=\"images/hit_fevicon.ico\"-->\r\n");
      out.write("	\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Tender Management System</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/annimate.css\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/SpryTabbedPanels.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--link rel=\"stylesheet\" href=\"css/styles.css\"-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Black+Ops+One\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/bootstrap-dropdownhover.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style2.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

		String user = (String)session.getAttribute("user");
		String uname = (String)session.getAttribute("username");
		String pword = (String)session.getAttribute("password");
		
		if(!user.equalsIgnoreCase("user") || uname.equals("") || pword.equals("")){
			
			response.sendRedirect("loginFailed.jsp");
			
		}
	
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- Including the header of the page  -->\r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "vendorMenu.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"clearfix hidden-sm hidden-xs\" style=\"color:white;background-color: green; margin-top:-15px; margin-bottom: 12px\"><marquee>Welcome to Tender Management System</marquee>\r\n");
      out.write(" </div> <!--A green color line between header and body part-->\r\n");
      out.write(" \r\n");
      out.write("     <div class=\"container-fluid\">\r\n");
      out.write("     \r\n");
      out.write("     	<div class=\"notice\">\r\n");
      out.write("        <div class=\"col-md-3\"style=\"margin-left:2%\">\r\n");
      out.write("     		");
 Connection con = DBUtil.provideConnection(); 
      out.write("\r\n");
      out.write("     		\r\n");
      out.write("     		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "notice.jsp", out, false);
      out.write("<br>\r\n");
      out.write("     		\r\n");
      out.write("          <!-- Next marquee starting-->\r\n");
      out.write("          ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "approved.jsp", out, false);
      out.write("<br>\r\n");
      out.write("          \r\n");
      out.write("        </div>  <!-- End of col-md-3-->\r\n");
      out.write("      </div> <!-- End of notice class-->\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <!-- Next part of same container-fluid in which galary or other information will be shown-->\r\n");
      out.write("      \r\n");
      out.write("          \r\n");
      out.write("   <div class=\"col-md-8\">\r\n");
      out.write("    <div class=\"marquee\" style=\"border:2px black hidden; background-color:white\">\r\n");
      out.write("        <h4 style=\"background-color:black; margin-top:-1.8px; margin-bottom:1px;padding: 5px; text-align: center;color:red;font-weight:bold\">\r\n");
      out.write("        &nbsp; <span id=\"pagetitle\">VENDOR ACCOUNT</span></h4><!-- pagetitle id is given here -->\r\n");
      out.write("        <div class=\"marquee-content\" style=\"align:center; padding-top:200px;min-height:750px;background-color:cyan\">\r\n");
      out.write("     		<h1><center>Hey Dude! Welcome to Our Tender Management system</center></h1>\r\n");
      out.write("     		<h2><center>Here You can manage your tenders,view tenders and bid for tenders according to their deadline and base price</center></h2>\r\n");
      out.write("     		<h3><center>Go on the about menu section links to explore the site</center></h3>\r\n");
      out.write("     		<h3><center>You can also update your profile, change password and can explore many more things!</center></h3>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("     <a><h1></h1></a>\r\n");
      out.write("      \r\n");
      out.write("    </div> <!-- End of container-fluid-->\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!-- <div class=\"container\" style=\"height:300px\">\r\n");
      out.write("	ucomment this if you want to add some space in the lower part of page\r\n");
      out.write("	</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Now from here the footer section starts-->\r\n");
      out.write("                      \r\n");
      out.write("<!-- Including the footer of the page -->\r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
