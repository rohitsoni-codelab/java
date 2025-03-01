package scratch.Map;

import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Iterator;
// import java.util.HashMap;
// import java.util.Set;


// import javax.swing.text.html.HTMLDocument.Iterator;

public class HashmapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(18, "Virat");
        map.put(7, "Dhoni");
        map.put(8, "Jadeja");
        map.put(11, "Sachin");
        map.put(null, null);

        System.out.println(map);

        System.out.println(map.get(18));

        System.out.println("---------------------");
        Set key = map.keySet();
        Iterator itr1 = key.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());


        }

        System.out.println("---------------------");
        Collection values=map.values();
        Iterator itr2=values.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
        System.out.println("---------------------");
        Set entrySet=map.entrySet();
        Iterator itr3=entrySet.iterator();

        while(itr3.hasNext())
        {
            // System.out.println(itr3.next());
            Map.Entry data=(Map.Entry)itr3.next();
            System.out.println(data.getKey()+" and "+ data.getValue());
        }
    }
}
