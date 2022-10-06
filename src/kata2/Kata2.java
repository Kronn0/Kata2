package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer [] data = {1,3,5,3,2,7,7,7,8,9,2,3,6,1,0};
        HistogramGenerator<Integer> histogramGenerator = new HistogramGenerator(data);
        Map<Integer, Integer> histogram = histogramGenerator.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value : " + entry.getValue());
            
        }

    }
    
}
