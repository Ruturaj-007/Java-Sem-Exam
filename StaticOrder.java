package sem_exm;

public class StaticOrder {
    static int count = 0;
    static int a = 10, b;
    static void displayMessage() {                          // Method
        System.out.println("Hello, Msg is displayed");
    }
    StaticOrder() {                                         // Variable
        count++;
    }
    static{                                                 // Block
        System.out.println("Hello, I'm inside the static Block");
        b = a * 4;
    }
    public static void main(String[] args) {
        StaticOrder.displayMessage();
        StaticOrder objA = new StaticOrder();
        System.out.println("No of objects Created : " + objA.count);
        System.out.println(StaticOrder.a + " " + StaticOrder.b);
    }
}
