import java.util.Arrays;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {

        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

        this.animals = new Animal[25];
    }

    public void afficherZoo() {
        System.out.println(this);
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal);
            }
        }
    }

    public void addAnimal(Animal animal, int place) {
        if (place >= 0 && place< 25) {
            animals[place] = animal;
        } else {
            System.out.println("Le zoo va contenir 25 animaux maximum");
        }
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
        this.name = name;
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

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
