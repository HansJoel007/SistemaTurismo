/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 * @param <T>
 */
public interface IGestionable<T> {

    /** Registra una entidad en el sistema
     * @param entidad **/
    void registrar(T entidad);

    /** Actualiza una entidad existente
     * @param entidad **/
    void actualizar(T entidad);

    /** Elimina una entidad del sistema
     * @param entidad **/
    void eliminar(T entidad);
}
