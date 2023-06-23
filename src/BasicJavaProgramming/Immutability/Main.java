package BasicJavaProgramming.Immutability;

public class Main {
    public static void main(String[] args) {
        // Employee emp = new Employee();
        // emp.setId(100);
        // emp.setName("Brij");

        //Case 1
        //For Achieve Immutability just remove setter methods make varibles private
        //So, Using Constructor you can set Values and achieve Immutability

        //Employee emp = new Employee("Brij",100);

        //Employee abc = new Employee("Ram",102);

        Dept d = new Dept();
        d.setDeptName("HR");
        Employee emp = new Employee("Jai", 200, d);

        System.out.println(emp);

        // emp.setId(101);
        // emp.setName("Smriti");

        //trying to change
        Dept d2 = new Dept();
        d2.setDeptName("TECHNICAL");

        

        System.out.println(emp);
        //System.out.println(abc);

        //Case 2
        //Now you have another class Dept, and I dont want to Make Dept Immutable , 
        //Whereas Immutability of Employee should not be Break
    }
    
}
