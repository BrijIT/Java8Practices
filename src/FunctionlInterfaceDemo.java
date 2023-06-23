
@FunctionalInterface
public interface FunctionlInterfaceDemo {
    
    void singleAbsMethod();

    //void singleAbsMethod2();

    default void printName(){
        System.out.println("Welcome to Code Decode");
    }

    default void printName2(){
        System.out.println("Welcome to Code Decode");
    }




}
