<?php
include "config.php";
$data = array();
//Recuperamos el dato para busqueda
$id = $_GET['id'];
$sql = "SELECT * FROM laps where id = '".$id."'";
$query = mysqli_query($con,$sql);
while ($row=mysqli_fetch_object($query)) {
    $data[] = $row;
}
echo json_encode($data);
echo mysqli_error($con);