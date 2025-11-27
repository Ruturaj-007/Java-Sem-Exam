package sem_exm.Inheritance;
// In HIERARCHICAL INHERITANCE, more than one subclass is inherited from a single base class. i.e. more than one derived class
// is created from a single base class. For example, cars and buses both are vehicle

class Animal{
    Animal () {
        System.out.println("This is a Animal");
    }
}

class Dog extends Animal {
    Dog () {
        System.out.println("This is a dog");
    }
}

class Cat extends Animal {
    Cat () {
        System.out.println("This is a cat");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
    }
}
