package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;

    Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }







    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecuality: "+ speciality + "\nAvailable: "+ availableAppointments.toString();
    }

    public  static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

//Available_appoinment

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoinments \nDate: "+ date + "\nTime: "+ time;
        }
    }
}



