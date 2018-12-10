package servlet;

import include.TipoUsuario;
import controller.controladorTipoUsuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearTipoUsuario", urlPatterns = {"/creartipoUsuario"})
public class ServletCrearTipoUsuario extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idtipoUsuario = 0;
        try {
            idtipoUsuario = Integer.parseInt(request.getParameter("idtipoUsuario"));

        } catch (NumberFormatException e){

        }
        String nombre = request.getParameter("nombre");

        int no_empresas = 0;
        try {
            no_empresas = Integer.parseInt(request.getParameter("no_empresas"));

        } catch (NumberFormatException e){

        }

        TipoUsuario nuevoTipoUsuario = new TipoUsuario(idtipoUsuario, nombre, no_empresas);

        controladorTipoUsuario ct = new controladorTipoUsuario();
        if(ct.insertTipoUsuario(nuevoTipoUsuario)) {
            response.sendRedirect("tiposusuarios.jsp");
        } else {
            response.sendRedirect("a_tipoUsuario.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
