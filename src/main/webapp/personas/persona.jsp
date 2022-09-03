<%-- 
    Document   : estudiante
    Created on : 18/08/2022, 10:09:32
    Author     : Anthony Acabal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="es_GT"/>
<!DOCTYPE html>
<html>
    <head>
        <title>Animal Love</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="../assets/css/hoja-estilo-animal-love.css" />
        <link rel="stylesheet" type="text/css" href="../assets/css/flexslider.css" />

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

        <script src="../assets/js/b2af6b3354.js"></script>

    </head>
    <body>

        <header>
            <jsp:include page="../WEB-INF/paginas/comunes/cabecera.jsp" />
            <div id="main-header" class="py-2 bg-light text-dark mt-5">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <h1>
                                <i class="fas fa-user-cog"></i> Persona
                            </h1>
                        </div>                                                
                    </div>                                         
                </div>                
            </div>
        </header>


        <jsp:include page="../WEB-INF/paginas/comunes/pie-pagina.jsp" />

        <main>

            <section id="accions" class="py-4 mb-4">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <a href="#" class="btn btn-primary">Agregar Persona</a>
                        </div>
                    </div>
                </div>
            </section>

            <!-- Tabla con listado de estudiante -->
            <section id="estudiante">
                <div class="container mt-5 mb-5 pb-5">
                    <div class="row">
                        <div class="col-12 col-md-12">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Listado de Estudiantes</h4>
                                </div>
                            </div>

                            <table class="table table-striped">
                                <thead class="table-dark">
                                    <tr>
                                        <th>#</th>
                                        <th>Nombre</th>
                                        <th>Direccion</th>
                                        <th>Cui</th>
                                        <th>Telefono</th>
                                        <th>Editar</th>
                                        <th>Eliminar</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${data}" var="persona">
                                        <tr>
                                            <td>${persona.id}</td>
                                            <td>${persona.nombre1} ${persona.nombre2} 
                                                ${persona.nombre3} ${estudiante.apellido1}
                                                ${persona.apellido2}
                                            </td>
                                            <td>${persona.direccion}</td>
                                            <td>${persona.cui}</td>
                                            <td>${persona.telefono}</td>
                                            <td>
                                                <i class="fa fa-edit"></i> Editar
                                            </td>
                                            <td>
                                                <i class="far fa-trash-alt"></i> Eliminar
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>

                        </div>
                    </div>
                </div>                
            </section>
        </main>

        <script type="text/javascript" src="../assets/js/jquery-3.6.0.js"></script>
        <script type="text/javascript" src="../assets/js/jquery.flexslider.js"></script>
        <script type="text/javascript" src="../assets/js/scrip.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" 
                integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" 
        crossorigin="anonymous"></script>
        <script type="text/javascript" src="../assets/js/bootstrap.bundle.js"></script>
    </body>
</html>
