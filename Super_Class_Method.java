package sem_exm;
// Invoking Parent class method

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        super.sound(); // calls parent class method
        sound();       // calls child class method
    }
}
public class Super_Class_Method {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
