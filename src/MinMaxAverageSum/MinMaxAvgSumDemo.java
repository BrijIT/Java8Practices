package MinMaxAverageSum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxAvgSumDemo {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Brij", 34));
        empList.add(new Employee(2, "Ram", 35));
        empList.add(new Employee(3, "Ravi", 37));
        empList.add(new Employee(4, "Ankit", 33));
        empList.add(new Employee(5, "Rachit", 31));
        empList.add(new Employee(6, "Mohan", 29));

       List<Integer> ages =  empList.stream().map(emp->emp.getAge()).collect(Collectors.toList());
       System.out.println(ages);

       //Get Max Age
       System.out.println("Employee Max Age: "+ ages.stream().mapToInt(x->x).summaryStatistics().getMax());

       //Get Min Age
       System.out.println("Employee Min Age: "+ ages.stream().mapToInt(x->x).summaryStatistics().getMin());


       //Get Avg Age
       System.out.println("Employee Avg Age: "+ ages.stream().mapToInt(x->x).summaryStatistics().getAverage());

       //Get Sorted Age
       List<Integer> sortedAges =  empList.stream().map(emp->emp.getAge()).sorted().collect(Collectors.toList());
       System.out.println("Sorted Ages:" +sortedAges);

       //Get 2nd, 3rd Youngest Age
       System.out.println("SliceAges: "+sortedAges.stream().skip(1).limit(2));

       //Convert String to uppercase and Join with coma
       List<String> nameList = empList.stream().map(emp->emp.getName()).collect(Collectors.toList());
       String names =  nameList.stream().map(emp->emp.toUpperCase()).collect(Collectors.joining(", "));
       System.out.println(names);

       
        
    }
    
}
