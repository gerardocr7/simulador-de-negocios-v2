<%@ page import="controller.controladorTipoUsuario" %>
<%@ page import="include.TipoUsuario" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>



<div class="container">
    <form class="col s12" action="/creartipoUsuario" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Insertar una nuevo usuario</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idtipoUsuario" name="idtipoUsuario" type="text" value="">
                <label for="idtipoUsuario" class="center-align">Tipo Usuario</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre" name="nombre" type="text" value="">
                <label for="nombre" class="center-align">Nombre</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="no_empresas" name="no_empresas" type="text" value="">
                <label for="no_empresas" class="center-align">Numero de Empresas</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="tiposusuarios.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>