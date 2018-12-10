<jsp:include page='views/header.jsp'></jsp:include>



<div class="container">
    <form class="col s12" action="/creartipoInversiones" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Insertar un nueva inversion</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="idtiposInversiones" name="idtipoInversiones" type="text" value="">
                <label for="idtiposInversiones" class="center-align">Tipo Inversiones</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="concepto" name="concepto" type="text" value="">
                <label for="concepto" class="center-align">Concepto</label>
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
                <a class="btn col s6" href="tipoinversiones.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>