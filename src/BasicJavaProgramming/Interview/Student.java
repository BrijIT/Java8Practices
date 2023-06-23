package BasicJavaProgramming.Interview;

final public class Student {
    final private String name;
    final private int id;
    final private Address address;

    
    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }

    public Student(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
    }
   
    
    
    
}
