import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDescendingOrderDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(51);
        arList.add(52);
        arList.add(53);
        arList.add(54);
        arList.add(5);

        Stream<Integer> newFilteredSortedList = arList.stream().sorted((i1,i2) -> i2.compareTo(i1));
        newFilteredSortedList.forEach(n->System.out.println(n));


        System.out.println("------------------------");

        
        Stream<Integer> newFilteredSortedList1 = arList.stream().filter(i->i>15).sorted((i1,i2) -> i2.compareTo(i1));
        newFilteredSortedList1.forEach(n->System.out.println(n));

    }
    
}
