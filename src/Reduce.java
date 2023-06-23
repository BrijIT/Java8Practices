import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(11,12,13,14,15);

        System.out.println(intList.stream().reduce((a,b) -> a+b).get());
    }
}
