package OptionalDemo;

import java.util.List;

public class Customer {
    private int id;
    private String email;
    private String name;

    private List<String> phoneNumber;

    public Customer(int id, String email, String name, List<String> phoneNumber) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    
    
}
