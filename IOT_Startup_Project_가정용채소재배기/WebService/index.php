<?php

//DB연결
mysql_connect("localhost","DB계정","DB비밀번호") or die (mysql_error());
$sql = "SELECT time, temp FROM time_temperature";
$result = mysql_query($sql) or die (mysql_error());

//출력할 테이블 컬럼명 텍스트 입력
echo"
    <html>
    <head><title>온도</title></head>
    <body>
    <center>
    <H3>온도 리스트</H3>
    <table width='500' border='1'>
    <tr>
    <td width='50%' align='center'>시간</td>
    <td width='50%' align='center'>온도</td>
    </tr>
    </body>
    </html>
";
//쿼리의 결과값이 있는 동안 반복 출력
while ($row = mysql_fetch_array($result))
{
    echo("
    <tr>
    <td align='center'>$row[time]</td>
    <td align='center'>$row[temp]</td>
    </tr>
    ");
}
?>