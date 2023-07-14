package CustomeException;

class UnderAgeRTException extends RuntimeException {
    UnderAgeRTException() {
        super();
    }

}

public class RunTimeException {
    public static void main(String[] args) {
        int age = 14;
        try {
            if (age < 18) {
                throw new UnderAgeRTException();
            } else {
                System.out.println("You can Vote!");
            }
        } catch (UnderAgeRTException e) {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

}
