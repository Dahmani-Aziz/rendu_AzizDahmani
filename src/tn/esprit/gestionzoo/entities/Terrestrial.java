package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.Food;
import tn.esprit.gestionzoo.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }


    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial animal is eating meat.");
        } else {
            System.out.println("Terrestrial animals can only eat meat or both.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial animal is eating plants.");
        } else {
            System.out.println("Terrestrial animals can only eat plants or both.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial animal is eating both plants and meat.");
    }
}
