import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurence {
    public static void main(String[] args) {
        String str = "welcome to code decode and code decode welcome you";

        List<String> list = Arrays.asList(str.split(" "));

        System.out.println(list);

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

    }
}
