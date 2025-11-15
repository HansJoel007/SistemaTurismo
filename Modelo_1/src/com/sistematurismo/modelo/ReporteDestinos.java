/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class ReporteDestinos extends Reporte {

    public ReporteDestinos() {
        super("Reporte de Destinos Turísticos");
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder();
        var sistema = SistemaTurismo.getInstancia();

        if (sistema.getDestinos().isEmpty()) {
            sb.append("No hay destinos registrados.\n");
            return sb.toString();
        }

        for (DestinoTuristico d : sistema.getDestinos()) {
            sb.append("Destino: ").append(d.getNombre()).append("\n");
            sb.append("Clima: ").append(d.getClima().getEstado()).append("\n");
            sb.append("Actividades: ").append(d.getActividades()).append("\n");
            sb.append("Eventos: ").append(d.getEventos()).append("\n");
            sb.append("Puntaje: ").append(d.getPuntaje()).append("\n");
            sb.append("-------------------------------------------\n");
        }

        return sb.toString();
    }
}