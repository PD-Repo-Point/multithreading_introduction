package defining_multithreading_using_runnable;

public class Main {
    public static void main(String[] args) {

        System.out.println("Number of Active Threads : "+Thread.activeCount()); // 1 - Main
        System.out.println("Current Thread Name : "+Thread.currentThread().getName());

        // Defining a Thread by :-
        // 1. By implementing Runnable interface
        Thread thread1 = new Thread(new ThreadExample());
        // Starting thread1
        thread1.start();

        // 2. By implementing Runnable interface with an Anonymous class
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 1;
                while(i<20){
                    System.out.println(i +" ");
                    i++;
                }
            }
        });
        // Starting thread2
        thread2.start();

        // 3. By implementing Runnable interface with a Lambda Expression
        Thread thread3 = new Thread(() -> {
            int i = 1;
            while(i<20){
                System.out.println(i +" ");
                i++;
            }
            }
        );
        // Starting thread3
        thread3.start();

    }
}