package JPMorganInterview;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Interview1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        arr.stream().map(n -> n * 5).
                                    collect(Collectors.toList()).
                                    forEach(num -> System.out.println(num));;

    }

    

    
}
