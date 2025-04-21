package com.aluracursos.radiox.principal;

import com.aluracursos.radiox.calculos.FiltraNominacion;
import com.aluracursos.radiox.modelos.Album;
import com.aluracursos.radiox.modelos.Cancion;
import com.aluracursos.radiox.modelos.MisFavoritos;
import com.aluracursos.radiox.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
       /* Cancion miCancion = new Cancion();
        miCancion.setTitulo("Monotomía");
        miCancion.setCantante("Shakira");

        Podcast miPodcast = new Podcast();
        miPodcast.setTitulo("Café Punto Tech");
        miPodcast.setPresentador("Alura");
        //cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();

        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();

        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: "+miCancion.getTotalMeGusta());

        MisFavoritos favoritos =new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);*/

        FiltraNominacion filtraNominacion=new FiltraNominacion();

        Album album=new Album();
        album.getTitulo("Loba");
        album.getFechadeLanzamiento(2005);
        album.getFormato("CD");
        album.getTotalVotaciones(1000);

        filtraNominacion.nominaMejorAlbum(album);



    }
}
