package servlet;
import controller.controladorTipoUsuario;
import include.TipoUsuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarTipoUsuario", urlPatterns = {"/modificarTipoUsuario"})
public class ServletModificarTipoUsuario extends HttpServlet {
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

        controladorTipoUsuario cc = new controladorTipoUsuario();
        if(cc.actualizarTiposUsuario(nuevoTipoUsuario)) {
            response.sendRedirect("tiposusuarios.jsp");
        } else {
            response.sendRedirect("m_tipousuario.jsp?clave=" + idtipoUsuario);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
