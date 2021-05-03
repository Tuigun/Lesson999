package com.company;

public class Dog extends Pet {

    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
        super();



    }

    public Dog( String color, SHELTER shelter, String name, String breed,
               String[] commands) {
        super.setColor(color);
        super.setSHELTER(shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog( String color, SHELTER shelter, String name, String breed
                ) {
        super.setColor(color);
        super.setSHELTER(shelter);
        this.name = name;
        this.breed = breed;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makevoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);

        }
    }

    public void makevoice(int number, String voice) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);


        }

    }

    public void makevoice(String voice) {

        System.out.println(voice);

    }
    public String getInfo(){
        return super.getInfo() + "\nname: "+ name + "\nbreed" + breed + "\ncommands" + commands;
    }
}