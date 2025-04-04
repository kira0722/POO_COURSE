package org.example;

public class Patient {
    int id = 1;
    private String name;
    private String email;
    private String addres;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double hight;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + " kg");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero debe ser de 8 digitos maximo");
        }else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + "Kg. ";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHight() {
        return this.hight + "Mts.";
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
