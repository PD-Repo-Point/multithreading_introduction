package thread_priority;

public class Main { // Parent Thread
    public static void main(String[] args) {

        System.out.println("Main Thread priority before setting the priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(4);
        // Output : Main Thread priority before setting the priority : 5

        System.out.println("Main Thread priority after setting the priority : "+Thread.currentThread().getPriority());
        // Output : Main Thread priority after setting the priority : 4

        Thread thread1 = new Thread(new ThreadExample());
        System.out.println("Thread1 priority before setting the priority : "+thread1.getPriority());
        // Output : Thread1 priority before setting the priority : 4

        // The default priority of a main thread is 5. For all remaining threads the default priority
        // will be inherited from parent thread to child thread.

        thread1.setPriority(3); // Setting the priority of a child Thread

        thread1.start();

        System.out.println("Thread1 priority after setting the priority : "+thread1.getPriority());
        // Output : Thread1 priority after setting the priority : 3
    }
}
