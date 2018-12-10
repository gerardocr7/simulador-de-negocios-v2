<%@ page import="controller.controladorTipoUsuario" %>
<%
    int idtipoUsuario = 0;
    try {
        idtipoUsuario = Integer.parseInt(request.getParameter("idtipoUsuario"));
    } catch (NumberFormatException e){

    }
    controladorTipoUsuario cc = new controladorTipoUsuario();
    if(cc.eliminarTiposUsuario(idtipoUsuario)){
        response.sendRedirect("tiposusuarios.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>