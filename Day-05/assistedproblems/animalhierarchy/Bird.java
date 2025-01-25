package assistedproblems.animalhierarchy;


//Subclass
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);  // Calling the constructor of Animal
    }

    // Overriding the makeSound method for Bird
    void makeSound() {
        System.out.println(name + " makes sound");
    }
}