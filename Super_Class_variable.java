package sem_exm;

// Accessing parent class variable

class Vehicle {
    int speed = 50;
}

class Bike extends Vehicle {
    int speed = 100;
    void display() {
        System.out.println(speed);          // prints Child speed = 100
        System.out.println(super.speed);    // prints parent speed = 50
    }
}
public class Super_Class_variable {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.display();
    }
}
