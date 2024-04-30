<?php
header('Access-Control-Allow-Origin: *');
header('Access-Control-Allow-Methods: POST,GET,DELETE,PUT,PATCH,OPTIONS');
header('Access-Control-Allow-Headers: token,Content-Type');
header('Access-Control-Allow-Credentials: true');
header('Access-Control-Max-Age: 1728000');
header('Content-Length: 0');
header('Content-Type: text/plain');

$server= "localhost:3306";
$user= "root";
$pass= "Caracteri123?";
$db= "laps";
$con=mysqli_connect($server,$user,$pass,$db);