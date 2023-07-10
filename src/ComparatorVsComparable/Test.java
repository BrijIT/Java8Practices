package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;

            }
        };

        List<Integer> num = new ArrayList<>();
        num.add(48);
        num.add(95);
        num.add(53);
        num.add(26);

        

        System.out.println(num);
        Collections.sort(num, com);
        System.out.println(num);
    }

}
