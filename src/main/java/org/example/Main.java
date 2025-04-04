package org.example;

import java.sql.SQLOutput;
import java.util.Date;

import static org.example.ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

//        showMenu();
//
        Doctor myDoctor = new Doctor("Ana gonzalez", "pediatria@gmail.com");


        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

//        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
//            System.out.println(aA.getDate()+ " " + aA.getTime());
//        }

        Patient patient = new Patient("Alejandra", "aleja@gmail.com");

        System.out.println(patient);









    }

}












// CODIGO NO NECESARIO DE AHORA EN ADELANTE
//        Patient patient2 = new Patient("anahi", "ana@gmail.com");
//System.out.println(patient.getName());
//        System.out.println(patient2.getName());
//
//        patient2 = patient;
//
//        System.out.println(patient.getName());
//        System.out.println(patient2.getName());
//
//        patient.setWeight(54.6);
//        System.out.println(patient.getWeight());
//
//        patient.setPhoneNumber("12345678");
//        System.out.println(patient.getPhoneNumber());