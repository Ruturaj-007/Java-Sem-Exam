package sem_exm;

// Invoking parent class Constructor

class Vehicl {
    Vehicl() {
        System.out.println("Vehicle is created");
    }
}
class Car extends Vehicl {
    Car() {
        super();
        System.out.println("Car is created");
    }
}
public class Super_Constructor {
    public static void main(String[] args) {
        Car obj1 = new Car();
    }
}
