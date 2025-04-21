package com.aluracursos.radiox.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;
    private int numeroEpisodios;
    private Boolean seguir;

    @Override
    public int getClasificacion() {
        if(getTotalDeReproducciones()>=200){
            return 9;
        }else{
            return 2;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Boolean getSeguir() {
        return seguir;
    }

    public void setSeguir(Boolean seguir) {
        this.seguir = seguir;
    }
}
