package sem_exm;

public class StaticMethod {
    static void message() {
        System.out.println("Hello, welcome to my Home!");
    }
    public static void main(String[] args) {
        StaticMethod.message();
        StaticOrder obj = new StaticOrder();
    }
}
