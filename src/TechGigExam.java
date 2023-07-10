// import java.util.NavigableSet;
// import java.util.TreeSet;

class Base {
    void show() {
        System.out.println("show1()");
    }
}

class Derived extends Base {
    @Override
    void show() {
        super.show();
        System.out.println("show2()");
    }

}

public class TechGigExam {
    public static void main(String[] args) {
        // NavigableSet<Integer> setNumber = new TreeSet<>();
        // setNumber.add(11);
        // setNumber.add(12);
        // setNumber.add(13);
        // setNumber.headSet(14);
        // System.out.println(setNumber);

        System.out.println("----------------");
        Base obj = new Derived();
        obj.show();

        System.out.println("----------------");

        Base obj1 = new Base();
        obj1.show();

        System.out.println("----------------");

        Derived obj2 = new Derived();
        obj2.show();
    }
}
