package org.example;

import static org.example.ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Ana gonzalez", "pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);


        Patient patient = new Patient("Alejandra", "aleja@gmail.com");
        Patient patient2 = new Patient("anahi", "ana@gmail.com");

//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());
//
//        patient2 = patient;
//
//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());



    }

}

