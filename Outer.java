package sem_exm;

// A) Non-Static Nested Class (Inner Class)

public class Outer {
    class Inner {
        public void show() {
            System.out.println("Inside Inner class");
        }
    }
    public void display() {
        System.out.println("Inside display");
        Inner in = new Inner();
        in.show();
    }
}
 class Test {
     public static void main(String[] args) {
         Outer obj = new Outer();
         obj.display();
     }
 }
