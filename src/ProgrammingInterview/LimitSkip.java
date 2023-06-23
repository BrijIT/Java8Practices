package ProgrammingInterview;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);

        
        list.stream().limit(7).forEach(x->System.out.println(x));

        System.out.println("------------------------------------------");

        list.stream().skip(7).forEach(x->System.out.println(x));

        
    }

   
    

    
    
}
