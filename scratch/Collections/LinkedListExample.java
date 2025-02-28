package scratch.Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList ll1=new LinkedList();
        ll1.add(100);
        ll1.add("Rohit");
        ll1.add("AEC");
        ll1.add("Kittu");

        System.out.println(ll1);
        ll1.addFirst("Initial");
        ll1.addLast("Final");
        
        System.out.println(ll1);
    
    }
    
}
