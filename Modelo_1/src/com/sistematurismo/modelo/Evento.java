/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Evento implements IRecomendable {

    private final String nombre;
    private final double costo;
    private final LocalDate fecha;
    private final DestinoTuristico destino;

    public Evento(String nombre, double costo, LocalDate fecha, DestinoTuristico destino) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
        if (costo < 0) throw new IllegalArgumentException("costo inválido");
        if (fecha == null) throw new IllegalArgumentException("fecha inválida");
        if (destino == null) throw new IllegalArgumentException("destino nulo");

        this.nombre = nombre.trim();
        this.costo = costo;
        this.fecha = fecha;
        this.destino = destino;
    }

    public String getNombre() { return nombre; }
    public double getCosto() { return costo; }
    public LocalDate getFecha() { return fecha; }
    public DestinoTuristico getDestino() { return destino; }

    @Override
    public String getDescripcion() {
        return nombre + " — " + fecha;
    }

    @Override
    public double getPuntaje() {
        // Eventos económicos = mayor atractivo
        return Math.max(1.0, 100.0 - costo / 10.0);
    }

    @Override
    public String toString() {
        return String.format("Evento{nombre='%s', costo=%.2f, fecha=%s}", nombre, costo, fecha);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Evento)) return false;
        Evento evento = (Evento) o;
        return nombre.equalsIgnoreCase(evento.nombre)
                && fecha.equals(evento.fecha)
                && destino.equals(evento.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), fecha, destino);
    }
}