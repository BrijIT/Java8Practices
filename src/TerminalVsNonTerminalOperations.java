import java.util.Arrays;
import java.util.List;



public class TerminalVsNonTerminalOperations {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Code1");
        Employee e2 = new Employee(2, "Code22");
        Employee e3 = new Employee(3, "Code333");
        Employee e4 = new Employee(4, "Code4444");


        List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        //filter return another Stream
        
        
        //peek is for debugging means what will be the exact outcome after filter/map
        //intList.stream().filter(e -> e % 2 == 0).peek(System.out::println).map(e -> e+e).filter(e->e>5).forEach(e->System.out.println(e));

        intList.stream().filter(e -> e % 2 == 0).map(e -> e+e).filter(e->e>5).forEach(e->System.out.println(e));

        //forEach is terminal operation, without terminal non-terminal will never occur or called

        empList.stream().filter(e -> e.getId() % 2 == 0).map(e -> {
            e.printaName();;
            return e.getName();
        }).forEach(e -> System.out.println("At Last "+e));




    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    public void printaName() {
        System.out.println("In Emp Class " + name);
    }

}
