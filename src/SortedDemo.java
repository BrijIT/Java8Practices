import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {

        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(5);
        arList.add(51);

        // arList.stream().sorted().forEach(x->System.out.println(x));

        Stream<Integer> openStream = arList.stream();
        // System.out.println(openStream);
        Stream<Integer> filteredStream = openStream.filter(e -> e > 5);
        // System.out.println(filteredStream);
        Stream<Integer> sortedStream = filteredStream.sorted();
        // System.out.println(sortedStream);

        // sortedStream.forEach(x->System.out.println(x));

        arList.stream().filter(i -> i > 5).sorted((i1, i2) -> i1.compareTo(i2)).forEach(x -> System.out.println(x));

        Integer min = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);

        Object[] arr = arList.stream().filter(x -> x > 5).toArray();
        for (Object o : arr)
            System.out.println("Element of Array:" + o);

        // Stream concept is not applicable to only collection it's also applicable for
        // "ANY GROUP OF VALUE"

        Stream.of(1, 11, 111, 1111, 11111, 111111, 1111111).forEach(x -> System.out.println(x));

        String[] name = { "ASSS", "BSSSSSS", "CEEDDAAD", "DADADADFADA", "EFDFDGDG", "QDS", "WDS", "ESDSDFSFSDFS", "R",
                "TFDF", "YMMMMMM" };

        Stream.of(name).filter(c -> c.length() > 3).forEach(x -> System.out.println(x));

    }

}
