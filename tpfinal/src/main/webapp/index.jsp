<%-- 
    Document   : index
    Created on : 19 dic. 2022, 18:42:49
    Author     : gcasado0
--%>

<%@include file="/views/partials/header.jsp" %>


<div class="row">
            <div class="col text-center m-2">
                <h6 class="text-uppercase">conviértete en un</h6>
                <h2 class="text-uppercase">orador</h2>                
                <h6>Anótate como orador para dar una <abbr title="Presentación de la idea central de un proyecto o visión en cinco minutos">charla ignate</abbr>. 
                    Cuéntanos de qué quieres hablar!</h6>               
            </div>
</div>
<div class="row">
    <div class="col">                
    </div>
    <div class="col-6">
        <form>
            <div class="row mb-3">
                <div class="col-md-6 py-2">
                  <input type="text" class="form-control fs-6" placeholder="Nombre" aria-label="Nombre">
                </div>
                <div class="col-md-6 py-2">
                  <input type="text" class="form-control fs-6" placeholder="Apellido" aria-label="Apellido">
                </div>
            </div>
            <div class="input-group">                        
                <textarea id="basic-text" class="form-control fs-4" placeholder="Sobre qué quieres hablar" aria-label="With textarea"></textarea>                        
            </div>
            <div>
                <label for="basic-text" class="form-label fs-6">Recuerda incluir un título para tu charla</label>
            </div>
            <div class="d-grid gap-2">
                <button type="button" class="btn btn-success fs-3">Enviar</button>
            </div>
        </form>
    </div>
    <div class="col">

    </div>
</div>

<%@include file="/views/partials/footer.jsp" %>