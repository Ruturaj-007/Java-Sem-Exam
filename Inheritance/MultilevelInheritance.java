package sem_exm.Inheritance;

// In MULTILEVEL INHERITANCE, a derived class inherits from a base class, and this derived class also acts
// as a base class for another derived class.

class Grandparent {
    Grandparent() {
        System.out.println("I am the Grandparent");
    }
}
class Parent extends Grandparent {
    Parent() {
        System.out.println("I am the Parent");
    }
}
class Child extends Parent{
    Child () {
        System.out.println("I am the Child");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child(); // Calls constructors in order
    }
}
