package com.jcarlos.maya.javasolve.ejercicios1_15;

public class ejercicio9 {
    private String text;

    public ejercicio9()
    {
        text = "La sonrisa sera la mejor arma contra la tristeza";
    }
    public String reemplazaA(String textAlt)
    {
        String textReplace = this.text;
        textReplace = textReplace.replace('a','e')+" "+textAlt;
        return textReplace;
    }

}
