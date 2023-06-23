package BasicJavaProgramming;

import java.util.HashMap;
import java.util.HashSet;

public class EqualsHashcodeContract {
    public static void main(String[] args) {

        Employee emp1 = new Employee("200", "Ruby");
        Employee emp2 = new Employee("200", "Ruby");

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        
        HashSet<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee("100", "Brij"));
        hashSet.add(new Employee("100", "Brij"));
        hashSet.add(new Employee("100", "Brij"));
        hashSet.add(new Employee("100", "Brij"));
        hashSet.add(new Employee("100", "Brij"));

        for (Employee emp : hashSet) {
            System.out.println(
                    "Emp Id: " + emp.getEmpId() + " Emp Name: " + emp.getEmpName() + " Hash Code:" + emp.hashCode());
        }

        HashMap<Employee, String> hashMap = new HashMap<>();
        hashMap.put(new Employee("100", "Brij"), "Testing1");
        hashMap.put(new Employee("100", "Brij"), "Testing1");
        hashMap.put(new Employee("100", "Brij"), "Testing1");
        hashMap.put(new Employee("100", "Brij"), "Testing1");
        hashMap.put(new Employee("100", "Brij"), "Testing1");

        System.out.println(hashMap);

    }

}

class Employee {
    private String empId;
    private String empName;

    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee))
            return false;

        if (obj == this)
            return true;

        return this.empId == ((Employee) obj).empId &&
                this.empName == ((Employee) obj).empName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((empId == null) ? 0 : empId.hashCode());
        return result;

    }

}
