package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stringtest {
    public static void main(String[] args) {
        Comparator<String> com = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else
                    return -1;

            }

        };

        List<String> list = new ArrayList<>();
        list.add("Brij");
        list.add("Mohan");
        list.add("Bharati");
        list.add("Om");
        list.add("Ramanujam");
        list.add("Joy");

        System.out.println(list);
        Collections.sort(list, com);
        System.out.println(list);

    }

}
