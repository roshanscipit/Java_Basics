package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Iterator;

class IteratorDemo {

    public static void main(String args[])
    {
        // fail-fast example

        // List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        // Iterator<String> it = list.iterator();

        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        //     list.add("E"); // This will cause ConcurrentModificationException
        // }

        //fail-safe example
        Map<String, String> map = new java.util.concurrent.ConcurrentHashMap<>();
        map.put("1", "A");
        map.put("2", "B");

        Iterator<String> mapIt = map.values().iterator();
        while(mapIt.hasNext())
        {
            System.out.println(mapIt.next());
            map.put("3", "C"); // This will NOT cause ConcurrentModificationException
        }
    }
    
}