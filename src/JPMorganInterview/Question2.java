package JPMorganInterview;

import java.util.HashMap;

import java.util.Iterator;

public class Question2 {
    public static void main(String[] args) {
        String s = "india is my Country";
        s=s.replaceAll("\\s", "");
        char[] ch = s.toCharArray();

        HashMap<String, Integer> map = new HashMap<>();

        for(char c: ch){
            String str = String.valueOf(c);
            if(map==null){
                map = new HashMap<>();
            }

            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                int val = map.get(str);
                //System.out.println("[Key: "+map.get(str)+"]  value["+val+"]");
                map.put(str, val+1);
            }
            
        }

        Iterator<HashMap.Entry<String, Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext()){
            HashMap.Entry<String, Integer> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());

        }
        
        
    }
    
}
