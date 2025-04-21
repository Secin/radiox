package com.aluracursos.radiox.calculos;

import java.util.Objects;

public class FiltraNominacion {
    public void nominaMejorAlbum(Nominacion nominacion){
        if(nominacion.getNominacion()==5){
            System.out.println("Este Albúm gano los premios GRAMMY");
        } else if(nominacion.getNominacion()==1){
            System.out.println("Este Albúm NO gano los premios GRAMMY");
        }
    }
}
