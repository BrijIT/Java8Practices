package CustomeException;


//Checked Exception
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are Under age");
    }

    UnderAgeException(String message){
        super(message);
    }

    UnderAgeException(Throwable cause){
        super(cause);
    }
}

public class CompileTimeException {
    public static void main(String[] args) {
        int age=17;
        if(age<18){
            try {
                throw new UnderAgeException("Oh no! You r under age....");
            } catch (UnderAgeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("You can Vote Now!");
        }
        
    }
    
}
