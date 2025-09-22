package org.platzi;

public class Doctor {
    private int id;
    private String name;
    private String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showSpeciality() {
        System.out.println(speciality);
    }
}