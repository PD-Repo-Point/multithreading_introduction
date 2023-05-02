package thread_priority;

public class ThreadExample implements Runnable{ // Child Thread
    public void run(){
        int i = 1;
        while(i<20){
            System.out.println(i +" ");
            i++;
        }
    }
}
