package com.jcarlos.maya.javasolve.ejercicio17;

public class television extends electrodomestico
{
    private double resolucion;
    private boolean sintonizadorTDT;

    private static final double resolucionStandard = 20;
    private static final boolean sintonizadorTDTStandard = false;


    public television() {
        super();
        this.resolucion = resolucionStandard;
        this.sintonizadorTDT = sintonizadorTDTStandard;
    }

    public television(double precio, double peso) {
        super(precio, peso);
        this.resolucion = resolucionStandard;
        this.sintonizadorTDT = sintonizadorTDTStandard;
    }

    public television(double resolucion, boolean sintonizadorTDT)
    {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal()
    {
        double precio=super.precioFinal();

        precio = getSintonizadorTDT() ? precio + 50 : precio;
        precio = getResolucion() > 40 ? precio*1.3 : precio;
        return precio;
    }

    @Override
    public String toString() {
        return "television {" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                "} " + super.toString();
    }
}
