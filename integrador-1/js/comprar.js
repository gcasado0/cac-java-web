var form = document.querySelector('form');

var cantidad = document.getElementById('cantidad');

var categoria = document.getElementById('categoria');

var submit = document.getElementById('submit');

var resultado = document.getElementById('importe');

 

form.onsubmit = function(e) {

    e.preventDefault();
    if (cantidad.value === '' || categoria.value === '') {


        resultado.textContent = '';

    }else{
        var valor = 200;
        var importe = 0; 

        switch (categoria.value) {
            case 'estudiante':
                descuento=80;
                break;
            case 'trainee':
                descuento=50;
                break;
            case 'junior':
                descuento=15;                
                break;
            default:
                descuento=0;                                
        }
        importe = parseInt(cantidad.value)*valor*(100-descuento)/100
        console.log(categoria.value+" : "+importe);
        resultado.textContent = importe;
    }

}