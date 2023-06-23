import java.util.ArrayList;
import java.util.List;

public class ToArrayDemo {
    public static void main(String[] args) {

        List<Integer> arList = new ArrayList<Integer>();
        arList.add(25);
        arList.add(15);
        arList.add(51);
        arList.add(52);
        arList.add(53);
        arList.add(54);
        arList.add(5);


        Object[] intArrOneLine = arList.stream().filter(i->i>=25).toArray();
        
        for(Object o : intArrOneLine){
            System.out.println(o);
        }
        
    }
    
}
