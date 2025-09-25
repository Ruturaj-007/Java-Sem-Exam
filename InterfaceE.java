package sem_exm;

interface InterfaceA1 {
    void show1();
}

interface InterfaceK1 {
    void show2();
}

interface InterfaceC extends InterfaceA1, InterfaceK1 {
    void show3();
}

public class InterfaceE implements InterfaceC {
    public void show1() {
        System.out.println("Base First Interface");
    }
    public void show2() {
        System.out.println("Base Second Interface");
    }
    public void show3() {
        System.out.println("Child Interface");
    }

    public static void main(String[] args) {
        InterfaceE obj = new InterfaceE();
        obj.show1();
        obj.show2();
        obj.show3();
    }
}
