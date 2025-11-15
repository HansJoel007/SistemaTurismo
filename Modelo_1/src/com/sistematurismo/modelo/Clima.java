/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ESTUDIANTE
 */
package com.sistematurismo.modelo;

import java.time.LocalDateTime;



public final class Clima {

    private String estado;
    private double temperatura; // En grados Celsius
    private LocalDateTime fechaActualizacion;

    public Clima(String estado, double temperatura) {
        setEstado(estado);
        setTemperatura(temperatura);
        this.fechaActualizacion = LocalDateTime.now();
    }


    public String getEstado() {
        return estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }


    public void setEstado(String estado) {
        if (estado == null || estado.isBlank())
            throw new IllegalArgumentException("Estado del clima inválido");
        this.estado = estado.trim().toLowerCase();
    }

    public void setTemperatura(double temperatura) {
        // puedes ajustar el rango según tu ciudad o tu criterio
        if (temperatura < -30 || temperatura > 60)
            throw new IllegalArgumentException("Temperatura fuera de rango razonable");
        this.temperatura = temperatura;
    }


    public void actualizar(String nuevoEstado, double nuevaTemp) {
        setEstado(nuevoEstado);
        setTemperatura(nuevaTemp);
        this.fechaActualizacion = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return String.format(
                "Clima{estado='%s', temperatura=%.1f°C, actualizado=%s}",
                estado, temperatura, fechaActualizacion
        );
    }
}

