//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        System.out.println("It workssssssssssssssssssssssssssssss ");

        Zoo myZoo = new Zoo("MyZoo","Touneeeesss",25);
        Animal Lion = new Animal("cats","hassen",20,true);
        Animal Zebra = new Animal("Horses","yesss",35,false);
        Animal Dog = new Animal("dogs","Aziiizzz",21,true);

        myZoo.addAnimal(Lion,0);
        myZoo.addAnimal(Zebra,1);
        myZoo.addAnimal(Dog,2);


        int counter = 0;

        Animal[] animals = myZoo.getAnimals();

        while (counter < animals.length) {
            if (animals[counter] != null) {
                System.out.println("Animal "
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

    }
}