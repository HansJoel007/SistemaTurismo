/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ReporteEventos extends Reporte {

    public ReporteEventos() {
        super("Reporte de Eventos");
    }

    /**
     * Implementación del contrato: devuelve el texto completo del reporte.
     * No sobreescribe generar(); usa el comportamiento por defecto de Reporte.
     */
    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder();
        SistemaTurismo sistema = SistemaTurismo.getInstancia();
        List<Evento> eventos = sistema.getEventos();

        if (eventos.isEmpty()) {
            sb.append("No hay eventos registrados.\n");
            return sb.toString();
        }

        for (Evento e : eventos) {
            sb.append("Nombre: ").append(e.getNombre()).append("\n");
            sb.append("Costo: ").append(e.getCosto()).append("\n");
            sb.append("Fecha: ").append(e.getFecha()).append("\n");
            sb.append("Destino: ")
              .append(e.getDestino() != null ? e.getDestino().getNombre() : "(no asignado)")
              .append("\n");
            sb.append("Puntaje: ").append(String.format("%.2f", e.getPuntaje())).append("\n");
            sb.append("-----------------------------------\n");
        }

        return sb.toString();
    }
}