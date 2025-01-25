
package assistedproblems.animalhierarchy;


// Main class to test the hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create objects of different animals
        Dog dog = new Dog("Dog1", 3);
        Cat cat = new Cat("cat1", 2);
        Bird bird = new Bird("bird1", 1);

        // Display their information and sounds
        dog.displayInfo();
        dog.makeSound();

        System.out.println();  // Adding space between outputs

        cat.displayInfo();
        cat.makeSound();

        System.out.println();  // Adding space between outputs

        bird.displayInfo();
        bird.makeSound();
    }
}