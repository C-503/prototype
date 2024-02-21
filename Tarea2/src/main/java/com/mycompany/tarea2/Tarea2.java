
package com.mycompany.tarea2;

public class Tarea2 {

    public static void main(String[] args){
        Usuario usuario1 = new Usuario();
        usuario1.setEdad(16);
        usuario1.setApellidos("Gutierrez Guerrero");
        usuario1.setEstadoCivil("Soltera");
        usuario1.setNombre("Vanessa");
        
        Usuario usuario2 = usuario1.clone();
        usuario2.setEstadoCivil("Casada");
        
        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
