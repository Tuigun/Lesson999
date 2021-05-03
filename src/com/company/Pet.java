package com.company;

import java.util.Random;

public class Pet {

    private int age;
    private String color;
    private SHELTER SHELTER;


    public Pet (int age,String color, SHELTER shelter ){
        this.age = age;
        this.color = color;
        this.SHELTER = shelter;
    }

    public Pet() {

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;

    }
    public void setColor(String color ){
        this.color = color;

    }
    public SHELTER getSHELTER(){
        return SHELTER;
    }
    public void setSHELTER(SHELTER shelter){
        this.SHELTER = shelter;
    }
    public int generateDefaultAge(){
        return new Random().nextInt(14)+1;
    }
    public String getInfo(){
        return "Age " + age + "\ncolor: " + color + "\nshelter:" + SHELTER;
    }




}
