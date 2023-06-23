package OptionalDemo;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(100, null, "Brij", Arrays.asList("7890819068","9435675420"));

        System.out.println(customer);

        //empty
        //of
        //ofNullable

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // Optional<String> emailOptional = Optional.of(customer.getEmail());
        // System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        if(emailOptional2.isPresent()){
            System.out.println(emailOptional2.get());
        }

        System.out.println(emailOptional2.orElse("default@gmail.com"));

        System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email....."));
        
        
    }
    
}
