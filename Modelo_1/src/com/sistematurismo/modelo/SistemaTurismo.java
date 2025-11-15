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
public class SistemaTurismo {

    private static SistemaTurismo instancia;

    private final List<Turista> turistas;
    private final List<Administrador> administradores;
    private final List<DestinoTuristico> destinos;
    private final List<Evento> eventos;
    private final List<Ruta> rutas;
    private final List<Transporte> transportes;

    private SistemaTurismo() {
        turistas = new ArrayList<>();
        administradores = new ArrayList<>();
        destinos = new ArrayList<>();
        eventos = new ArrayList<>();
        rutas = new ArrayList<>();
        transportes = new ArrayList<>();
    }

    public static SistemaTurismo getInstancia() {
        if (instancia == null) instancia = new SistemaTurismo();
        return instancia;
    }

    // usuarios
    public void agregarTurista(Turista t) { if (t == null) throw new IllegalArgumentException("turista nulo"); turistas.add(t); }
    public void agregarAdministrador(Administrador a) { if (a == null) throw new IllegalArgumentException("admin nulo"); administradores.add(a); }
    public List<Turista> getTuristas() { return Collections.unmodifiableList(turistas); }
    public List<Administrador> getAdministradores() { return Collections.unmodifiableList(administradores); }

    // destinos
    public void agregarDestino(DestinoTuristico d) { if (d == null) throw new IllegalArgumentException("destino nulo"); destinos.add(d); }
    public List<DestinoTuristico> getDestinos() { return Collections.unmodifiableList(destinos); }

    // eventos
    public void agregarEvento(Evento e) {
        if (e == null) throw new IllegalArgumentException("evento nulo");
        eventos.add(e);
        if (e.getDestino() != null) e.getDestino().agregarEvento(e);
    }
    public List<Evento> getEventos() { return Collections.unmodifiableList(eventos); }

    // rutas
    public void agregarRuta(Ruta r) { if (r == null) throw new IllegalArgumentException("ruta nula"); rutas.add(r); }
    public List<Ruta> getRutas() { return Collections.unmodifiableList(rutas); }

    // transportes
    public void agregarTransporte(Transporte t) { if (t == null) throw new IllegalArgumentException("transporte nulo"); transportes.add(t); }
    public List<Transporte> getTransportes() { return Collections.unmodifiableList(transportes); }

    // reportes
    public Reporte generarReporte(ReporteFactory.TipoReporte tipo) {
        return new ReporteFactory().crearReporte(tipo);
    }
}
