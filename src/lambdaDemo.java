import java.util.function.BiConsumer;

public class lambdaDemo {
    public static void main(String[] args) {
        // lambdaDemo lambdaDemo = new lambdaDemo();
        // lambdaDemo.add(3, 4);


        //Using Java8
        BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a+b);
        biConsumer.accept(2, 4);
    }

    // public void add(Integer a, Integer b){
    //     System.out.println(a+b);
    // }
    
}
