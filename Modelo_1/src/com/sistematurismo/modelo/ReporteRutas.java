/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class ReporteRutas extends Reporte {

    public ReporteRutas() {
        super("Reporte de Rutas Turísticas");
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder();
        var sistema = SistemaTurismo.getInstancia();

        if (sistema.getRutas().isEmpty()) {
            sb.append("No hay rutas registradas.\n");
            return sb.toString();
        }

        for (Ruta r : sistema.getRutas()) {
            sb.append("Ruta: ").append(r.getNombre()).append("\n");
            sb.append("Duración: ").append(r.getDuracion()).append("\n");
            sb.append("Transporte: ").append(r.getTransporte()).append("\n");
            sb.append("Destino: ").append(r.getDestino().getNombre()).append("\n");
            sb.append("------------------------------------\n");
        }

        return sb.toString();
    }
}
