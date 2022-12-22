<%-- 
    Document   : add-orador
    Created on : 20 dic. 2022, 19:27:46
    Author     : gcasado0
--%>

<%@include file="/views/partials/header.jsp" %>
<main>
    
<h1> Agregar Orador </h1>
<div class="row">
    <div class="col">                
    </div>
    <div class="col-6">
        <div class="alert alert-danger" role="alert">
            Error: Campo nombre no puede ser vacio
        </div>
        <form method="POST" action="<%=request.getContextPath()%>/orador/create">
            <div class="input-group mb-3">                
                <input type="text" class="form-control" placeholder="Nombre" aria-label="Nombre" name="nombre" value="" required>
            </div>
            <div class="input-group mb-3">                
                <input type="text" class="form-control" placeholder="Apellido" aria-label="Apellido" name="apellido" value="" required>
            </div>            
            
            <div class="input-group mb-3">                
                <input type="text" class="form-control" placeholder="Título" aria-label="Título" name="titulo" value="" required>
            </div>         
            
            <div class="input-group mb-3">                
                <input type="date" class="form-control" placeholder="Inicio" aria-label="Inicio" name="inicio" value="" required>
            </div>         
            <div class="input-group mb-3">
                <span class="input-group-text">Resumen</span>
                 <textarea class="form-control" placeholder="Sobre qué quieres hablar" aria-label="Resumen" name="resumen" required></textarea>
            </div>
            
            <button type="submit" class="btn btn-primary">Guardar</button>
                        
        </form>
    </div>
    <div class="col">

    </div>
</div>

</main>
<%@include file="/views/partials/footer.jsp" %>
