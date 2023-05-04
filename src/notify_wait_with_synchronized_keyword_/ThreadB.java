package notify_wait_with_synchronized_keyword_;

public class ThreadB { // Main thread - Parent Thread
    public static void main(String[] args) throws InterruptedException {
        ThreadA threadA = new ThreadA();
        threadA.start();

        // threadA.join(); // - not recommended
        synchronized (threadA){
            threadA.wait(1000);
            System.out.println(threadA.sum);
        }





    }
}
