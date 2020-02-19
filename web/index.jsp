<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>S01 - Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" href = "bootstrap/css/bootstrap.min.css"/>
        <link rel = "stylesheet" href = "bootstrap/js/bootstrap.min.js"/>
        <style type="text/css">
            #lg{
                width: 250px;
                border-color: #17a2b8;
                margin: 14% auto auto auto;
            }
            #bd{
                background-image: url("img/bg02.jpg");
                width: auto;
                height: auto;
            }
        </style>

    </head>
    <body id="bd">
        <div id="lg" class="card">
            <div class="card-body" >
                <form action="index.jsp" method="post">
                    <div class="form-group">
                        <label>Usuário</label>
                        <input type="text" class="form-control" placeholder="Informe seu usuário" name="usuario">
                    </div>
                    <div class="form-group">
                        <label>Senha</label>
                        <input type="password" class="form-control" placeholder="Informe sua senha" name="senha">
                    </div>
                    <button type="submit" class="btn btn-primary">Entrar</button>
                </form>
            </div>
        </div>
    </body>
</html>