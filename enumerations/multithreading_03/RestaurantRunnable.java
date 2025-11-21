package sem_exm.enumerations.multithreading_03;

class CookingJob implements Runnable {
    private String dish;

    CookingJob(String dish) {
        this.dish = dish;
    }

    public void run() {
        System.out.println(dish + " is being prepared by " + Thread.currentThread().getName());
    }
}

public class RestaurantRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CookingJob("Soup"));
        Thread t2 = new Thread(new CookingJob("Pizza"));
        Thread t3 = new Thread(new CookingJob("Burger"));

        t1.start();
        t2.start();
        t3.start();
    }

}
