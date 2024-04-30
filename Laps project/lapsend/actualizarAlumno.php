<?php
include "config.php";
$input = file_get_contents('php://input');
$data = json_decode($input, true);
$message = array();

$id = $_GET["id"];
$matricula = $data["matricula"];
$nombre = $data["nombre"];
$apePat = $data["ape_pat"];
$apeMat = $data["ape_mat"];
$edad = $data["edad"];
$ciudad = $data["ciudad"];
$estadoCivil = $data["estadoCivil"];
$imagen = $data["imagen"];

$sql = "UPDATE alumnos SET matricula='".$matricula."', nombre='".$nombre."', ape_pat='".$apePat."', ape_mat='".$apeMat."', edad='".$edad."', ciudad='".$ciudad."', estadoCivil='".$estadoCivil."', imagen='".$imagen."'
 WHERE id ='".$id."'";
$query = mysqli_query($con,$sql);
if($query){
    http_response_code(201);
    $message['status'] = "Actualizado correctamente";
}else{
    http_response_code(202);
    $message['error'] = mysqli_error($con);
}
echo json_encode($message);
echo mysqli_error($con);