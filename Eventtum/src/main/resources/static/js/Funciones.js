function validarvacio(campo, msj_vacio) {
    if (campo == "") {
        alert(msj_vacio);
        throw 'exit';
    }
}

function validarconfirm(password, confirm) {
    if (password != confirm) {
        alert("La confirmación no coincide con la contraseña ingresada");
        throw 'exit';
    }
}

function Validar(email, callbackFunction) {
    $.ajax({
        url: "http://localhost:8081/user/all",
        type: "GET",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            callbackFunction(email, respuesta);
        }
    });   
}    

function ListaUsuarios(email, respuesta){

    listusers=[];       
    for (i = 0; i < respuesta.length; i++) {
        listusers.push(respuesta[i].email);
    }
    console.log(listusers);
    u = email;
    console.log(u);
    if (listusers.includes(u) && u!=null) {
        alert("El email ya se encuentra registrado");
        throw exit;
    }else{
        NuevoUsuario();
    }
}

function idusuario(email, respuesta){
    
    emails=[];       
    for (i = 0; i < respuesta.length; i++) {
        emails.push(respuesta[i].email);
    }
    id = emails.indexOf(email)+1;
    return id;
}

function NuevoUsuario() {
   
    validarvacio($("#name").val(), "Debe ingresar un nombre");
    validarvacio($("#email").val(), "Debe ingresar un e-mail");
    validarvacio($("#password").val(), "Debe ingresar una contraseña");
    validarvacio($("#confirm").val(), "Por favor confirme su contraseña");
    validarconfirm($("#password").val(), $("#confirm").val());
    
    let myData = {
        name: $("#name").val(),
        email: $("#email").val().toLowerCase(),
        password: $("#password").val(),
        idrol: 3,
    };
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "http://localhost:8081/user/new",
        type: "POST",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            $("#name").val("");
            $("#email").val("");
            $("#password").val("");
            $("#confirm").val("");
            alert("se ha guardado el dato");
            document.getElementById("formregistro").setAttribute("hidden", "true");
            document.getElementById("bt").setAttribute("hidden", "true");
            $("#msj").html("Se ha registrado con éxito. Ahora puede ingresar");
        }
    });
    
}

function guardarUsuario(){
    Validar($("#email").val().toLowerCase(), ListaUsuarios);
}
     

function ValidarUsuario(email){
    let myData = email;
    validarvacio($("#uemail").val(), "Debe ingresar un e-mail");
    $.ajax({
        url: "http://localhost:8081/user/" + myData,
        type: "GET",
        data: myData,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            if (respuesta == false) {
                alert("Usuario no existe en la base de datos");
            } 
        }
    });
}



function Autenticacion(email, password) {
    ValidarUsuario(email);
    let myData = (email + "/" + password); console.log(myData);
    validarvacio($("#uemail").val(), "Debe ingresar un e-mail");
    validarvacio($("#upassword").val(), "Debe ingresar una contraseña valida");
    $.ajax({
        url: "http://localhost:8081/user/" + email + "/" + password,
        type: "GET",
        data: email + "/" + password,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            $("#uemail").val("");
            $("#upassword").val("");
            if (respuesta.name == "NO DEFINIDO") {
                alert("Usuario o clave incorrectos");
            } else {
                document.getElementById("formlogin").setAttribute("hidden", "true");
                document.getElementById("btnlog").setAttribute("hidden", "true");
                document.getElementById("reglink").setAttribute("hidden", "true");
                $("#welcome").html("Bienvenido "+respuesta.name);
            }

        }
    });
}

function validarcliente(NIT){
    let myData = NIT;
    validarvacio($("#NIT").val(), "Debe ingresar un numero de identificación");
    $.ajax({
        url: "http://localhost:8081/customer/" + myData,
        type: "GET",
        data: myData,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            if (respuesta == true) {
                alert("El cliente ya se encuentra registrado en la base de datos, inicie sesión con sus credenciales");
            } 
        }
    });
}

function guardarcliente(){
   
    validarcliente($("#NIT").val()); 
    guardarUsuario();
         
    validarvacio($("#NIT").val(), "Debe ingresar un numero de identificación");
    validarvacio($("#tel").val(), "Debe ingresar un numero de contacto");
    validarvacio($("#direcc").val(), "Debe ingresar una dirección");
    validarvacio($("#ciudad").val(), "Elija un valor para la ciudad");
    validarvacio($("#tipoID").val(), "Elija un valor para tipo de documento");
     
    var iduser=Validar($("#email").val().toLowerCase(), idusuario);
     
    let myData = {
        nit: $("#NIT").val(),
        name: $("#name").val(),
        tel: $("#tel").val().toLowerCase(),
        direccion: $("#direcc").val(),
        fechareg: Date.now(),
        tblusuarios:{id: iduser},
        idciudad:$("#ciudad").val(),
        tipoid:$("#tipoID").val()        
    };
    let dataToSend = JSON.stringify(myData);
    $.ajax({
        url: "http://localhost:8081/user/new",
        type: "POST",
        data: dataToSend,
        contentType: "application/JSON",
        datatype: "JSON",
        success: function (respuesta) {
            console.log(respuesta);
            $("#name").val("");
            $("#email").val("");
            $("#password").val("");
            $("#confirm").val("");
            $("#NIT").val("");
            $("#tel").val("");
            $("#direcc").val("");
            $("#ciudad").val("");
            $("#tipoID").val("");
            alert("se ha guardado el cliente");
            document.getElementById("formregistro").setAttribute("hidden", "true");
            document.getElementById("bt").setAttribute("hidden", "true");
            $("#msj").html("Se ha registrado con éxito. Ahora puede ingresar");
        }
    });
}