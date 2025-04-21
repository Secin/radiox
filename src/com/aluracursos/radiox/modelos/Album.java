package com.aluracursos.radiox.modelos;

import com.aluracursos.radiox.calculos.Nominacion;

public class Album implements Nominacion {
    private String titulo;
    private String formato;
    private int fechadeLanzamiento;
    private int duracion;
    private int colecciones;
    private int totalVotaciones;

    public int getTotalVotaciones(int i) {
        return totalVotaciones;
    }

    public void setTotalVotaciones(int totalVotaciones) {
        this.totalVotaciones = totalVotaciones;
    }

    public String getTitulo(String loba) {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato(String cd) {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getFechadeLanzamiento(int i) {
        return fechadeLanzamiento;
    }

    public void setFechadeLanzamiento(int fechadeLanzamiento) {
        this.fechadeLanzamiento = fechadeLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getColecciones() {
        return colecciones;
    }

    public void setColecciones(int totalColecciones) {
        this.colecciones = totalColecciones;
    }

    @Override
    public int getNominacion() {
        if(totalVotaciones>500){
            return 5;
        }else{
            return 1;
        }
    }
}
