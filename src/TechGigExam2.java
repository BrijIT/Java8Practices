
public class TechGigExam2 {

    {
        System.out.println("first Block");
    }

    TechGigExam2() {
        System.out.println("default Block");
    }

    TechGigExam2(int x) {
        System.out.println(x);
    }

    {
        System.out.println("Second Block");
    }

    public static void main(String[] args) {
        new TechGigExam2();
        new TechGigExam2(10);

    }

}
