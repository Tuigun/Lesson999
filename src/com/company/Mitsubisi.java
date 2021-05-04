package com.company;

public final class Mitsubisi extends Nissan{

    private String Speed;

    public Mitsubisi( String model , int year, Color color, String power ){
        super (model, year, color, power);
        this.Speed = Speed;
    }
    public String getSpeed(){
        return Speed;
    }

    public void getPower(int number ) {
        int coef = 3;
        System.out.println("Max speed" + (number*coef));
    }
}
