package defining_thread_by_thread_class;

public class Main {
    public static void main(String[] args) {

        // 1 threads ---- main
        System.out.println("Number of Active Threads : "+Thread.activeCount());

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("First Thread");
        thread1.start();

        // 2 threads ---- thread1 and main
        System.out.println("Number of Active Threads : "+Thread.activeCount());

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Second Thread");
        thread2.start();

        // 3 threads ---- thread1, thread2 and main
        System.out.println("Number of Active Threads : "+Thread.activeCount());

    }
}
