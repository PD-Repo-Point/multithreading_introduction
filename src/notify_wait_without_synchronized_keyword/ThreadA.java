package notify_wait_without_synchronized_keyword;

public class ThreadA extends Thread{ // Child Thread
    int sum =0;
    public void run(){

        for(int i = 0 ;i<10;i++){
            sum = sum+i;
        }
        this.notify(); // RE : IllegalMonitorStateException

        /// -------
        /// ------ Thousand lines of code
        /// ------- x
        /// -----
    }
}
