package sem_exm;

public class Method_Overloading {
    void display() {
        System.out.println("Inside display");
    }

    void display(int i) {
        System.out.println("Display with Int : " + i);
    }

    void display(char c) {
        System.out.println("Display with Char : " + c);
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.display();
        obj.display(11);
        obj.display('H');
    }
}
