/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Ruta implements IRecomendable {

    private final String nombre;
    private final int duracion; // en minutos o horas según tu sistema
    private final DestinoTuristico destino;
    private final Transporte transporte;

    public Ruta(String nombre, int duracion, DestinoTuristico destino, Transporte transporte) {
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("nombre inválido");
        if (duracion <= 0)
            throw new IllegalArgumentException("duración inválida");
        if (destino == null)
            throw new IllegalArgumentException("destino nulo");
        if (transporte == null)
            throw new IllegalArgumentException("transporte nulo");

        this.nombre = nombre.trim();
        this.duracion = duracion;
        this.destino = destino;
        this.transporte = transporte;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public DestinoTuristico getDestino() {
        return destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    @Override
    public String getDescripcion() {
        return nombre + " → " + destino.getNombre();
    }

    @Override
    public double getPuntaje() {
        // Fórmula sugerida: rutas más rápidas y destinos con buen puntaje ⇒ mejor valoración
        return (destino.getPuntaje() / (duracion * 0.5));
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", destino=" + destino.getNombre() +
                ", transporte=" + transporte.getTipo() +
                '}';
    }
}
