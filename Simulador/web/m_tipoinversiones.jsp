<%@ page import="controller.controladorTiposinversiones" %>
<%@ page import="include.Tiposinversiones" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int idtiposInversiones = Integer.parseInt(request.getParameter("idtiposInversiones"));
    controladorTiposinversiones cc = new controladorTiposinversiones();
    ArrayList<Tiposinversiones> tiposinversiones = new ArrayList<Tiposinversiones>();
    tiposinversiones = cc.obtenerTipoinversion(idtiposInversiones);
%>

<div class="container">
    <form class="col s12" action="/modificarTipoInversiones" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Tipo Inversiones</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idtiposInversiones" name="idtiposInversiones" type="text" readonly="readonly" value="<% out.print(tiposinversiones.get(0).getIdtiposInversiones()); %>">
                <label for="idtiposInversiones" class="center-align">Tipo Inversiones</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="concepto" name="concepto" type="text" value="<% out.print(tiposinversiones.get(0).getConcepto()); %>">
                <label for="concepto" class="center-align">Concepto</label>
            </div>
            <div class="col s2">

            </div>
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
                    <a class="btn col s6" href="tipoinversiones.jsp">Regresar</a>
                </div>

            </div>


    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
