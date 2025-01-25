package assistedproblems.animalhierarchy;
// subclass
class Dog extends Animal {
    // Constructor for Dog (calls the superclass constructor)
    Dog(String name, int age) {
        super(name, age);  // Calling the constructor of Animal
    }

    // Overriding the makeSound method for Dog
    void makeSound() {
        System.out.println(name + " makes sound");
    }
}
