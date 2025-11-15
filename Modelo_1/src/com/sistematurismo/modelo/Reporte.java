/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

import java.time.LocalDateTime;

/**
 *
 * @author ESTUDIANTE
 */
public abstract class Reporte {

    private final String titulo;
    private final LocalDateTime fechaGeneracion;

    protected Reporte(String titulo) {
        this.titulo = (titulo == null || titulo.isBlank()) ? "Reporte" : titulo.trim();
        this.fechaGeneracion = LocalDateTime.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    /**
     * Retorna el contenido textual del reporte — contrato que implementan las subclases.
     */
    public abstract String getContenido();

    /**
     * Genera el reporte usando getContenido(). Se puede sobrescribir si se desea
     * otro destino (archivo, PDF, etc.), pero por defecto imprime en consola.
     */
    public void generar() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ").append(getTitulo()).append(" ===\n");
        sb.append("Generado: ").append(getFechaGeneracion()).append("\n\n");
        sb.append(getContenido());
        System.out.println(sb.toString());
    }
}