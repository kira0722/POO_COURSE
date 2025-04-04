package org.example;

import static org.example.ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("pepito");
        doctor.name = "carlitos";
        doctor.showName();
        doctor.showId();
        doctor.showId();

        showMenu();

    }

}

