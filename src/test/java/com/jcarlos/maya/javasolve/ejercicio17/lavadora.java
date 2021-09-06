package com.jcarlos.maya.javasolve.ejercicio17;

public class lavadora extends electrodomestico
{
    private double carga;
    private static final double cargaStandard= 5;

    public lavadora() {
        super();
        this.carga = cargaStandard;
    }

    public lavadora(double precio, double peso) {
        super(precio, peso);
        this.carga = cargaStandard;
    }

    public lavadora(double carga) {
        super();
        this.carga = carga;
    }

    public double getCarga()
    {
        return carga;
    }

    public double precioFinal()
    {
        return getCarga() > 30 ? super.precioFinal() + 50 : super.precioFinal();
    }
}
