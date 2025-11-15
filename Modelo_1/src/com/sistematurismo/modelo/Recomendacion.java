/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public final class Recomendacion {
    private final IRecomendable elemento;
    private final double puntajeCalculado;

    public Recomendacion(IRecomendable elemento) {
        if (elemento == null) throw new IllegalArgumentException("elemento nulo");
        this.elemento = elemento;
        this.puntajeCalculado = elemento.getPuntaje();
    }

    public IRecomendable getElemento() { return elemento; }
    public double getPuntajeCalculado() { return puntajeCalculado; }

    @Override
    public String toString() {
        return String.format("Recomendacion{obj=%s, puntaje=%.2f}", elemento.getDescripcion(), puntajeCalculado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recomendacion)) return false;
        Recomendacion that = (Recomendacion) o;
        return Objects.equals(elemento, that.elemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elemento);
    }
}
