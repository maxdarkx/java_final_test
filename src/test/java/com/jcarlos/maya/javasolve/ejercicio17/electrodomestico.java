package com.jcarlos.maya.javasolve.ejercicio17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class electrodomestico
{
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private double precioTotal;


    private static final char consumoEnergeticoStandard = 'F';
    private static final double precioBaseStandard = 100;
    private static final double pesoStandard = 5;
    private static final String colorStandard = "Blanco";

    public electrodomestico()
    {
        this.precioBase = precioBaseStandard;
        this.color = colorStandard;
        this.consumoEnergetico = consumoEnergeticoStandard;
        this.peso = pesoStandard;
    }

    public electrodomestico(double precio, double peso)
    {
        this.precioBase = precio;
        this.color = colorStandard;
        this.consumoEnergetico = consumoEnergeticoStandard;
        this.peso = peso;
    }

    public electrodomestico(double precio, String color, char consumo, double peso)
    {
        this.precioBase = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumo);;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra)
    {
        if(letra <= 'z' && letra >= 'a')
            letra -=32;

        if(!(letra >= 'A' && letra <='F'))
            letra = 'F';

        return letra;
    }

    private String comprobarColor(String color)
    {
        List <String> colors = List.of("Blanco", "Negro", "Rojo", "Azul", "Gris");
        return !colors.contains(color)? color : colors.get(0);
    }
    public double precioFinal()
    {
        double sumPrecio = getPrecioBase();
        double peso = getPeso();

        System.out.println(sumPrecio);
        switch (getConsumoEnergetico())
        {
            case 'F':
                sumPrecio += 10;
                break;
            case 'E':
                sumPrecio += 30;
                break;
            case 'D':
                sumPrecio += 50;
                break;
            case 'C':
                sumPrecio += 60;
                break;
            case 'B':
                sumPrecio += 80;
                break;
            case 'A':
                sumPrecio += 100;
                break;

        }
        System.out.println(sumPrecio);

        if(peso <= 19)
        {
            sumPrecio += 10;
        }
        else if (peso <= 49)
        {
            sumPrecio += 50;
        }
        else if (peso <= 79)
        {
            sumPrecio += 80;
        }
        else if ( peso >= 80)
        {
            sumPrecio += 100;
        }
        this.precioTotal = sumPrecio;
        return sumPrecio;
    }

    @Override
    public String toString() {
        return "Electrodomestico {" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
