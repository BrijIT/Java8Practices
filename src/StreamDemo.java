import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(5);

        // without Stream
        // List<Integer> arListFromMethod = findElements(arList);
        // for (Integer i : arListFromMethod) {
        //     System.out.println(i);
        // }

        List<Integer> newArList = new ArrayList<Integer>();
        newArList = arList.stream().filter(i -> i>=15).collect(Collectors.toList());
        newArList.stream().forEach(x->System.out.println(x));

    }

    // public static List<Integer> findElements(List<Integer> arList) {
    //     List<Integer> newAl = new ArrayList<Integer>();
        
    //     for (Integer i : arList) {
    //         if (i >= 15) {
    //             newAl.add(i);
    //         }
    //     }

    //     return newAl;

    // }

}
