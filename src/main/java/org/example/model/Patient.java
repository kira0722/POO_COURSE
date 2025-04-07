package org.example.model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double hight;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
        //mas instrucciones
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

    @Override
    public String toString() {
        return super.toString()+ "\nAge: "+ birthday + "\nWeight: "+ getWeight()+ "\n Height: "
                + getHight()+ "\nBlood: "+ blood;
    }
}
