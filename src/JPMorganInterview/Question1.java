package JPMorganInterview;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();
        map.put(new Employee("Brij", 21), "Delhi");
        map.put(new Employee("Mohan", 12), "Noida");
        map.put(new Employee("Bharati", 32), "Vns");
        map.put(new Employee("Ram", 11), "Jaipur");
        map.put(new Employee("Pukar", 51), "Mumbai");


        System.out.println(map.size());

    
}
    
}
