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



        Dog bulldog = new Dog("Brown", new SHELTER() "Bagira", "Bulldog")





    }
}
