package servlet;

import controller.controladorTiposinversiones;
import include.Tiposinversiones;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarTiposInversiones", urlPatterns = {"/modificarTipoInversiones"})
public class ServletModificarTiposInversiones extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idtiposInversiones = 0;
        try {
            idtiposInversiones = Integer.parseInt(request.getParameter("idtiposInversiones"));
        } catch (NumberFormatException e){

        }

        String concepto = request.getParameter("concepto");

        Tiposinversiones nuevoTiposInversiones = new Tiposinversiones(idtiposInversiones, concepto);

        controladorTiposinversiones cc = new controladorTiposinversiones();
        if(cc.actualizarTiposinversiones(nuevoTiposInversiones)) {
            response.sendRedirect("tipoinversiones.jsp");
        } else {
            response.sendRedirect("m_tipoinversiones.jsp?clave=" + idtiposInversiones);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
