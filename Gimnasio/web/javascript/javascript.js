function validarFormulario()
{
	var flag=true;
	if(document.getElementById('nombre').value==""){
		    alert('el nombre no puede ser vacio');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	if(document.getElementById('apellido').value==""){
		    alert('el apellido no puede ser vacio');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	if(document.getElementById('direccion').value==""){
		    alert('La direccion no puede estar vacia');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	if(document.getElementById('numeroid').value==""){
		    alert('El numero de identificacion no puede estar vacio');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	if(document.getElementById('numeroTelefonico').value==""){
		    alert('El numero telefonico no puede estar vacio');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	
	if(document.getElementById('estatura').value==""){
		    alert('La estatura no puede estar vacia');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
	if(document.getElementById('peso').value==""){
		    alert('El peso no puede estar vacio');
			document.getElementById('form1').action="index.html";
		    flag=false;
		    return;
		}
		if (flag==true){
	alert("Formulario completo");
		}
}
