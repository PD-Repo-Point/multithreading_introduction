package defining_multithreading_using_runnable;

public class ThreadExample implements Runnable  { // Child Thread
    public void run(){
        int i = 1;
        while(i<20){
            System.out.println(i +" ");
            i++;
        }
    }
}
