<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Capacitaciones</title>
  <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
  <link rel="stylesheet" href="recursos/css/capacitaciones.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
    integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.0/css/font-awesome.css"
    integrity="sha512-72McA95q/YhjwmWFMGe8RI3aZIMCTJWPBbV8iQY3jy1z9+bi6+jHnERuNrDPo/WGYEzzNs4WdHNyyEr/yXJ9pA=="
    crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body
  background="https://p4.wallpaperbetter.com/wallpaper/77/19/693/white-fabric-texture-texture-units-wallpaper-preview.jpg">
  <!-- Cabecera -->
  <header>
    <div class="cabeza">
      <div class="logo_cabezera">
        <img src="https://www.seekpng.com/png/full/378-3783516_adra-es-la-rama-humanitaria-mundial-de-la.png"
          style="width: 200px; height: 130px;" alt="Logo">
      </div>
      <div class="usuario">

      </div>
    </div>
  </header>
  <div>
    <!-- Menu -->
    <nav class="navbar navbar-expand navbar-dark bg-dark">
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <a href="#" class="nav-item active nav-link">Mis Capacitaciones<i class="fa fa-check" aria-hidden="true"
              style="padding: 5px;"></i></a>
          <a href="#" class="nav-item active nav-link">Capacitaciones<i class="fa fa-search" aria-hidden="true"
              style="padding: 5px;"></i></a>
        </ul>
        <div>
          <div class="select">
            <p style="text-align: center; color: white;">VISTA</p>
            <select id="">
              <option value="1">Socio</option>
              <option value="2">Docente</option>
              <option value="3">Coordinador</option>
            </select>
          </div>
        </div>
    </nav>
  </div>
  <!-- Cuerpo -->
  <div>
    <h1 style="background-color: rgb(228, 46, 46);">Capacitaciones&nbsp;<i class="fa fa-search" aria-hidden="true"></i>
    </h1>
    <br>
  </div>
  <div class="boddy container">
    <div class="leyenda">
      <div class="subleyenda">
        <div class="leyendita_1"></div>Desarrollo Físico
      </div>
      <div class="subleyenda">
        <div class="leyendita_2"></div>Desarrollo de Capacidades
      </div>
      <div class="subleyenda">
        <div class="leyendita_3"></div>Desarrollo Espiritual
      </div>
      <div class="subleyenda">
        <div class="leyendita_4"></div>Desarrollo Social
      </div>
      <div class="container h-100">
        <div class="d-flex justify-content-center h-100">
          <div class="searchbar">
            <input class="search_input" type="text" name="" placeholder="Search...">
            <a href="#" class="search_icon"><i class="fas fa-search"></i></a>
          </div>
        </div>
      </div>
    </div>
    <br>
    <!-- Tabla -->
    <table id ="tablita" class="table" style="border: black solid 2px;">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">AREA</th>
          <th scope="col">CAPACITACIÓN</th>
          <th scope="col">DOCENTE</th>
          <th scope="col" colspan="2">VISUALIZAR</th>
        </tr>
      </thead>
      <tbody>
        <tr style="background-color: rgb(212, 246, 18);">
          <th scope="row">1</th>
          <td>Desarrollo Social</td>
          <td>El Uso de Software</td>
          <td>Sincronia</td>
          <td>David Reyna</td>
          <td><button class="btn btn-success">VER</button></td>
        </tr>
        <tr style="background-color: rgb(18, 205, 238);">
          <th scope="row">2</th>
          <td>Desarrollo de Capacidades</td>
          <td>Ambiental</td>
          <td>Asincrona</td>
          <td>Carol Acuña</td>
          <td><button class="btn btn-success">VER</button></td>
        </tr>
        <tr style="background-color: rgb(101, 196, 6);">
          <th scope="row">3</th>
          <td>Desarrollo Fisico</td>
          <td>Activate</td>
          <td>Sincrona</td>
          <td>Daniel Levano</td>
          <td><button class="btn btn-success">VER</button></td>
        </tr>
        <tr style="background-color: rgb(110, 80, 245);">
          <th scope="row">4</th>
          <td>Desarrollo Espiritual</td>
          <td>Dios con nosotros</td>
          <td>Asincrona</td>
          <td>Maria Minaya</td>
          <td><button class="btn btn-success">VER</button></td>
        </tr>
      </tbody>
    </table>
  </div>
  <div style="display: flex; width: 100%; justify-content: center;">
    <iframe width="800" height="400" src="https://www.youtube.com/embed/x48_xFIysok" title="YouTube video player"
      frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
      allowfullscreen></iframe>
  </div>
  <script src="recursos/js/jquery.js"></script>
  <script src ="recursos/js/Capacitaciones.js"></script>
  <script src="recursos/js/bootstrap.min.js"></script>
</body>

</html>