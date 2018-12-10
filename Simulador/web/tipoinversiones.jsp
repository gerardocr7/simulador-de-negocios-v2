<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Tiposinversiones" %>
<%@ page import="controller.controladorTiposinversiones" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>TiposInversiones</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_tipoInversion.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>IDTIPOSINVERSIONES</th>
                    <th>CONCEPTO</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorTiposinversiones cc = new controladorTiposinversiones();
                    int contador = 0;
                    ArrayList<Tiposinversiones> tiposinversiones = new ArrayList<Tiposinversiones>();
                    tiposinversiones = cc.obtenerTiposinversiones();
                    if(tiposinversiones.size() > 0){
                        for(int a=0; a<tiposinversiones.size();a++){
                            htmlcode += "<tr><td>" + tiposinversiones.get(a).getIdtiposInversiones()
                                    + "</td><td>" + tiposinversiones.get(a).getConcepto()
                                    + "</td><td>" +
                                    "<a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_tipoinversiones.jsp?idtiposInversiones="+tiposinversiones.get(a).getIdtiposInversiones()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_tipoinversion('"+ tiposinversiones.get(a).getIdtiposInversiones()+"')\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen inversiones</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>