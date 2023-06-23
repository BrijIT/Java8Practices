package BasicJavaProgramming;

public class SleepThreadExample {
    public static void main(String[] args) throws InterruptedException{
        for(int i =1; i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
    
}
