package scratch.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Employee {
    private int age;
    private String name;
    private String city;

    public Employee(int age, String name, String city) {
        this.age = age;
        this.name = name;
        this.city = city;

    }

    public String toString() {
        return age + " " + name + " " + city;
    }

}

public class WeakHashMapExample {

    public static void main(String[] args) {

        HashMap hm1=new HashMap();
        Employee e1 = new Employee(21, "Shyama", "Brij");
        System.out.println(e1);


        hm1.put(e1,"Rohit");
        e1=null;
        System.gc();
        System.out.println(hm1);



        System.out.println("--------------------------------------------------------");

        WeakHashMap hm=new WeakHashMap();
        Employee e = new Employee(23, "Kanhiya", "Gokul");
        System.out.println(e);


        hm.put(e,"Rohit");
        e=null;
        System.gc();
        System.out.println(hm);
    }

}
