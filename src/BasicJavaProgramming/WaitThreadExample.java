package BasicJavaProgramming;

class TotalEarning extends Thread {
    int totals = 0;

    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                totals = totals + 100;
            }
            this.notify();
        }
    }
}

public class WaitThreadExample {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning totalEarning = new TotalEarning();
        totalEarning.start();
        //System.out.println("Total Earning:" + totalEarning.totals + "Rs.");
        synchronized (totalEarning) {
            totalEarning.wait();
            System.out.println("Total Earning:" + totalEarning.totals + "Rs.");
        }

    }

}
