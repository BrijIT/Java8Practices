package SortLimitSkip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, 2500));
        empList.add(new Employee(2, 1500));
        empList.add(new Employee(3, 5500));
        empList.add(new Employee(4, 6500));
        empList.add(new Employee(5, 2500));
        empList.add(new Employee(6, 9500));
        empList.add(new Employee(7, 3500));

        // Sort the Employee List in dec Order
        List<Employee> empSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(empSortedList);

        // Find first 3 Employee List in dec Order
        List<Employee> threeEmpSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(3).collect(Collectors.toList());
        System.out.println(threeEmpSortedList);

        // find 3rd Highest salary
        List<Employee> thirdEmpSortedList = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .skip(3).collect(Collectors.toList());
        System.out.println(thirdEmpSortedList);

    }

}
