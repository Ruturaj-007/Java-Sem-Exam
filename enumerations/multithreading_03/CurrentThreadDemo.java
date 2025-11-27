package sem_exm.enumerations.multithreading_03;

class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();  // Obtain reference to main thread
        System.out.println("Current thread: " + t);

        // Change thread name
        t.setName("XYZ");
        System.out.println("After name change: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(2000); // Pause for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
