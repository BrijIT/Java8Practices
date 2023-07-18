package SingletonDesignPattern;

public class samosa {

    private static samosa sam;

    // constructor
    private samosa() {

    }

    // Lazy way to create single object
    public static samosa getSamosa() {
        // Object of this class
        if (sam == null) {
            synchronized (samosa.class) {
                if (sam == null) {
                    sam = new samosa();
                }
            }

        }
        return sam;

    }
    /*
     * 
     * 1. Constructor shoul be private.
     * 2. Object create with the help of method.
     * 3. Create field to store object should be private.
     */

}
