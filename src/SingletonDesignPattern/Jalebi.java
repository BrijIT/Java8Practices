package SingletonDesignPattern;

public class Jalebi {

    //Eager way to create Object 
    private static Jalebi jalebi = new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
    
}
