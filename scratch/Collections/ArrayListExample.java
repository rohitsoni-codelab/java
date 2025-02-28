package scratch.Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add(20);
        System.out.println(al1.add(30)); // It will print: true (because add() returns boolean)
        
        System.out.println(al1); // It will print the list: [20, 30]


        ArrayList al2= new ArrayList();

        al2.add(40);
        al2.addAll(al1);
        al2.set(0, "Rohit");
        
        Boolean b1=al2.contains(40);
        System.out.println(al2);
        System.out.println(b1);

        System.out.println("...............");
        System.out.println(al2.get(2));
    }
}
