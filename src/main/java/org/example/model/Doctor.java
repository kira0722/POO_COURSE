    package org.example.model;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.ArrayList;
    import java.util.Date;

    public class Doctor extends User {


        private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


        public Doctor(String name, String email){
            super(name,email);
        }


        public void addAvailableAppointment(String date, String time){


            availableAppointments.add(new Doctor.AvailableAppointment(date,time));
        }

        public ArrayList<AvailableAppointment> getAvailableAppointments(){
            return availableAppointments;
        }

        @Override
        public String toString() {
            return super.toString() + "\nSpeciality: " + "\nAvailable: "+ availableAppointments.toString();
        }


        public  static class AvailableAppointment{
            private int id;
            private Date date;
            private String time;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    //Available_appoinment

            public AvailableAppointment(String date, String time) {
                try {
                    this.date = format.parse(date);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Date getDate(String DATE) {
                return date;
            }

            public String getDate() {
                return format.format(date);
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

        @Override
        public void showDataUser() {
            System.out.println("Empleado del Hospital: Cruz Roja");
            System.out.println("Departamento: Cancerologia");
        }
    }



