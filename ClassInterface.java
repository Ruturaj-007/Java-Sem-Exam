package sem_exm;

interface InterfaceX1 {
    void show();
}

interface InterfaceY1 extends InterfaceX1 {
    void print();
}

public class ClassInterface implements InterfaceY1 {
    public void show() {
        System.out.println("Base interface in interface X1");
    }

    public void print() {
        System.out.println("Derived interface in Interface Y1");
    }

    public static void main(String[] args) {
        ClassInterface obj = new ClassInterface();
        obj.show();
        obj.print();
    }
}
