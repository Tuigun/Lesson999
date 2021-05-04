package com.company;

public class Car {

    private String Model;
    private int year;
    private Color color;

    public Car(String model, int year, Color color) {
        Model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }
    public String Drive (){
        return "go";
    }
    public void speed (int number) {

    }
    public void makeLoud (String loud ){

    }
}

