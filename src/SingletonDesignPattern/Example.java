package SingletonDesignPattern;

public class Example {
    public static void main(String[] args) {
        samosa sam = samosa.getSamosa();
        
        System.out.println(sam.hashCode());

        samosa sam1 = samosa.getSamosa();
        
        System.out.println(sam1.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
        

    }
    
}
