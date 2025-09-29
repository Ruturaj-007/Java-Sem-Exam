package sem_exm;

@FunctionalInterface
interface B {
    void shows(int i);
}

public class lambda_2 {
    public static void main(String[] args) {
//        B obj = new B() {
//            @Override
//            public void shows(int i) {
//                System.out.println("In show : " + i);
//            }
//        };
//        obj.shows(10);

        B obj = (int i) -> {
            i++;
                System.out.println("In show : " + i);
            };
        obj.shows(10);
    }
}
