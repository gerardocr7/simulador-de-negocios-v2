package servlet;
import include.Tiposinversiones;
import controller.controladorTiposinversiones;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearTiposInversiones", urlPatterns = {"/creartipoInversiones"})
public class ServletCrearTiposInversiones extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idtiposInversiones = 0;
        try {
            idtiposInversiones = Integer.parseInt(request.getParameter("idtiposInversiones"));

        } catch (NumberFormatException e){

        }
        String concepto = request.getParameter("concepto");

        Tiposinversiones nuevoTiposinversiones = new Tiposinversiones(idtiposInversiones, concepto );

        controladorTiposinversiones cc = new controladorTiposinversiones();
        if(cc.insertTiposinversiones(nuevoTiposinversiones)) {
            response.sendRedirect("tipoinversiones.jsp");
        } else {
            response.sendRedirect("a_tipoInversion.jsp");
        }


    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
