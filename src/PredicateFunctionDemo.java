import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {
        // PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
        // System.out.println(predicateFunctionDemo.testStringLength("code decode"));

        Predicate<String> checkLength = s -> s.length() >= 5;
        System.out.println("The Length of string i sgreater than 5: "+ checkLength.test("code"));

    }

    // public boolean testStringLength(String s) {
    //     if (s.length() >= 5) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

}
