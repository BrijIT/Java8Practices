package BasicJavaProgramming;

public class VolatileExample implements Runnable {
    private static volatile boolean stopRequested;


    @Override
    public void run() {
        int i=0;
        while(!stopRequested){
            i++;
        }
        System.out.println("BackGroundThread completed");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileExample v = new VolatileExample();

        Thread backGroundThread = new Thread(v);
        backGroundThread.start();

        Thread.sleep(1000);
        stopRequested=true;
    }

    
    
}
