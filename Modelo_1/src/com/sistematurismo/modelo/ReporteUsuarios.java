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
public class ReporteUsuarios extends Reporte {

    public ReporteUsuarios() {
        super("Reporte de Usuarios");
    }

    @Override
    public String getContenido() {
        StringBuilder sb = new StringBuilder();
        SistemaTurismo sistema = SistemaTurismo.getInstancia();

        List<Turista> turistas = sistema.getTuristas();
        List<Administrador> administradores = sistema.getAdministradores();

        sb.append("=== ").append(getTitulo()).append(" ===\n\n");

        // ---- Turistas ----
        if (turistas.isEmpty()) {
            sb.append("No hay turistas registrados.\n\n");
        } else {
            sb.append("TURISTAS:\n");
            sb.append("---------------------------------\n");

            for (Turista t : turistas) {
                sb.append("ID: ").append(t.getId()).append("\n");
                sb.append("Nombre: ").append(t.getNombre()).append("\n");
                sb.append("Edad: ").append(t.getEdad()).append("\n");
                sb.append("---------------------------------\n");
            }
        }

        // ---- Administradores ----
        if (administradores.isEmpty()) {
            sb.append("\nNo hay administradores registrados.\n");
        } else {
            sb.append("\nADMINISTRADORES:\n");
            sb.append("---------------------------------\n");

            for (Administrador a : administradores) {
                sb.append("ID: ").append(a.getId()).append("\n");
                sb.append("Nombre: ").append(a.getNombre()).append("\n");
                sb.append("Rol: ").append(a.getRol()).append("\n");
                sb.append("---------------------------------\n");
            }
        }

        return sb.toString();
    }
}
