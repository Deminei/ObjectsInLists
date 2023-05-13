public class Animal {
    public String name;//Attributes
    public boolean dog;

    //Animal constructor
    public Animal(String animalName, boolean dog) {
        this.name = animalName;
        this.dog = dog;
    }
    public Animal(String animalName) {
        this.name = animalName;
    }

    //Getters
    public String getName() {

        return name;
    }
    public boolean isDog() {
        return dog;
    }
    @Override//Overrides print output to use getters within this toString() method to print attributes
    public String toString() {
        return getName()+ " is a dog = " + isDog();
    }

}
