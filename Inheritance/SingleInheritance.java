package sem_exm.Inheritance;

// Base class
class Vehicle {
    Vehicle() {
        System.out.println("This is a vehicle");
    }
}

// Subclass
class Bus extends Vehicle {
    Bus() {
        System.out.println("This is a bus");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Bus obj = new Bus();
    }
}
