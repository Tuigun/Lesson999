package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Dog dog = new Dog();
        dog.setName("Alabay");
        dog.setBreed("Dobot");
        dog.setCommands(new String[]{"run", "voice"});
        SHELTER shelter = new SHELTER("shelter #1", "ibraimova 100");
        dog.setSHELTER(shelter);

        dog.makevoice("AUF",2);
        dog.getInfo();


        Pet pet = new Pet();
        pet.setColor("Black");
        pet.setSHELTER(shelter);
        pet.setAge(6);



        Dog bulldog = new Dog("Brown", new SHELTER("Shelter","Centre"),
                "Bagira", "Bulldog");

        Dog Taygan =new Dog("Black", new SHELTER("Shelter","Centre"),
                "uchkun", "Taygan");

        Dog Layka = new Dog("white", new SHELTER("Shelter","Centre"),
                "Tangens", "Layka");



        Nissan Caldina = new Nissan("caldina ", 2014, Color.Black,"3");
        System.out.println(Caldina.getInfo());
        Caldina.makeLoud("Fuuup");
        Caldina.speed(190);


        Mitsubisi Type = new Mitsubisi("Type", 2015, Color.Brown, "3,5");
        System.out.println(Caldina.getInfo());


        Mitsubisi legend  = new Mitsubisi("legend", 2016, Color.Gray, "4.3");
        System.out.println("Mitsubisi");




    }

}
