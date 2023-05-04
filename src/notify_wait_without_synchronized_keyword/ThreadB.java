package notify_wait_without_synchronized_keyword;

public class ThreadB { // Main thread - Parent Thread
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        threadA.start();

        // threadA.join(); // - not recommended as just to have
        // the sum value the join method needs to wait for the threadA to complete

        threadA.wait(1000); // RE : IllegalMonitorStateException
        System.out.println(threadA.sum);
    }
}
