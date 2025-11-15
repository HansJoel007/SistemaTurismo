/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class DestinoTuristico implements IRecomendable {

    private final String nombre;
    private final String descripcion;
    private final Clima clima;

    private final List<String> actividades = new ArrayList<>();
    private final List<Evento> eventos = new ArrayList<>();
    private final List<Ruta> rutas = new ArrayList<>();


    public DestinoTuristico(String nombre, String descripcion, Clima clima) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
        if (descripcion == null || descripcion.isBlank()) throw new IllegalArgumentException("descripción inválida");
        if (clima == null) throw new IllegalArgumentException("clima nulo");

        this.nombre = nombre.trim();
        this.descripcion = descripcion.trim();
        this.clima = clima;
    }


    public String getNombre() { return nombre; }
    public String getDescripcionDetallada() { return descripcion; }
    public Clima getClima() { return clima; }

    public List<String> getActividades() { return Collections.unmodifiableList(actividades); }
    public List<Evento> getEventos() { return Collections.unmodifiableList(eventos); }
    public List<Ruta> getRutas() { return Collections.unmodifiableList(rutas); }


    public void agregarActividad(String actividad) {
        if (actividad == null || actividad.isBlank())
            throw new IllegalArgumentException("actividad inválida");

        actividades.add(actividad.trim());
    }

    public void eliminarActividad(String actividad) {
        actividades.remove(actividad);
    }


    public void agregarEvento(Evento evento) {
        if (evento == null) throw new IllegalArgumentException("evento nulo");
        eventos.add(evento);
    }

    public List<Evento> getEventosProximos() {
        LocalDate hoy = LocalDate.now();

        return eventos.stream()
                .filter(e -> !e.getFecha().isBefore(hoy))
                .toList();
    }


    public void agregarRuta(Ruta ruta) {
        if (ruta == null) throw new IllegalArgumentException("ruta nula");
        rutas.add(ruta);
    }


    @Override
    public String getDescripcion() {
        return String.format(
                "%s — %s | Clima: %s (%.1f°C)",
                nombre, descripcion, clima.getEstado(), clima.getTemperatura()
        );
    }

    @Override
    public double getPuntaje() {
        double base = actividades.size() * 1.5 + eventos.size() * 2.0;
        double climaBonus = "soleado".equalsIgnoreCase(clima.getEstado()) ? 1.5 : 1.0;
        return base * climaBonus;
    }


    @Override
    public String toString() {
        return "Destino{" + nombre + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DestinoTuristico)) return false;
        DestinoTuristico that = (DestinoTuristico) o;
        return nombre.equalsIgnoreCase(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }
}