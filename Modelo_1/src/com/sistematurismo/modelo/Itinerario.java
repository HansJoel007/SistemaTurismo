/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author ESTUDIANTE
 */
public class Itinerario implements Cloneable {

    private final String nombre;
    private final DestinoTuristico destinoPrincipal;
    private final List<IRecomendable> actividades;
    private double costoTotal;

    public Itinerario(String nombre, DestinoTuristico destinoPrincipal, List<IRecomendable> actividades) {
        if (nombre == null || nombre.isBlank()) 
            throw new IllegalArgumentException("nombre inválido");
        if (destinoPrincipal == null) 
            throw new IllegalArgumentException("destinoPrincipal nulo");

        this.nombre = nombre.trim();
        this.destinoPrincipal = destinoPrincipal;

        this.actividades = new ArrayList<>(actividades == null ? 
            Collections.emptyList() : actividades);

        recalcularCosto();
    }

    public String getNombre() { return nombre; }
    public DestinoTuristico getDestinoPrincipal() { return destinoPrincipal; }

    public List<IRecomendable> getActividades() {
        return Collections.unmodifiableList(actividades);
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    private void recalcularCosto() {
        costoTotal = 0;

        for (IRecomendable r : actividades) {
            if (r instanceof Evento ev) {
                costoTotal += ev.getCosto();
            }
            // Si agregas más clases recomendables, puedes sumar su costo aquí
        }
    }

    public void agregarActividad(IRecomendable act) {
        if (act == null) throw new IllegalArgumentException("actividad nula");
        actividades.add(act);
        recalcularCosto();
    }

    @Override
    public Itinerario clone() {
        return new Itinerario(
            this.nombre,
            this.destinoPrincipal,
            new ArrayList<>(this.actividades)
        );
    }

    @Override
    public String toString() {
        return String.format(
            "Itinerario{nombre='%s', destino='%s', actividades=%s, costoTotal=%.2f}",
            nombre, destinoPrincipal.getNombre(), actividades, costoTotal
        );
    }
}
