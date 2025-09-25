package sem_exm;

// B) Static Nested Class

public class Outerr {
    static class  Nested_Demo {
        void my_method() {
            System.out.println("This is my static nested class");
        }
    }

    public static void main(String[] args) {
        Outerr.Nested_Demo nested = new Nested_Demo();
        nested.my_method();
    }
}
