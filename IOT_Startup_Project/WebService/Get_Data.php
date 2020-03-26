<?php
 //header('Content-type: text/plain');

 echo "<html>";
 echo "<head>";
 echo "<meta name='viewport' content='width=device-width, user-scalable=false, initial-scale=1;'>";
 echo "</head>";
 echo "<body>" .	"<h2>Temperature und Humidity</h2>";

 if( isset($_GET['temp']) && isset($_GET['humidity']) )
 {
   $t=$_GET['temp'];
   $h=$_GET['humidity'];
 }
   echo " Temparature : ";
   echo $t;
   echo " Humidity : ";
   echo $h;
 ?>