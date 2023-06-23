package GroupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {

    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Brij");
        Employee e2 = new Employee(101, "Mohan");
        Employee e3 = new Employee(102, "Brij");
        Employee e4 = new Employee(103, "Mohan");
        Employee e5 = new Employee(104, "Bharati");

        List<Employee> listEml = new ArrayList<Employee>();
        listEml.add(e1);
        listEml.add(e2);
        listEml.add(e3);
        listEml.add(e4);
        listEml.add(e5);

        // System.out.println(listEml);

        List<String> names = listEml.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(names);

        Map<String, Long> mapOfNames = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(mapOfNames);

        Set<String> uniqueName = mapOfNames.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).collect(Collectors.toSet());

        System.out.println(uniqueName);

    }

}
