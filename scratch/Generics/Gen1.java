package scratch.Generics;

import java.util.ArrayList;
import java.util.Iterator;



public class Gen1 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();// enabled data safety
        al.add("radha");
        al.add("mohan");
        // al.add(38);// it will generate error
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}
