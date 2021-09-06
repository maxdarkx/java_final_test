package com.jcarlos.maya.javasolve.ejercicio18;

import com.jcarlos.maya.javasolve.ejercicio18.serie;
import com.jcarlos.maya.javasolve.ejercicio18.videojuego;

import java.util.ArrayList;

public class javaSolve {
    public static void sol18Series()
    {
        long conteoVideojuegos;
        long conteoSeries;
        videojuego videoJuegoMasJugado;
        serie serieMasLarga;

        ArrayList <serie> listaSeries =new ArrayList<>();
        ArrayList <videojuego> listaVideojuegos = new ArrayList<>();

        listaSeries.add(new serie("Naruto Shippuden",15,"Aventuras","Masashi Kishimoto"));
        listaSeries.add(new serie("Game of thrones",9,"Aventuras","George R.R. Martin"));
        listaSeries.add(new serie("Battlestar Galactica",11,"Ciencia Ficcion","Glen E. Larson"));
        listaSeries.add(new serie("Slayers","Hajime Kanzaka"));
        listaSeries.add(new serie("Vivy: Fluorite Eye's Song",2,"Ciencia Ficcion","Tappei Nagatsuki, Eiji Umehara"));

        listaVideojuegos.add(new videojuego("Halo Reach", 35,"First Person Shooter","Bungie"));
        listaVideojuegos.add(new videojuego("Apex Legends", 40,"Battle Royale","Respawn Entertaiment"));
        listaVideojuegos.add(new videojuego("Resident Evil 2", 20, "Survival Horror", "Capcom"));
        listaVideojuegos.add(new videojuego("Control",2));
        listaVideojuegos.add(new videojuego("Crysis 3", 1));


        System.out.println("inicio Solucion 18\n");

        listaVideojuegos.get(0).entregar();
        listaVideojuegos.get(2).entregar();
        listaVideojuegos.get(4).entregar();
        listaSeries.get(1).entregar();
        listaSeries.get(3).entregar();

        conteoVideojuegos = listaVideojuegos.stream().filter(videojuego::isEntregado).count();
        listaVideojuegos.stream().filter(videojuego::isEntregado).forEach(videojuego::devolver);
        conteoSeries= listaSeries.stream().filter(serie::isEntregado).count();
        listaSeries.stream().filter(serie::isEntregado).forEach(serie::devolver);

        System.out.println("Videojuegos devueltos: " + conteoVideojuegos);
        System.out.println("Series devueltas: " + conteoSeries+"\n");

        videoJuegoMasJugado = listaVideojuegos.stream().max(videojuego::compareTo).get();
        System.out.println("Videojuego Mas Jugado\n"+videoJuegoMasJugado+"\n");
        serieMasLarga = listaSeries.stream().max(serie::compareTo).get();
        System.out.println("Serie Mas Larga\n"+serieMasLarga+"\n");

    }

    public static void main(String[] args) {
        sol18Series();
    }
}
