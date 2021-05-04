package com.company;

public class Nissan extends Car {

    private String power;

    public Nissan (String model, int year, Color color, String power  ){
        super (model, year,color);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String Drive() {
        return super.Drive();
    }

    @Override
    public void speed(int number) {
        System.out.println("Max Speed to" + number);
    }

    @Override
    public void makeLoud(String loud) {
        System.out.println(loud);
    }
    public String getInfo(){
        return getModel() + " " + getYear() + " " + getColor() + " " + getPower() + " ";
    }
}




