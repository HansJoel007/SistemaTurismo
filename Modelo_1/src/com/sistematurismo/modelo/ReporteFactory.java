/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public final class ReporteFactory implements IReporteFactory {

    public enum TipoReporte { DESTINOS, RUTAS, EVENTOS, USUARIOS }

    @Override
    public Reporte crearReporte(ReporteFactory.TipoReporte tipo) {
        if (tipo == null) throw new IllegalArgumentException("tipo nulo");

        return switch (tipo) {
            case DESTINOS -> new ReporteDestinos();
            case RUTAS    -> new ReporteRutas();
            case EVENTOS  -> new ReporteEventos();
            case USUARIOS -> new ReporteUsuarios();
        };
    }
}
