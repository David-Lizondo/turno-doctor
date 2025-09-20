package org.platzi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calendario médico");

        String nombre;
        Doctor myDoctor = new Doctor();
        myDoctor.especialidad = "Psicologo";
        myDoctor.mostrarEspeciealidad();

    }
}