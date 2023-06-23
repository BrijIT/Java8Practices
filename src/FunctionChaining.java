import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {

        Function<Integer, Integer> doubleIt = i -> 2*i;
        System.out.println("Double function :" +doubleIt.apply(2));


        Function<Integer, Integer> cubeIt = i -> i*i*i;
        System.out.println("Cube Function :" +cubeIt.apply(2));

        System.out.println("First double using andThen "+ doubleIt.andThen(cubeIt).apply(2));

        System.out.println("First cubing using compose "+ doubleIt.compose(cubeIt).apply(2));
        
    }
    
}
