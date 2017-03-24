/*
 * Program:HookaMap
 * This:4/11/2016
 * Author:
 * Date:
 * Purpose:
 */
package hookamap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HookaMap {


    public static void main(String[] args) 
    {
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        map.put("One",1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("One", 7);
        for(String key: map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
        Set<String> set = new LinkedHashSet<String>();
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("elephant");
        System.out.println(set);
        
        Taco t1 = new Taco("Nick",1);
        Taco t2 = new Taco("Bob",2);
        Taco t3 = new Taco("carl",3);
        Set<Taco> tacoSet = new LinkedHashSet<Taco>();
        tacoSet.add(t1);
        tacoSet.add(t2);
        tacoSet.add(t3);
        System.out.println(tacoSet);
    }
    
}
