package JPMorganInterview;

public class Question3 {

   

    public static void main(String[] args) {
        class A {
            public void fun(Integer i) {
                System.out.println("Integer");
    
            }
    
            public void fun(String i) {
                System.out.println("String");
    
            }
        }

        A a = new A();
        a.fun(null);


    }

}
