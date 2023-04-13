<?php
    $plaintext="HELLO";
    $key=4;
    $result="";
    for($i=0;$i<strlen($plaintext);$i++){
        if (ctype_upper($plaintext[$i])){
            $result = $result.chr((ord($plaintext[$i]) + $key - 65) % 26 + 65);
        }
    }
    echo $result;
?>

