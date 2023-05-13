import java.util.Scanner;
import java.util.ArrayList;
public class AnimalMain {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<>();
        Animal animal1 = new Animal("Chihuahua", true);
        Animal animal2 = new Animal("Snek");
        animal.add(animal1);
        animal.add(animal2);
        System.out.println("Animal Menu ૮ ⚆ﻌ⚆ა");
        System.out.println("Entering nothing will stop the loop");

        //Read the animal name entered while condition is still true
        while (true) {
            System.out.print("Please enter a name: ");
            String animalName = scanner.nextLine();
            // continue to add names until "done" is entered
            if (animalName.trim().isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? Yes or no: ");
            String dogInput = scanner.nextLine();
            boolean dog = dogInput.equalsIgnoreCase("yes");

            // Add animal to the list
            animal.add(new Animal(animalName, dog));
        }
        //animal in animals Animal array list prints animals
        for (Animal animals: animal) {
            System.out.println(animals);
        }
    }
}
