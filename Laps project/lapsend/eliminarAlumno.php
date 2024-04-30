<?php
include "config.php";
$input = file_get_contents('php://input');
$data = array();
//Recuperamos el dato para busqueda
$id = $_GET['id'];
$sql = "DELETE  FROM alumnos where id = '".$id."'";
$query = mysqli_query($con,$sql);
if($query){
    http_response_code(201);
    $message['status'] = "Eliminado correctamente";
}else{
    http_response_code(422);
    $message['error'] = "Error al eliminar";
}
echo json_encode($message);
echo mysqli_error($con);