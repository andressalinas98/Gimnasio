<%-- 
    Document   : index
    Created on : 31/10/2019, 01:56:52 PM
    Author     : eandr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Gimnasio</title>
        <link rel="stylesheet" type="text/css" href="css/font.css">
        <script type="text/javascript" src="javascript/javascript.js"></script>
    </head>
    <body>
        <form method="GET"  action="GimnasioServlet" name="form1" id="form1" >
            <p id="Titulo1">GIMNASIO</p>
            <p id="Subtitulos">BIENVENIDO</p>
            <table border="3" name="tabla1" id="tabla1">
                <tr>
                    <td colspan="3">
                        <p id="ST1">INFORMACION PERSONAL</p>
                    </td>
                </tr>
                <tr>
                    <td >
                        <p>Nombres</br></p>
                        <input type="text" name="nombre" id="nombre">
                    </td>
                    <td>
                        <p>Apellidos</br></p>
                        <input type="text" name="apellido" id="apellido">
                    </td>
                    <td>
                        <p>Direccion</p>
                        <input type="text" name="direccion" id="direccion">
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Tipo de identificacion</p>
                        <label><input type="radio" name="identificacion" id="identificacion" value="Cedula" required>Cedula</label>
                        <label><input type="radio" name="identificacion" id="identificacion" value="Tarjeta de identidad">Tarjeta de identidad</label></br>
                        <input type="number" name="numeroid" id="numeroid" placeholder="Numero">
                    </td>
                    <td>
                        <p>Numero telefonico</p>
                        <input type="number" name="numeroTelefonico" id="numeroTelefonico">
                    </td>
                    <td>
                        <p>Sexo</p>
                        <label>Masculino<input type="radio" name="sexo" id="sexo" value="Masculino" required></label>
                        <label>Femenino<input type="radio" name="sexo" id="sexo" value="Femenino"></label>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <p id="ST1">INFORMACION FISICA</p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Estatura (En centimetros)</p>
                        <input type="number" name="estatura" id="estatura">
                    </td>
                    <td>
                        <p>Peso (En Kilogramos)</p>
                        <input type="number" name="peso" id="peso">
                    </td>
                    <td>
                        <p>Tipo De Rutina</p>
				<select name="rutina" id="rutina">
					<option value="Ganar" selected>Ganar Masa Muscular</option>
					<option value="Perder">Perder Peso</option>
                       
                    </td>
                </tr>
                <td colspan="3"><input type="submit" value="Enviar"  onclick="validarFormulario()"></input>
            </table>
        </form>
    </body>
</html>
