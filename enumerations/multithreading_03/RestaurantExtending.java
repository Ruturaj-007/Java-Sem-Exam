package sem_exm.enumerations.multithreading_03;

class CookingTask extends Thread {  // Custom thread class
    private String dish;

    CookingTask(String dish) {
        this.dish = dish;
    }

    @Override
    public void run() {             // Contains the code that actually runs when thread starts.
        System.out.println(dish + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class RestaurantExtending {
    public static void main(String[] args) {
        Thread t1 = new CookingTask("Masala Papad");
        Thread t2 = new CookingTask("Pasta");
        Thread t3 = new CookingTask("Pizza");
        Thread t4 = new CookingTask("Dessert");

        t1.start();                 // Calling .start() tells the JVM to run run() in a separate path
        t2.start();                 // Calling start() runs them concurrently.
        t3.start();
        t4.start();

    }
}
