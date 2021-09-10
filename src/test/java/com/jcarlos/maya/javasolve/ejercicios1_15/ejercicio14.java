package com.jcarlos.maya.javasolve.ejercicios1_15;

import java.util.ArrayList;
import java.util.List;

public class ejercicio14 {
    public ArrayList<Integer> calculaSecuencia(int numero)
    {
        ArrayList <Integer> sequence = new ArrayList<>();

        for(int i=numero; i<=1000; i += 2)
        {
            sequence.add(i);
        }
        return sequence;
    }
}
