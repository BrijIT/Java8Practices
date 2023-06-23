package BasicJavaProgramming;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


public class FailFastFailSafe {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            list.add("five");
            System.out.println(itr.next());
        }


        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            map.put(5, "Five");
            map.remove(3);

            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());

        }
        
    }
    
}
