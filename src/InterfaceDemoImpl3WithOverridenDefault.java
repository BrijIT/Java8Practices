public class InterfaceDemoImpl3WithOverridenDefault implements InterfaceDemo {

    @Override
    public void printName() {
        System.out.println("Welcome to overridden method by code decode");
    }

    public static void main(String[] args) {
        InterfaceDemoImpl3WithOverridenDefault interfaceDemoImpl3WithOverridenDefault = new InterfaceDemoImpl3WithOverridenDefault();
        interfaceDemoImpl3WithOverridenDefault.printName();
    }
    
}
