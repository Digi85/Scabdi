$(document).ready(function(){
    $.get("/Scabdi/capacitacion",{"opc":1},function(data){
    //$("#tabla");    
    alert(data);
    //[{"area":"Desarrollo  de Capacidades","capacitacion_id":1,"capacitacion":"Ahoroo de Energia","nombres":"JORGE MASIAS FLORES"}
    var x = JSON.parse(data);
    $("#tablita tbody tr").remove();
        for (var i = 0; i < x.length;  i++) {
          $("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].area+"</td><td>"+x[i].capacitacion+"</td><td>"+x[i].nombres+"</td><td><a href='#' onclick='editar("+x[i].a+")'><i class='far fa-edit'></i></a></td><td><a href='#' onclick='eliminar("+x[i].idr+")'><i class='fas fa-trash-alt'></i></a></td></tr>");
        }
   
   
    });
});


