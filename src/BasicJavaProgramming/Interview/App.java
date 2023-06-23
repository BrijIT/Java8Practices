package BasicJavaProgramming.Interview;

public class App {
    public static void main(String[] args) {

        Address address =  new Address("Varanasi","UP");
        

        Student stu = new Student("Brij",900, address);
        System.out.println(stu);

        Address add = stu.getAddress();
        add.setCity("Patna");
        add.setState("Bihar");

        System.out.println(stu);
    }
    
}
