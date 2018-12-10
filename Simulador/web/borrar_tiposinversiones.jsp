<%@ page import="controller.controladorTiposinversiones" %>
<%
    int idtiposInversiones = 0;
    try {
        idtiposInversiones = Integer.parseInt(request.getParameter("idtiposInversiones"));
    } catch (NumberFormatException e){

    }
    controladorTiposinversiones cc = new controladorTiposinversiones();
    if(cc.eliminarTiposinversiones(idtiposInversiones)){
        response.sendRedirect("tipoinversiones.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>