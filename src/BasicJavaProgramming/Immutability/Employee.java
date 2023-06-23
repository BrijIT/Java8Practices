package BasicJavaProgramming.Immutability;

final public class Employee {

    final private String name;
    final private int id;
    final private Dept dept;
    
    
    
    public Employee(String name, int id, Dept dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public int getId() {
        return id;
    }
    // public void setId(int id) {
    //     this.id = id;
    // }

    public Dept getDept() {
        Dept dd = new Dept();
        dd.setDeptName(dd.getDeptName());
        return dd;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + "]";
    }

    
    
    
}
