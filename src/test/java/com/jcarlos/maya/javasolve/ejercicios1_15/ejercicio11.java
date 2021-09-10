package com.jcarlos.maya.javasolve.ejercicios1_15;

public class ejercicio11 {
    public void contadorVocales(String text)
    {
        char temp;
        String vocales = "aeiou";
        int numVeces = 0;
        System.out.println("La longitud de la frase es "+text.length()+" letras");
        System.out.println("La cantidad de vocales en la frase es:");

        for(int j = 0; j < vocales.length(); j++)
        {
            numVeces=0;
            for(int i = 0; i < text.length(); i++)
            {
                temp = text.charAt(i);
                if(temp == vocales.charAt(j))
                    numVeces++;
            }
            System.out.println("La vocal "+vocales.charAt(j)+" se encontro "+numVeces+" en la frase");
        }
    }
}
