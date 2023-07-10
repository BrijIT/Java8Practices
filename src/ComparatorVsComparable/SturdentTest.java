package ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SturdentTest {
    public static void main(String[] args) {
        // Comparator<Student> com = new Comparator<Student>() {

        //     public int compare(Student i, Student j) {

        //         if (i.age > j.age)
        //             return 1;
        //         else
        //             return -1;

        //     }
        // };
        
        Comparator<Student> com =  (i,j) -> i.age > j.age?1:-1;

        

        List<Student> list = new ArrayList<>();
        list.add(new Student(29, "Brij"));
        list.add(new Student(31, "Mohan"));
        list.add(new Student(28, "Bharati"));
        list.add(new Student(25, "Ajay"));
        list.add(new Student(41, "Abhi"));

        Collections.sort(list, com);

        for (Student s : list)
            System.out.println(s);

            

    }

}
