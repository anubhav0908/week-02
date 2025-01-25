package assistedproblems.animalhierarchy;

// Cat class (Subclass)
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);  // Calling the constructor of Animal
    }

    // Overriding the makeSound method for Cat
    void makeSound() {
        System.out.println(name + " makes sound");
    }
}