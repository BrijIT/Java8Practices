import java.util.function.Consumer;

public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Integer> squareMe = i -> System.out.println("taking an input and performing square operation :" +i*i);
        squareMe.accept(9);

        Consumer<Integer> doubleMe = i -> System.out.println("taking an input and performing double operation :" +2*i);
        doubleMe.accept(9);

        squareMe.andThen(doubleMe).accept(9);

    }
    
}
