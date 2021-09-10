package com.jcarlos.maya.javasolve.ejercicios1_15;
/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.*/

public class ejercicio1 {
    int dato1;
    int dato2;
    public ejercicio1(int dato1, int dato2)
    {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    public int mayor()
    {
        if (this.dato1 != this.dato2)
            return Math.max(this.dato1, this.dato2);
        return 0;
    }

}
