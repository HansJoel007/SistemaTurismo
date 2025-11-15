/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistematurismo.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Administrador extends Usuario {

    public enum Rol { ADMIN_GENERAL, GESTOR_RUTAS, GESTOR_DESTINOS, SOPORTE }

    private final Rol rol;

    public Administrador(long id, String nombre, String correo, String password, Rol rol) {
        super(id, nombre, correo, password);
        this.rol = (rol == null ? Rol.GESTOR_DESTINOS : rol);
    }

    public Rol getRol() { 
        return rol; 
    }

    @Override
    public String getTipoUsuario() { 
        return "Administrador"; 
    }

    @Override
    public String toString() {
        return String.format(
            "Administrador{id=%d, nombre='%s', correo='%s', rol=%s, activo=%s}",
            id, nombre, correo, rol, activo ? "sí" : "no"
        );
    }
}