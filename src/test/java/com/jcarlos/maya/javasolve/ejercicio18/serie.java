package com.jcarlos.maya.javasolve.ejercicio18;

public class serie implements entregable
{
    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //constructor por defecto
    public serie()
    {
        this.titulo = "";
        this.numeroDeTemporadas=3;
        this.entregado=false;
        this.genero = "";
        this.creador = "";
    }

    public serie(String titulo, String creador)
    {
        this.titulo = titulo;
        this.numeroDeTemporadas=3;
        this.entregado=false;
        this.genero = "";
        this.creador = creador;
    }

    public serie(String titulo, int numeroDeTemporadas, String genero, String creador)
    {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.entregado=false;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        String ent = entregado?" Si":" No";
        return "Serie: \n" +
                "Titulo: " + titulo +
                ", Numero De Temporadas: " + numeroDeTemporadas +
                ", Entregado: " + ent +
                ", Genero: " + genero +
                ", Creador: " + creador ;
    }

    @Override
    public void entregar() {
        this.entregado = true;
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
    public int compareTo(Object a) {
        int result=0;
        serie b;
        if(a instanceof serie)
        {
            b = (serie) a;
            result = this.getNumeroDeTemporadas()>b.getNumeroDeTemporadas()? 1 : -1 ;
        }
        return result;
    }
}
