package Lecture15;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Wildcards
public class Test1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Pet1> p = new ArrayList<>();
        p.add(new Pet1());
        p.add(new Pet1());

        iterateAnimals(animals);
        iterateAnimals(pets);
        iterateAnimals(dogs);
        iterateAnimals(Collections.singleton(p));
    }
    public static void iterateAnimals(Collection< ? super Dog> animals){
        for(int i = 0; i < animals.size(); i++){
            System.out.println("Еще один шаг в цикле пройден!");
        }
    }
}
