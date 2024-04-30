<?php
include "config.php";
$input = file_get_contents('php://input');
$data = json_decode($input, true);
$message = array();

$matricula = $data["matricula"];
$nombre = $data["nombre"];
$apePat = $data["ape_pat"];
$apeMat = $data["ape_mat"];
$edad = $data["edad"];
$ciudad = $data["ciudad"];
$estadoCivil = $data["estadoCivil"];
$imagen = $data["imagen"];

$sql = "INSERT INTO alumnos (matricula, nombre, ape_pat, ape_mat, edad, ciudad, estadoCivil, imagen) VALUES
('$matricula', '$nombre', '$apePat', '$apeMat', '$edad', '$ciudad', '$estadoCivil', '$imagen')";
$query = mysqli_query($con,$sql);
if($query){
    http_response_code(201);
    $message['status'] = "Agregado correctamente";
}else{
    http_response_code(202);
    $message['error'] = mysqli_error($con);
}
echo json_encode($message);
echo mysqli_error($con);