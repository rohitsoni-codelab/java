package scratch.Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class Hashtable_TreeHash {
    public static void main(String[] args) {
        
        Hashtable ht=new Hashtable();
        ht.put(1,"rohit");
        ht.put(4,"shyam");
        ht.put(3,"Chintu");
        ht.put(2,"mintu");
        System.out.println(ht);// sorted in decending order

        System.out.println("-----------------------------------------");

        TreeMap tm=new TreeMap();
        tm.put(1,"rohit");
        tm.put(4,"shyam");
        tm.put(3,"Chintu");
        tm.put(2,"mintu");
        System.out.println(tm);// sorted in accesding order

    }
    
}
