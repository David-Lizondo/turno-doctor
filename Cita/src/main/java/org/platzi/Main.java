package org.platzi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calendario médico");

        //Se crea una instancia de la clase Doctor con el constructor
        // que acepta parámetros
        Doctor myDoctor = new Doctor(1, "David Lizondo", "Psicologo");

        System.out.println("El Doctor asignado es: " + myDoctor.getName());
        System.out.println("Su especialidad es: " + myDoctor.getSpeciality());

        // También puedes usar los métodos de la clase Doctor
        myDoctor.showName();
        myDoctor.showSpeciality();
    }
}