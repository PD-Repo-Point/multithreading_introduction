package notify_wait_with_synchronized_keyword_;

public class ThreadA extends Thread{ // Child Thread
    int sum =0;
    public void run(){
        synchronized (this){
            for(int i = 0 ;i<10;i++){
                sum = sum+i;
            }
            this.notify();
        }
        /// -------
        /// ------ Thousand lines of code
        /// -------
        /// -----
    }
}
