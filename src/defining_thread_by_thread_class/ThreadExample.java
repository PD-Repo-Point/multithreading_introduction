package defining_thread_by_thread_class;

public class ThreadExample extends Thread{
    public void run(){
        int i = 1;
        while(i<20){
            System.out.println(i +" ");
            i++;
        }
    }
}
