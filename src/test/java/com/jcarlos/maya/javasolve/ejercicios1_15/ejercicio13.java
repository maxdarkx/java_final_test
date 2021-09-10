package com.jcarlos.maya.javasolve.ejercicios1_15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ejercicio13 {
    public String retornaFechaHora()
    {
        String datenow;
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        datenow = ("AAAA/MM/DD HH:MM:SS = "+dtf3.format(LocalDateTime.now()));
        return datenow;
    }
}
