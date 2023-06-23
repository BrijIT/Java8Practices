package BasicJavaProgramming;

interface InterfaceExample {

    int a=10;
    void show();

    default void display() {
        System.out.println("Calling Display....");

    }

    static void message() {
        System.out.println("Call Message....");

    }

}

interface InterfaceExample2 {

    void show2();

    
    
}

class Test implements InterfaceExample, InterfaceExample2{

    @Override
    public void display(){
        System.out.println("Hi.......");
    }

    @Override
    public void show() {
        System.out.println("Calling Show Method....");
     }

     @Override
    public void show2() {
        System.out.println("Calling Show-2 Method....");
    }

     public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.show2();
        test.display();
        InterfaceExample.message();
     }
    

}
