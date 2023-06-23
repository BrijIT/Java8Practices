import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(5990);

        arList.stream().map(i -> i*i).collect(Collectors.toList()).forEach(n -> System.out.println(n));
    }
    
}
