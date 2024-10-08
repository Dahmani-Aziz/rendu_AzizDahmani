package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;

    public Zoo(String name, String city, int nbrCages) {

        setName(name);
        this.city = city;
        // nbrCages supprime
        this.animals = new Animal[nbrCages];
    }

    public void afficherZoo() {
        System.out.println(this);
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    /*public void addAnimal(tn.esprit.gestionzoo.entities.Animal animal, int place) {
        if (place >= 0 && place< 25) {
            animals[place] = animal;
        } else {
            System.out.println("25 animaux maximum");
        }
    }*/

    public boolean isZooFull() {
        for (Animal a : animals) {
            if (a == null) {
                return false;
            }
        }
        return true;
    }
    private int countAnimals() {
        int count = 0;
        for (Animal a : animals) {
            if (a != null) {
                count++;
            }
        }
        return count;
    }

    public boolean addAnimals(Animal animal) {
        if (isZooFull()) {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo plein");
            return false;
        }

        for (Animal a : animals) {
            if (a != null && a.getName().equals(animal.getName())) {
                System.out.println("tn.esprit.gestionzoo.entities.Animal existe deja");
                return false;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        return false;
    }


    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                animals[i] = null;
                System.out.println("tn.esprit.gestionzoo.entities.Animal " + animal.getName() + "supprime");
                return true;
            }
        }
        System.out.println("L'animal " + animal.getName() + "n'existe pas");
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int count1 = z1.countAnimals();
        int count2 = z2.countAnimals();

        if (count1 > count2) {
            return z1;
        } else if (count2 > count1) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null;
        }
    }


    public int searchAnimal(Animal animal){
        int index = -1;

        for(int i = 0 ; i <animals.length; i++){
            if(animals[i] != null && animals[i].getName().equals(animal.getName()) ){
                index = i+1;
            }
        }
        return index;
    }
    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Pas de nom vide");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
