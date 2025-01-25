package hybridinheritance.restaurantmanagement;


// Subclass Waiter inheriting from Person and implementing Worker
class Waiter extends Person1 implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food.");
    }
}