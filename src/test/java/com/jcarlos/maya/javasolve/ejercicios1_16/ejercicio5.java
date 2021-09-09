package com.jcarlos.maya.javasolve.ejercicios1_16;

import java.util.ArrayList;

public class ejercicio5 {
    private static int max = 100;
    private ArrayList <Integer> par;
    private ArrayList <Integer> impar;

    public void numerosPares()
    {
        int i = 0;
        par = new ArrayList<>();
        impar = new ArrayList<>();

        while(i <= this.max)
        {
            if(i % 2 == 0)
                par.add(i);
            else
                impar.add(i);
            i++;
        }
    }

    public void imprimeNumeros()
    {
        System.out.println("Numeros pares\n" + par);
        System.out.println("\nNumeros Impares\n" + impar);
    }

}
