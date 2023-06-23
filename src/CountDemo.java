import java.util.ArrayList;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(5);

        long count = arList.stream().filter(i-> i>=20).count();
        System.out.println(count);
    }
    
}
