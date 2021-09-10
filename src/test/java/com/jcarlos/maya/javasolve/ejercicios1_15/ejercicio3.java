package com.jcarlos.maya.javasolve.ejercicios1_15;

public class ejercicio3
{
    private double radius;
    public ejercicio3(double radius)
    {
        this.radius = radius;
    }

    public double calculaArea()
    {
        return Math.PI*this.radius*this.radius;
    }
}
