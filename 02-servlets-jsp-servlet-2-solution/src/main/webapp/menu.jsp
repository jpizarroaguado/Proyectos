<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% String url=getServletContext().getContextPath(); %>
</head>
<body>
	<div id="menu">
    		<ul>
            <li><a href="<%=url%>/temporal.jsp"">Citas</a></li>
            <li><a href="<%=url%>/ServletUsuario?list=lista">Administraci&oacute;n</a></li>
            <li><a href="<%=url%>/ServletTrabajador?list=lista">Trabajadores</a></li>
            </ul>
   	</div>
</body>
</html>