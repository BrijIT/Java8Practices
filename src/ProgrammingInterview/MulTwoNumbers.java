package ProgrammingInterview;

import java.util.function.BiFunction;

public class MulTwoNumbers {
    public static void main(String[] args) {

        MulTwoNumbers mulTwoNumbers = new MulTwoNumbers();
        System.out.println(mulTwoNumbers.multiply(2, 4));

        BiFunction<Integer, Integer, Integer> mul = (a,b)->a*b;
        System.out.println(mul.apply(3, 4));
        
        
    }

    public int multiply (int a, int b){
        return a*b;
    }

    


    
    
    
}

