package sem_exm;

interface InterfaceA {
    void show();
}

interface InterfaceB {
    void print();
}

public class MultipleInterface implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        System.out.println("First interface");
    }

    @Override
    public void print() {
        System.out.println("Second interface");
    }

    public static void main(String[] args) {
        MultipleInterface obj =new MultipleInterface();
        obj.show();
        obj.print();
    }
}
