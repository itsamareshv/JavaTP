package arrays;



import java.util.Arrays; 
import java.util.Collections;
import java.util.*;
 
public class SortingMap  
{   
    public static void main(String[] args) 
     
    {
        HashMap<Integer, String> unSortedMap = new HashMap<>();
     
    unSortedMap.put(20221108, "shiva   two_cokes   2022-07-06T11:40:35.090471300   5   1   2800.0   139.99   2939.79   Booked ");
    unSortedMap.put(20221109, "Amaresh   neat_and_clean   2022-07-06T11:39:26.538154700   2   1   1300.0   64.99   1364.79   Booked");
    unSortedMap.put(20221115, "Raju   Gobi   2022-07-06T11:42:13.162219300   3   1   1800.0   89.99000000000001   1889.79   Booked");
    unSortedMap.put(20221122, "Sohan   biryani   2022-07-06T11:41:26.053218600   1   3   1400.0   69.99   1469.79   Booked");
      
    LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
      
    unSortedMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
      
    System.out.println(sortedMap);
    
    }
}
