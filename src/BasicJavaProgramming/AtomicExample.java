package BasicJavaProgramming;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample implements Runnable {

    private AtomicInteger count = new AtomicInteger();

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(i * 100);
                count.getAndIncrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    public int getCount() {
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {

        AtomicExample r = new AtomicExample();
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count:" + r.getCount());
    }
    
}
