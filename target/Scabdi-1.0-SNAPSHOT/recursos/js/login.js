function login(){
    var usuario = $("#login").val();
    var contrasena = $("#password").val();
    alert("usuario"+ usuario +"contrasena"+contrasena);
    $.post("Login", {"opc":1,"usuario":usuario}, function(data){
		console.log(data);
                console.log(data["CONTRASENA"]);
                var x = JSON.parse(data);
                if (contrasena == x.CONTRASENA) {
            alert("son iguales");
            sessionStorage.setItem("usuario",x.USERNAME);
             window.location = "capacitaciones.jsp";
        } else {
            alert("No son iguales");
            window.location = "index.html";
        }
	});
}
