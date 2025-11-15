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
public final class Transporte {
    private final String tipo;
    private final int capacidad; // opcional

    public Transporte(String tipo, int capacidad) {
        if (tipo == null || tipo.isBlank()) throw new IllegalArgumentException("tipo inválido");
        if (capacidad < 0) throw new IllegalArgumentException("capacidad inválida");
        this.tipo = tipo.trim();
        this.capacidad = capacidad;
    }

    public Transporte(String tipo) { this(tipo, 0); }

    public String getTipo() { return tipo; }
    public int getCapacidad() { return capacidad; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transporte)) return false;
        Transporte that = (Transporte) o;
        return tipo.equalsIgnoreCase(that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo.toLowerCase());
    }

    @Override
    public String toString() {
        return String.format("Transporte{tipo=%s, capacidad=%d}", tipo, capacidad);
    }
}
