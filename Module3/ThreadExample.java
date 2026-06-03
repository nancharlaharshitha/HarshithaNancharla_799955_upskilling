class Thread1 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread1: "+i);
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Thread2: "+i);
        }
    }
}
public class ThreadExample{
    public static void main(String args[]){
        Thread t1=new Thread(new Thread1());
        Thread t2=new Thread(new Thread2());
        t1.start();
        t2.start();
    }
}