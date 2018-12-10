<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.TipoUsuario" %>
<%@ page import="controller.controladorTipoUsuario" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>TiposCursos</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_tipoUsuario.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>IDTIPOUSUARIO</th>
                    <th>NOMBRE</th>
                    <th>NOEMPRESAS</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorTipoUsuario cc = new controladorTipoUsuario();
                    int contador = 0;
                    ArrayList<TipoUsuario> tipousuario = new ArrayList<TipoUsuario>();
                    tipousuario = cc.obtenerTiposUsuarios();
                    if(tipousuario.size() > 0){
                        for(int a=0; a<tipousuario.size();a++){
                            htmlcode += "<tr><td>" + tipousuario.get(a).getIdtipoUsuario()
                                    + "</td><td>" + tipousuario.get(a).getNombre()
                                    + "</td><td>" + tipousuario.get(a).getNo_empresas()
                                    + "</td><td>" +
                                    "<a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_tipousuario.jsp?idtipoUsuario="+tipousuario.get(a).getIdtipoUsuario()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_tipousuario('"+ tipousuario.get(a).getIdtipoUsuario()+"')\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen carreras</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
