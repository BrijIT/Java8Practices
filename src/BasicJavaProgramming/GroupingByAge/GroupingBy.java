package BasicJavaProgramming.GroupingByAge;

import java.util.List;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, 25, "Raj"));
        empList.add(new Employee(2, 30, "Ravi"));
        empList.add(new Employee(3, 25, "Shyam"));
        empList.add(new Employee(4, 30, "Ram"));
        empList.add(new Employee(4, 30, "Ram"));
        empList.add(new Employee(6, 24, "jai"));
        empList.add(new Employee(7, 29, "krish"));

        // Map<Integer, Set<Employee>> empMap = empList.stream()
        //         .collect(Collectors
        //                 .groupingBy(emp -> emp.getAge(),TreeMap::new, Collectors.toSet()));
        // System.out.println(empMap);

        BitSet obj = new BitSet(5);
		for(int i=0; i<5; ++i)
			obj.set(i);
			obj.clear(2);
			System.out.println(obj.length() +""+obj.size());

		}

    }

}
