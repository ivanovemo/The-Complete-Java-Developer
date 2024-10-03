public class AnimalDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Rino", 100);
        animals[1] = new Cat("Bruno", 90);
        animals[2] = new Dog("Ares", 80);
        animals[3] = new Cat("Puhi", 70);
        animals[4] = new Dog("Beki", 60);

        Animal temp = new Dog("TempDog", 12);
        System.out.println(temp.makeNoise());

        Dog myDog = new Dog("Rover", 70);
        Cat myCat = new Cat("Tom", 20);

        System.out.println(myDog.move());
        System.out.println(myCat.move());
        System.out.println();

        printAnimals(animals);
    }

    public static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Weight: " + animal.getWeight());
            System.out.println("Animal says: " + animal.makeNoise());
            System.out.println();
        }
    }
}
