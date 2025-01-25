package assistedproblems.animalhierarchy;
//superclass
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Method to display the animal name and age
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}






