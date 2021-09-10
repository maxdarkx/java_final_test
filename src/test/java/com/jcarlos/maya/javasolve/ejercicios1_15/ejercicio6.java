package com.jcarlos.maya.javasolve.ejercicios1_15;

import java.util.ArrayList;

public class ejercicio6
{
    private static int max = 100;
    private ArrayList<Integer> par;
    private ArrayList <Integer> impar;


    public void numerosParesFor()
    {
        par = new ArrayList<>();
        impar = new ArrayList<>();

        for (int i=0; i<= max; i++)
        {
            if(i % 2 == 0)
                par.add(i);
            else
                impar.add(i);
        }
    }

    public void imprimeNumerosFor()
    {
        System.out.println("Numeros pares\n" + par);
        System.out.println("\nNumeros Impares\n" + impar);
    }

}