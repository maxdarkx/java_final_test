package com.jcarlos.maya.javasolve.ejercicio18;

public class videojuego implements entregable
{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public videojuego()
    {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public videojuego(String titulo, int horasEstimadas)
    {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    public videojuego(String titulo, int horasEstimadas, String genero, String compania)
    {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        String ent = entregado?" Si":" No";
        String txt= "Videojuego:\n" + "Titulo: " + titulo +
                ", Horas Estimadas: " + horasEstimadas +
                ", Entregado: " + ent +
                ", Genero: " + genero +
                ", Compania: " + compania;
        return txt;
    }

    @Override
    public void entregar() {
        this.entregado= true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a)
    {
        int result=0;
        videojuego b;

        if(a instanceof videojuego)
        {
            b = (videojuego) a;
            result=this.getHorasEstimadas()>b.getHorasEstimadas()?1:-1;
        }
        return result;

    }

}
