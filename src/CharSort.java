import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharSort {
    public static void main(String[] args) {

        // initializing unsorted char array
        char cArr[] = {'q','p','s','r'};


        // sorting array from index 0 to 3
        Arrays.sort(cArr);

        // let us print all the values available in list
//        System.out.println(cArr);

            HashMap< String,Integer> hm = new HashMap< String,Integer>();
            hm.put("a",100);
            hm.put("b",200);
            hm.put("c",300);
            hm.put("d",400);

//            Set<Map.Entry<String,Integer>> st = hm.entrySet();  //returns Set view
            for(Map.Entry<String,Integer> me:hm.entrySet())
            {
                System.out.print(me.getKey()+":");
                System.out.println(me.getValue());
            }

    }
}