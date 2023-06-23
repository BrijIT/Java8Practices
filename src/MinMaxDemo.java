import java.util.ArrayList;
import java.util.List;

public class MinMaxDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(51);
        arList.add(52);
        arList.add(53);
        arList.add(54);
        arList.add(5);

        Integer minValue = arList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);

        System.out.println("---------------------");

        Integer maxValue = arList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);
        
    }
    
}
