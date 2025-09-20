package org.platzi;

public class Doctor {
    int id;
    String nombre;
    String especialidad;

    Doctor(){
        System.out.println("tu Doctor asignado");
    }
    Doctor(String nombre){
        System.out.println("El médico es: " + nombre);
    }
    public void mostrarNombre() {
        System.out.println(nombre);
    }
    public void mostrarEspeciealidad(){
        System.out.println(especialidad);
    }
}
