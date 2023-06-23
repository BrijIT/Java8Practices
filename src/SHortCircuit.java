import java.util.Arrays;
import java.util.List;

public class SHortCircuit {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Code_decode_updated1", "Code_decode_updated2", "code", "decode",
                "circuit");
        System.out.println("--------------------------");

        nameList.stream().limit(2).forEach(x -> System.out.println(x));

        System.out.println("--------------------------");

        System.out.println(nameList.stream().filter(emp -> emp.contains("Code_decode")).findFirst().get());

        System.out.println("--------------------------");

        System.out.println(nameList.parallelStream().filter(emp -> emp.contains("Code_decode")).findAny().get());

        System.out.println("--------------------------");

        // It performs like OR operation
        Boolean itContains = nameList.stream().anyMatch(emp -> emp.contains("cirm"));
        System.out.println(itContains);

        System.out.println("--------------------------");

        // It performs like AND operation
        Boolean itContains1 = nameList.stream().allMatch(emp -> emp.contains("new"));
        System.out.println(itContains1);

        System.out.println("--------------------------");

        // It performs reverse  operation
        Boolean itContains2 = nameList.stream().noneMatch(emp -> emp.contains("new"));
        System.out.println(itContains2);

        System.out.println("--------------------------");

    }

}
