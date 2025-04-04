package org.example;

public class Doctor {
    static int id = 1; //Autoincremental
    String name;
    String speciality;
    String email;

    Doctor(){
        System.out.println("construyendo el objeto doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor es: " +name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
}
