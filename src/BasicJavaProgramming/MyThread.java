package BasicJavaProgramming;

public class MyThread extends Thread {
public void run(){
    for(int i =1;i<=5;i++){
        
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        System.out.println(i);
    }
}
public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
}    
}
