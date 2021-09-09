package com.jcarlos.maya.javasolve.ejercicios1_16;

public class ejercicio8 {
    private String day;

    public boolean diaLaboral(String day1)
    {
        day = day1;

        switch(day)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                return true;
        }
        return false;
    }

}
