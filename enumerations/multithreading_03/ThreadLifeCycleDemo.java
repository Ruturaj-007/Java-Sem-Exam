package sem_exm.enumerations.multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread state inside run() (before sleep): " + this.getState());

            Thread.sleep(500);  // TIMED_WAITING
            System.out.println("Thread State inside run() (after sleep): " + this.getState());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        System.out.println("State after creating thread : " + t.getState());  // NEW

        t.start();  // RUNNABLE
        System.out.println("State after calling start(): " + t.getState());

        try {
            Thread.sleep(100); // Give time to go inside run()
            System.out.println("State while thread is sleeping: " + t.getState()); // TIMED_WAITING

            t.join();  // Wait until thread finishes
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State after thread completed: " + t.getState()); // TERMINATED
    }
}
