package BasicJavaProgramming;

public class EncapsulationExample {
    private int empid;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

class Company {
    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setEmpid(10022);
        System.out.println(encapsulationExample.getEmpid());

    }
}
