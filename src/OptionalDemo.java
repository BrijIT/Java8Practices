import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String name = null;

        // Creating an Optional object
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName);

        // Checking if a value is present
        if (optionalName.isPresent()) {
            System.out.println("Name id present: " + optionalName.get());
        } else {
            System.out.println("Name is Absent");
        }

        // Default value using orElse
        String defaultValue = optionalName.orElse("Default Name");
        System.out.println(defaultValue);

        String defaultValueFromSupplier = optionalName.orElseGet(() -> generateDefaultName());
        System.out.println("Name from Supplier: " + defaultValueFromSupplier);

        Optional<String> optName = Optional.ofNullable(name);
        optName.ifPresentOrElse(n -> System.out.println("Name is Present " + n.toUpperCase()),
                () -> System.out.println("Name not found"));

    }

    private static String generateDefaultName() {
        return "Generated Default Name";
    }

}
