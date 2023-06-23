import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();
        System.out.println(functionDemo.squareInt(8));


        Function<Integer, Integer> squareMe = i -> i*i;
        System.out.println("Square of given number is :" +squareMe.apply(9));
        
    }

    public int squareInt(int i){
        return i*i;

    }
    
}
