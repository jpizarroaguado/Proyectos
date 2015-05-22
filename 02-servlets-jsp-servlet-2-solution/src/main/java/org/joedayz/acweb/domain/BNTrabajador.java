package org.joedayz.acweb.domain;
import java.io.Serializable;
import java.util.Date;


public class BNTrabajador implements Serializable {
	
  private static final long serialVersionUID = -2L;
  
  public int id;
    
   public String nombre;
    
   public String apellidop;
    
   public String apellidom;
    
   public String dni;
   
   public String correo;
    
   public int estado;
    
   public int audicodusuario;
      
   public Date fechaingreso;

   public Date fechamod;

   public String direccion;
    
   public String foto;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidop() {
	return apellidop;
}

public void setApellidop(String apellidop) {
	this.apellidop = apellidop;
}

public String getApellidom() {
	return apellidom;
}

public void setApellidom(String apellidom) {
	this.apellidom = apellidom;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public int getEstado() {
	return estado;
}

public void setEstado(int estado) {
	this.estado = estado;
}

public int getAudicodusuario() {
	return audicodusuario;
}

public void setAudicodusuario(int audicodusuario) {
	this.audicodusuario = audicodusuario;
}

public Date getFechaingreso() {
	return fechaingreso;
}

public void setFechaingreso(Date fechaingreso) {
	this.fechaingreso = fechaingreso;
}

public Date getFechamod() {
	return fechamod;
}

public void setFechamod(Date fechamod) {
	this.fechamod = fechamod;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getFoto() {
	return foto;
}

public void setFoto(String foto) {
	this.foto = foto;
}

   
   
}
