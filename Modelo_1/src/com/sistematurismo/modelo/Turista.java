/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Turista extends Usuario {

    private int edad;
    private final List<Recomendacion> historial = new ArrayList<>();

    private Turista(Builder b) {
        super(b.id, b.nombre, b.correo, b.password);
        this.edad = b.edad;
    }

    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad <= 0) throw new IllegalArgumentException("edad inválida");
        this.edad = edad;
    }

    public void agregarRecomendacion(Recomendacion r) {
        if (r == null) throw new IllegalArgumentException("recomendación nula");
        historial.add(r);
    }

    public List<Recomendacion> getHistorialRecomendaciones() {
        return Collections.unmodifiableList(historial);
    }

    @Override
    public String getTipoUsuario() { return "Turista"; }

    @Override
    public String toString() {
        return String.format(
            "Turista{id=%d, nombre='%s', correo='%s', edad=%d, activo=%s}",
            id, nombre, correo, edad, activo ? "sí" : "no"
        );
    }


    public static class Builder {

        private final long id;
        private final String nombre;
        private final String correo;
        private final String password;

        private int edad = 18; // por defecto

        public Builder(long id, String nombre, String correo, String password) {
            if (id <= 0) throw new IllegalArgumentException("id inválido");
            if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
            if (correo == null || correo.isBlank()) throw new IllegalArgumentException("correo inválido");
            if (password == null || password.isBlank()) throw new IllegalArgumentException("password inválida");

            this.id = id;
            this.nombre = nombre.trim();
            this.correo = correo.trim().toLowerCase();
            this.password = password;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Turista build() {
            return new Turista(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turista)) return false;
        Turista t = (Turista) o;
        return id == t.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}