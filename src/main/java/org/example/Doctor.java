package org.example;

public class Doctor {
    static int id = 1; //Autoincremental
    String name;
    String speciality;

    Doctor(){
        System.out.println("construyendo el objeto doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor es: " +name);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
}
