package com.jcarlos.maya.javasolve.ejercicios1_15;

public class ejercicio4 {
    private double impuesto;
    private static double IVA = 0.21;
    public ejercicio4(double impuesto)
    {
        this.impuesto=impuesto;
    }
    public double calculaImpuesto()
    {
        return this.impuesto * IVA;
    }
}
