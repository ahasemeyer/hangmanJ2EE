<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Hangman Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div><h1>Hangman</h1></div>
        <label>Guess a character</label>
        <form action="hangmanServlet" method="post">
            <input type="text" name="guess"><br><br>
            <input type="submit" value="Submit Letter">
        </form>
    </body>
</html>

