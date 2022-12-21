<%-- 
    Document   : add-orador
    Created on : 20 dic. 2022, 19:27:46
    Author     : gcasado0
--%>

<%@include file="/views/partials/header.jsp" %>

<h1> Agregar Orador </h1>
<div class="row">
    <div class="col">                
    </div>
    <div class="col-6">
        <form method="POST" action="<%=request.getContextPath()%>/orador/create">
            <div class="row mb-3">
                <div class="col-md-6 py-2">
                    <input type="text" class="form-control fs-6" placeholder="Nombre" aria-label="Nombre" name="nombre" value="gustavo">
                </div>
                <div class="col-md-6 py-2">
                  <input type="text" class="form-control fs-6" placeholder="Apellido" aria-label="Apellido" name="apellido" value="casado">
                </div>
            </div>
            <div>                
                <input type="text" class="form-control fs-6" placeholder="Título" aria-label="Título" name="titulo" value="charla java fullstack">
                <input type="text" class="form-control fs-6" placeholder="Inicio" aria-label="Inicio" name="inicio" value="2022-12-20">
            </div>
            <div class="input-group">                        
                <textarea id="basic-text" class="form-control fs-4" placeholder="Sobre qué quieres hablar" aria-label="With textarea" name="resumen"></textarea>
            </div>
            <div class="d-grid gap-2">
                <button type="submit" class="btn btn-success fs-3">Enviar</button>
            </div>
        </form>
    </div>
    <div class="col">

    </div>
</div>


<%@include file="/views/partials/footer.jsp" %>
