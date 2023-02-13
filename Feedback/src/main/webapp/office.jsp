<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Login</title>

</head>

<body>
    <div class="container">

        <form action="" method="post">
            <h1>Login</h1>
            <div class="inputs">
                
                <input type="text" name="user" class="username" maxlength="100" minlength="3" placeholder="Username"
                    required> <br>
                <input type="password" name="pass" class="password" maxlength="32" minlength="4" placeholder="Password"
                    required> <br>
            </div>
            <div class="buttons">
                <button type="submit" >Submit</button>
            </div>
            
        </form>

    </div>
</body>

</html>