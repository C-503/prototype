
package com.mycompany.tarea2;

import java.util.Objects;

public class Usuario implements Cloneable{

    private String nombre;
    
    private String apellidos;
    
    private int edad;
    
    private String estadoCivil;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return edad == usuario.edad && Objects.equals(nombre, usuario.nombre) && Objects.equals(apellidos, usuario.apellidos) && Objects.equals(edad, usuario.edad) && Objects.equals(estadoCivil, usuario.estadoCivil);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre, apellidos, edad, estadoCivil);
    }
    
    @Override
    protected Usuario clone(){
       Usuario cloneUsuario = new Usuario();
       
       cloneUsuario.setNombre(this.getNombre());
       cloneUsuario.setEdad(this.getEdad());
       cloneUsuario.setApellidos(this.getApellidos());
       cloneUsuario.setEstadoCivil(this.getEstadoCivil());
        return cloneUsuario;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " Apellidos: "+ apellidos + " Edad: " + edad + " Estado Civil: " + estadoCivil;
    }
    
}
