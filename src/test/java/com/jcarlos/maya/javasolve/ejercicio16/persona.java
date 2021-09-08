package com.jcarlos.maya.javasolve.ejercicio16;

public class persona {
    //nombre, edad, cedula, sexo, peso, altura
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public persona(String nombre, int edad, String cedula, char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public int calcularIMC()
    {

        double calculoIMC = this.peso/Math.pow(this.altura,2);
        int returnValue = 2;

        if (calculoIMC < 20)
        {
            returnValue = -1;
        }
        else if(calculoIMC <= 25 )
        {
            returnValue = 0;
        }
        else if(calculoIMC > 25)
        {
            returnValue = 1;
        }
        return returnValue;
    }

    public boolean esMayorDeEdad()
    {
        return this.edad > 17;
    }

    private void comprobarSexo()
    {
        if (Character.compare(sexo, 'F') != 0 && Character.compare(sexo, 'H') != 0 )
        {
            this.sexo='H';
        }
    }

    @Override
    public String toString()
    {
        return "nombre: " + nombre +
                ", edad: " + edad +
                ", DNI: " + DNI +
                ", sexo: " + sexo +
                ", peso: " + peso +
                ", altura: " + altura;

    }

    public void generaDNI()
    {
        long numeroDNI = (long)(1000000000 * Math.random());
        this.DNI = String.valueOf(numeroDNI);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
