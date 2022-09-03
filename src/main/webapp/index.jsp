<%-- 
    Document   : index
    Created on : 18/08/2022, 09:02:23
    Author     : Anthony Acabal
    Código Técnico: IN5BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">

    <head>
        <title>Animal Love</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" type="text/css" href="./assets/css/hoja-estilo-animal-love.css" />
        <link rel="stylesheet" type="text/css" href="./assets/css/flexslider.css" />

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    </head>

    <body>
        <header>
            <!--Aqui va ir el encabezado de la pagina-->
            <h1>Centro de Albergue y Adopciones Animal Love</h1>

        </header>

        <!-- Cabecera -->
        <jsp:include page="./WEB-INF/paginas/comunes/cabecera.jsp" />


        <main>

            <section>
                <article id="contenido">

                    <br />


                    <div class="row">
                        <div class="col-1 col-sm-2 col-md-3"></div>
                        <div class="col-10 col-sm-8 col-md-6">
                            <div id="carrucelCB">
                                <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                                    <div class="carousel-inner">
                                        <div class="carousel-item active">
                                            <img src="./assets/images/perro1.png" class="d-block w-100" alt="...">
                                        </div>
                                        <div class="carousel-item">
                                            <img src="./assets/images/gato1.png" class="d-block w-100" alt="...">
                                        </div>
                                    </div>
                                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Previous</span>
                                    </button>
                                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                        <span class="visually-hidden">Next</span>
                                    </button>
                                </div>
                            </div>                
                        </div>
                        <div class="col-1 col-sm-2 col-md-3"></div>
                    </div>

                    <!-- Place somewhere in the <body> of your page -->



                    <div class="container">
                        <div class="row">
                            <div class="col-1 col-sm-2 col-md-3"></div>
                            <div class="col-10 col-sm-8 col-md-6">
                                <p class="descripcion">
                                    Animal Love es una fundacion dedicada al rescate de animales 
                                    sin hogar donde nuestra mision principal es cuidar de ellos y 
                                    darles el hogar que ellos merecen.
                                    <br/>
                                    <br/>
                                </p>
                                <p class="descripcion">
                                    "Buscando finales felices 
                                    Adopta y Salva una vida 🐾"
                                </p>                               
                            </div>
                            <div class="col-1 col-sm-2 col-md-3"></div>
                        </div>

                    </div>


                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <br/>
                    <br/>


                </article>


            </section>
        </main>

        <section class="about">
            <div class="main">
                <img src="./assets/images/logo1.png" />
                <div class="about-text">
                    <h2>Más sobre nosotros</h2>
                    <h5>Animal Love</h5>
                    <p class="informacion">
                        Los albergues son la salvación de los animales que han sido abandonados o maltratados, se han perdido o,
                        lamentablemente, sus dueños no pueden seguir atendiendo. Gracias a estos centros sin ánimo de lucro estos animales aspiran a tener una segunda oportunidad.
                        Por lo tanto, la mayor prestación que ofrecen los albergues es el de la acogida temporal, un concepto muy amplio en el que se incluyen: cuidados veterinarios,
                        ejercicio físico, afecto, educación, alimentación, limpieza... Y que es complementado por acciones de tipo administrativo (cuestiones legales del centro,
                        gestión de adopciones, coordinación del voluntariado, búsqueda de financiación…),
                        organización de actividades y eventos de promoción y concienciación y, por supuesto, de formación (formar voluntarios y reciclaje de personal).
                    </p>
                </div>
            </div>
        </section>

        <aside>
            <!--Aqui va ir el menu de navegacion-->
        </aside>

        <jsp:include page="./WEB-INF/paginas/comunes/pie-pagina.jsp" />

    </body>
    <!-- Aca agregamos el javascript-->

    <script type="text/javascript" src="./assets/js/jquery-3.6.0.js"></script>
    <script type="text/javascript" src="./assets/js/jquery.flexslider.js"></script>
    <script type="text/javascript" src="./assets/js/scrip.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" 
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" 
    crossorigin="anonymous"></script>
    <script type="text/javascript" src="./assets/js/bootstrap.bundle.js"></script>

</html>
