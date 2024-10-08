package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        System.out.println("-------------------------------------");

        Animal genericAnimal = new Animal();
        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        Zoo myZoo = new Zoo("MyZoo","Touneeeesss",25);
        Animal Lion = new Animal("cats","hassen",20,true);
        Animal Zebra = new Animal("Horses","yesss",35,false);
        Animal Dog = new Animal("dogs","Aziiizzz",21,true);

        myZoo.addAnimals(Lion);
        myZoo.addAnimals(Zebra);
        myZoo.addAnimals(Dog);
        myZoo.addAnimals(Lion);

        int counter = 0;

        Animal[] animals = myZoo.getAnimals();

        while (counter < animals.length) {
            if (animals[counter] != null) {
                System.out.println("tn.esprit.gestionzoo.entities.Animal "
                        + (counter + 1) + ": "
                        + animals[counter].getName()
                        + ", Family: " + animals[counter].getFamily()
                        + ", Age: " + animals[counter].getAge() + ", Is Mammal: "
                        + animals[counter].isMammal());
            }
            counter++;
        }

        System.out.println("-----------------------------------------");
        myZoo.afficherZoo();

        System.out.println("-----------------------------------------");
        System.out.println("index de l'animal :  " + myZoo.searchAnimal(Lion)); // s'il y a deux lions , il affiche l'index du deuxième




    }
}