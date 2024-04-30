<?php
include "config.php";
$data = array();
$sql = "SELECT * FROM equipos";
$query = mysqli_query($con,$sql);
while ($row=mysqli_fetch_object($query)) {
    $data[] = $row;
}
echo json_encode($data);
echo mysqli_error($con);