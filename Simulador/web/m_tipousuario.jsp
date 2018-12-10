<%@ page import="controller.controladorTipoUsuario" %>
<%@ page import="include.TipoUsuario" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int idtipoUsuario = Integer.parseInt(request.getParameter("idtipoUsuario"));
    controladorTipoUsuario cc = new controladorTipoUsuario();
    ArrayList<TipoUsuario> tipousuario = new ArrayList<TipoUsuario>();
    tipousuario = cc.obtenerTipousuario(idtipoUsuario);
%>

<div class="container">
    <form class="col s12" action="/modificarTipoUsuario" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Tipo Usuario</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idtipoUsuario" name="idtipoUsuario" type="text" readonly="readonly" value="<% out.print(tipousuario.get(0).getIdtipoUsuario()); %>">
                <label for="idtipoUsuario" class="center-align">TipoUsuario</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre" name="nombre" type="text" value="<% out.print(tipousuario.get(0).getNombre()); %>">
                <label for="nombre" class="center-align">Nombre</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="no_empresas" name="no_empresas" type="text" value="<% out.print(tipousuario.get(0).getNo_empresas()); %>">
                <label for="no_empresas" class="center-align">Numero de empresas</label>
            </div>
            <div class="col s2">

            </div>
            <div class="row margin">
                <div class="col s2">

                </div>
                <div class="input-field col s8">

                </div>
                <div class="col s2">

                </div>
            </div>
            <div class="row">
                <div class="col s2">

                </div>
                <div class="input-field col s8">
                    <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                    <a class="btn col s6" href="tiposusuarios.jsp">Regresar</a>
                </div>
                <div class="col s2">

                </div>
            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
