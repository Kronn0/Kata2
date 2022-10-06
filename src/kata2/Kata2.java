package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int [] data = {1,3,5,3,2,7,7,7,8,9,2,3,6,1,0};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
               histogram.put(data[i],histogram.get(data[i])+1);
            }else{
               histogram.put(data[i], 1);
            }
        }
       
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value : " + entry.getValue());
            
        }

    }
    
}