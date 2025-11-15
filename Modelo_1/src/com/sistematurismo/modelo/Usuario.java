/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.sistematurismo.modelo;

import java.util.Objects;

public abstract class Usuario {
    
    protected final long id;
    protected String nombre;
    protected String correo;
    protected String password;
    protected boolean activo = true;
    
    protected Usuario(long id, String nombre, String correo, String password) {
	
	if (id <= 0) throw new IllegalArgumentException("id debe ser positivo");
	if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
	if (correo == null || correo.isBlank()) throw new IllegalArgumentException("correo inválido");
	if (password == null || password.isBlank()) throw new IllegalArgumentException("password inválida");
	
	this.id = id;
	this.nombre = nombre.trim();
	this.correo = correo.trim().toLowerCase();
	this.password = password;
    }
    
    
    public long getId() { return id; }
    public String getNombre() { return nombre; }
    
    public String getCorreo() { return correo; }
    public boolean isActivo() { return activo; }
    
    
    public void setNombre(String nombre) {
	if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("nombre inválido");
	this.nombre = nombre.trim();
    }
    
    public void setCorreo(String correo) {
	if (correo == null || correo.isBlank()) throw new IllegalArgumentException("correo inválido");
	this.correo = correo.trim().toLowerCase();
    }
    
    public void setPassword(String password) {
	if (password == null || password.isBlank()) throw new IllegalArgumentException("password inválida");
	this.password = password;
    }
    
    
    public boolean validarCredenciales(String correo, String password) {
	if (!this.activo) return false;
	return this.correo.equalsIgnoreCase(correo) && this.password.equals(password);
    }
    
    public void suspender() { this.activo = false; }
    public void activar() { this.activo = true; }
    
    
    public abstract String getTipoUsuario();
    
    
    @Override
    public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Usuario)) return false;
	Usuario usuario = (Usuario) o;
	return id == usuario.id;
    }
    
    @Override
    public int hashCode() {
	return Objects.hash(id);
    }
    
    
    @Override
    public String toString() {
	return String.format("%s{id=%d, nombre='%s', correo='%s', activo=%s}",
		getTipoUsuario(), id, nombre, correo, activo ? "sí" : "no");
    }
}