public class MethodReferenceDemo{
    public static void main(String[] args) {
        FunctionlInterfaceDemo functionlInterfaceDemo = Test :: testImplementation;
        functionlInterfaceDemo.singleAbsMethod();

        // FunctionlInterfaceDemo f = ()-> System.out.println("IMPLEMENTATION OF SAM");
        // f.singleAbsMethod();
    }

    class Test{
        public static void testImplementation() {
            System.out.println("This is test implementation of your abstract method");
        }
    }

    
}
