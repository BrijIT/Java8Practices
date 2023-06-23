import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        consumerDemo.squareInt(4);


        Consumer<Integer> squareMe = i -> System.out.println("taking an input and performing some operation :" +i*i);
        squareMe.accept(9);
        
    }

    public  void squareInt (int i){
        System.out.println("Squared Number is "+i*i);
    }
    
}
