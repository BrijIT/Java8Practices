package BasicJavaProgramming;

interface A {
    default void sayHello(){
        System.out.println("First Interface");
    }
    
}

interface B {
    default void sayHello(){
        System.out.println("Second Interface");
    }
    
}

interface C {
    static void sayBye(){
        System.out.println("Static Method Invoke");
    }
    
}

public class MyClassDefualtMethodsExample implements A, B{
    public static void main(String[] args) {
        MyClassDefualtMethodsExample myClass = new MyClassDefualtMethodsExample();
        myClass.sayHello();
        C.sayBye();

        
    }

    @Override
    public void sayHello() {
        B.super.sayHello();
    }
    
}
