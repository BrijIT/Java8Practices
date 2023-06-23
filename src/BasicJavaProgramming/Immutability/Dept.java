package BasicJavaProgramming.Immutability;

public class Dept {

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept [deptName=" + deptName + "]";
    }


    
}
