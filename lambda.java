package sem_exm;

// Lambda Expression

@FunctionalInterface // An Interface Which only has 1 method
interface A {
    void show();
}

public class lambda {
    public static void main(String[] args) {
//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println("In show");
//            }
//        };
//         obj.show

        A obj = () -> {
            System.out.println("in show");
        };
        obj.show();
    }
}
