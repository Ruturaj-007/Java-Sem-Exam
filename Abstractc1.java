package sem_exm;
abstract class Fruit {
    abstract void show();
}

class Apple extends Fruit {
    @Override
    void show() {
        System.out.println("Apple");
    }
}

class Mango extends Fruit {
    @Override
    void show() {
        System.out.println("Mango");
    }
}
public class Abstractc1 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        a1.show();

        Mango m1 = new Mango();
        m1.show();
    }
}
