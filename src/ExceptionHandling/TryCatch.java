package ExceptionHandling;

import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("d:/test");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            // System.out.println(e.toString());
        } finally {
            System.out.println("oooooooooooo");
        }
    }

}
