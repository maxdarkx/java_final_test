package com.jcarlos.maya.javasolve;

import com.jcarlos.maya.javasolve.ejercicio16.persona;
import com.jcarlos.maya.javasolve.ejercicio17.electrodomestico;
import com.jcarlos.maya.javasolve.ejercicio17.lavadora;
import com.jcarlos.maya.javasolve.ejercicio17.television;
import com.jcarlos.maya.javasolve.ejercicio18.javaSolve;
import com.jcarlos.maya.javasolve.ejercicios1_15.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class facilitadora
{
    public static void prueba1()
    {
        System.out.println("Se prueba el primer ejercicio con los enteros 3 y 7");
        System.out.println("Se obtiene que:...");
        comprobarMayor1();
    }

    public static void comprobarMayor1()
    {
        ejercicio1 exercise1 = new ejercicio1(3,7);
        int mayor= exercise1.mayor();
        if (mayor == 0 )
        {
            System.out.println("Los numeros son iguales");
        }
        else if(mayor!=0)
        {
            System.out.println("El numero mayor es: "+mayor);
        }
    }
    public static void prueba2()
    {
        int num1;
        int num2;
        String input;
        Scanner key = new Scanner(System.in);
        System.out.println("Comienza el segundo ejercicio:");
        System.out.println("Ingrese el primer numero a comparar: ");
        try {
            input = key.nextLine();
            num1 = Integer.parseInt(input);
            System.out.println("Ingrese el segundo numero a comparar: ");
            input = key.nextLine();
            num2 = Integer.parseInt(input);
            comprobarMayor2(num1, num2);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Ingreso un caracter invalido, intentelo nuevamente");
        }
    }

    public static void comprobarMayor2(int valor1, int valor2)
    {
        ejercicio2 exercise2 = new ejercicio2(valor1, valor2);
        int mayor= exercise2.mayor();
        if (mayor == 0)
        {
            System.out.println("Los numeros son iguales");
        }
        else if(mayor!=0)
        {
            System.out.println("El numero mayor entre ("+valor1+", "+valor2+") es: "+mayor);
        }
    }

    public static void prueba3()
    {
        ejercicio3 calculaCirculo;
        Scanner key = new Scanner(System.in);
        String input;
        double radius;
        System.out.println("Ejercicio 3");
        System.out.print("Ingrese el radio del circulo: ");
        try {
            input = key.nextLine();
            radius = Double.parseDouble(input);
            calculaCirculo = new ejercicio3(radius);
            System.out.print("El area del circulo con el radio " + radius + " es: ");
            System.out.format("%.3f", calculaCirculo.calculaArea());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Ingreso un caracter invalido. Intentelo nuevamente");
        }
    }

    public static void prueba4()
    {
        ejercicio4 tax;
        Scanner key = new Scanner(System.in);
        String input;
        double base;

        try {
            System.out.println("Ingrese la cantidad a la cual le calculara el impuesto: ");
            input = key.nextLine();
            base = Double.parseDouble(input);
            tax = new ejercicio4(base);
            System.out.print("El valor del impuesto es: ");
            System.out.format("%.2f",tax.calculaImpuesto());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Ingreso un caracter invalido. Intentelo nuevamente");
        }
    }

    public static void prueba5()
    {
        ejercicio5 pares = new ejercicio5();
        pares.numerosPares();
        pares.imprimeNumeros();
    }
    public static void prueba6()
    {
        ejercicio6 paresFor = new ejercicio6();
        paresFor.numerosParesFor();
        paresFor.imprimeNumerosFor();
    }

    public static void prueba7()
    {
        ejercicio7 mayorquecero = new ejercicio7();
        Scanner key = new Scanner(System.in);
        String input;
        int num=0;
        boolean probar = false;
        do
        {
            try {
                System.out.println("Ingrese el numero a verificar: ");
                input = key.nextLine();
                num = Integer.parseInt(input);
                probar = mayorquecero.verificaMayorQueCero(num);

                if (!probar) {
                    System.out.println("El numero ingresado no es mayor o igual a cero, intentelo de nuevo");
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("El valor ingresado no es un numero, intentelo de nuevo");
                probar = false;
            }

        }while(!probar);
        System.out.println("El numero ingresado fue " + num);
    }

    public static void prueba8()
    {
        ejercicio8 laboral = new ejercicio8();
        List <String> diasDeLaSemana = List.of("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo");
        Scanner key = new Scanner(System.in);
        String input;
        System.out.println("Ingrese el dia de la semana a verificar:");
        input = key.nextLine();
        input = input.toLowerCase();
        input = input.replace(" ","");
        if(diasDeLaSemana.contains(input))
        {
            if(laboral.diaLaboral(input))
            {
                System.out.println("El dia "+ input+ " es un dia laboral");
            }
            else
            {
                System.out.println("El dia "+ input+ " no es un dia laboral");
            }
        }
        else
        {
            System.out.println("La palabra ingresada no es un dia de la semana");
        }
    }

    public static void prueba9()
    {
        ejercicio9 cambiaA = new ejercicio9();
        Scanner key = new Scanner(System.in);
        String input;
        System.out.println("Ingrese la continuacion de la siguiente frase:\n La sonrisa sera la mejor arma contra la tristeza");
        input = key.nextLine();
        input = cambiaA.reemplazaA(input);
        System.out.println("la frase compuesta quedo de la siguiente manera:");
        System.out.println(input);
    }

    public static void prueba10()
    {
        ejercicio10 quitaEspacios = new ejercicio10();
        Scanner key = new Scanner(System.in);
        String input;

        System.out.println("Ingrese la frase a procesar:");
        input = key.nextLine();
        input = quitaEspacios.spaceRemover(input);
        System.out.println("La frase procesada es:\n"+input);
    }

    public static void prueba11()
    {   ejercicio11 cuentaVocales = new ejercicio11();
        Scanner key = new Scanner(System.in);
        String input;

        System.out.println("Ingrese la frase a procesar:");
        input = key.nextLine();
        cuentaVocales.contadorVocales(input);
    }
    public static  void prueba12()
    {
        int tam = 0;
        String text = "";
        String symbol= "";
        ejercicio12 comparaPalabras = new ejercicio12();
        Scanner key = new Scanner(System.in);
        String input, input2;
        System.out.println("Ingrese la primera palabra a comparar: ");
        input = key.nextLine();
        System.out.println("Ingrese la segunda palabra a comparar: ");
        input2 = key.nextLine();
        if(!comparaPalabras.wordEqual(input, input2))
        {
            if (input.length() >= input2.length()) {
                tam = input.length();
            }
            else if (input.length() < input2.length()){
                tam = input2.length();
            }
            for(int i = 0; i<tam; i++)
            {
                symbol = input.charAt(i)==input2.charAt(i) ? " == ":" != ";
                text += input.charAt(i)+symbol;

                if(i < input2.length())
                {
                    text += input2.charAt(i) + "\n";
                }
                else if(i > input2.length())
                {
                    text += "\n";
                }
            }

            System.out.println("Las palabras son distintas");
            System.out.println("Comparacion caracter a caracter");
            System.out.println(text);
        }
        else
        {
            System.out.println("Las palabras ingresadas son iguales");
        }
    }

    public static void prueba13()
    {
        ejercicio13 fechaHora= new ejercicio13();
        System.out.println("La fecha y hora actuales son:");
        System.out.println(fechaHora.retornaFechaHora());
    }
    public static void prueba14()
    {
        ejercicio14 seq = new ejercicio14();
        ArrayList<Integer> numList;
        Scanner key = new Scanner(System.in);
        String inputNum;
        try {
            System.out.println("Ingrese el numero desde el que comenzara la secuencia");
            inputNum = key.nextLine();
            numList = seq.calculaSecuencia(Integer.parseInt(inputNum));
            System.out.println(numList);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ha ingresado un dato incorrecto, intentelo nuevamente");
        }
    }
    public static void prueba15()
    {
        String text;
        Scanner key = new Scanner(System.in);
        int inputNum;

        do{
            text = "****** GESTION CINEMATOGR??FICA ********\n";
            text += "1-NUEVO ACTOR\n";
            text += "2-BUSCAR ACTOR\n";
            text += "3-ELIMINAR ACTOR\n";
            text += "4-MODIFICAR ACTOR\n";
            text += "5-VER TODOS LOS ACTORES\n";
            text += "6- VER PELICULAS DE LOS ACTORES\n";
            text += "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n";
            text += "8-SALIR\n";
            text += "INGRESE SU OPCION\n";
            System.out.print(text);
            try {
                inputNum = Integer.parseInt(key.nextLine());
                if(inputNum >8 || inputNum < 1)
                {
                    System.out.println("OPCION INCORRECTA");
                }
            }
            catch(NumberFormatException e) {
                inputNum = 0;
                System.out.println("Ha ingresado un valor incorrecto, intentelo de nuevo");
            }
        }while(inputNum != 8);
    }

    public static void prueba16()
    {
        persona completo;
        persona parcial;
        persona porDefecto;
        ArrayList <persona> datos = new ArrayList<>();

        Scanner key = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        char sexo = 'H';
        double peso = 0;
        double altura = 0;
        try {
            System.out.println("Ingrese el nombre:");
            nombre = key.nextLine().toUpperCase(Locale.ROOT);
            System.out.println("Ingrese su edad:");
            edad = Integer.parseInt(key.nextLine());
            System.out.println("Ingrese su sexo ( H, M ):");
            sexo = key.nextLine().toUpperCase().charAt(0);
            System.out.println("Ingrese su peso:");
            peso = Double.parseDouble(key.nextLine());
            System.out.println("Ingrese su altura");
            altura = Double.parseDouble(key.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ha ingresado un valor incorrecto, intentelo de nuevo");
        }
        completo = new persona(nombre, edad, "0", sexo, peso, altura);
        parcial = new persona(nombre, edad, sexo);
        porDefecto = new persona();
        porDefecto.setNombre("JOHN DOE");
        porDefecto.setEdad(25);
        porDefecto.setAltura(1.75);
        porDefecto.setSexo('H');
        porDefecto.setPeso(80);

        datos.add(completo);
        datos.add(parcial);
        datos.add(porDefecto);

        datos.forEach(persona::generaDNI);

        for (persona dato : datos) {
            int i = dato.calcularIMC();

            System.out.print(dato.getNombre());
            if (i == 1) {
                System.out.println(" tiene Sobrepeso");
            }
            else if (i == 0) {
                System.out.println(" esta cerca de su peso ideal");
            }
            else if (i == -1)
            {
                System.out.println(" esta muy por debajo de su peso ideal");
            }
        }

        System.out.println();

        for(persona dato : datos)
        {
            String text;
            System.out.print(dato.getNombre());
            text = dato.esMayorDeEdad()?" es mayor de edad":" es menor de edad";
            System.out.println(text);
        }

        System.out.println();

        for(persona dato : datos)
        {
            System.out.println(dato.toString());
        }

    }

    public static void prueba17()
    {
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;

        ArrayList <electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new lavadora(50));
        electrodomesticos.add(new electrodomestico(150, 50));
        electrodomesticos.add(new electrodomestico(110,"Blanco",'A', 20));
        electrodomesticos.add(new electrodomestico(130,"Negro",'B', 30));
        electrodomesticos.add(new electrodomestico(120,"Rojo",'A', 15));
        electrodomesticos.add(new television(80,true));
        electrodomesticos.add(new lavadora(45));
        electrodomesticos.add(new television(90, 30));
        electrodomesticos.add(new lavadora(200, 15));
        electrodomesticos.add(new electrodomestico(10, 60));

        for (electrodomestico item : electrodomesticos)
        {
            if(item instanceof television)
            {
                sumaTelevisores += item.precioFinal();
            }
            else if (item instanceof lavadora)
            {
                sumaLavadoras += item.precioFinal();
            }
            else if (item instanceof electrodomestico)
            {
                sumaElectrodomesticos += item.precioFinal();
            }
        }

        System.out.print("La suma de todas las lavadoras fue ");
        System.out.format("%.02f",sumaLavadoras);

        System.out.print("\nLa suma de todos los televisores fue ");
        System.out.format("%.02f",sumaTelevisores);

        System.out.print("\nLa suma de todos los electrodomesticos fue ");
        System.out.format("%.02f",sumaElectrodomesticos);

        System.out.print("\nLa suma total fue ");
        System.out.format("%.02f",sumaElectrodomesticos + sumaLavadoras + sumaTelevisores);

        System.out.println("\n");

        electrodomesticos.forEach(item->System.out.println(item.toString()+ "("+item.precioFinal()+")"));
    }
    public static void prueba18()
    {
        javaSolve last= new javaSolve();
        last.sol18Series();
    }


    public static void main(String[] args)
    {
       int opcion = 1;
        String text;
        Scanner key = new Scanner(System.in);
        int inputNum;

        do {
            System.out.println("\n\n1. Mayor entre dos numeros predefinidos");
            System.out.println("2.  Mayor entre dos numeros ingresados por teclado");
            System.out.println("3.  Calcular el area del circulo");
            System.out.println("4.  Calcular el area de un circulo ingresando el radio");
            System.out.println("5.  Numeros impares y pares del 1 al 100");
            System.out.println("6.  Numeros impares y pares con ciclo for");
            System.out.println("7.  Numero mayor o igual que cero");
            System.out.println("8.  Dia de la semana laborable");
            System.out.println("9.  Cambiar las 'a' por 'e' de un String");
            System.out.println("10. Eliminar los espacios de un String");
            System.out.println("11. Encontrar la longitud de un String y cuantas vocales tiene");
            System.out.println("12. Mostrar las diferencias entre dos Strings");
            System.out.println("13. Fecha y hora actual (AAAA/MM/DD) (HH:MM:SS)");
            System.out.println("14. Numero introducido hasta 1000 de 2 en 2");
            System.out.println("15. Mostrar menu GESTION CINEMATOGRAFICA");
            System.out.println("16. Clase persona");
            System.out.println("17. Clase Electrodomestico, television, lavadora");
            System.out.println("18. VideoTienda");
            System.out.println("0. SALIR");
            System.out.println("SELECCIONE SU OPCION ");

            try {
                opcion = Integer.parseInt(key.nextLine());
                switch (opcion)
                {
                    case(0):
                        System.out.println("Ha seleccionado la opcion para salir, hasta luego");
                        break;

                    case (1):
                        prueba1();
                        break;
                    case (2):
                        prueba2();
                        break;
                    case (3):
                        prueba3();
                        break;
                    case (4):
                        prueba4();
                        break;
                    case (5):
                        prueba5();
                        break;
                    case (6):
                        prueba6();
                        break;
                    case (7):
                        prueba7();
                        break;
                    case (8):
                        prueba8();
                        break;
                    case (9):
                        prueba9();
                        break;
                    case (10):
                        prueba10();
                        break;
                    case (11):
                        prueba11();
                        break;
                    case (12):
                        prueba12();
                        break;
                    case (13):
                        prueba13();
                        break;
                    case (14):
                        prueba14();
                        break;
                    case (15):
                        prueba15();
                        break;
                    case (16):
                        prueba16();
                        break;
                    case (17):
                        prueba17();
                        break;
                    case (18):
                        prueba18();
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Ha seleccionado una opcion incorrecta, intentelo nuevamente");
                opcion = 1;
            }
        }while(opcion != 0);
    }
}
