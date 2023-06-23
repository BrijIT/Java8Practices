package MapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
            new Customer(101, "Johan", "johan@gmail.com", Arrays.asList("8909876789","8765456789")),
            new Customer(102, "brij", "brij@gmail.com", Arrays.asList("6900076789","8765456789")),
            new Customer(103, "mohan", "mohan@gmail.com", Arrays.asList("7909876789","8765456789")),
            new Customer(104, "ram", "ram@gmail.com", Arrays.asList("9909876789","8765456789")),
            new Customer(105, "ravi", "ravi@gmail.com", Arrays.asList("1909876789","8765456789"))

        ).collect(Collectors.toList());
    }
    
}
