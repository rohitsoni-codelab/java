package scratch.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashStud{
    private int age;
    private String name;
    private String city;
    
    public HashStud(int age, String name, String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String toString()
    {
        return name+" "+age+" "+city;

    }
    
}


public class HashmapExample2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        HashStud s1=new HashStud(21, "Rajiv", "Dhanbad");
        HashStud s2=new HashStud(25, "Rounak", "Jhariya");
        HashStud s3=new HashStud(23, "Ravina", "Asansol");

        HashMap hm=new HashMap();
        hm.put(1, s1);
        hm.put(2, s2);
        hm.put(3, s3);

        System.out.println(hm);

        System.out.println("----------------------------------------");

        Set entrySet=hm.entrySet();
        Iterator itr=entrySet.iterator();

        while(itr.hasNext())
        {   
            // System.out.println(itr.next());
            Map.Entry data=(Map.Entry)itr.next();
            System.out.println(data.getKey()+" "+ data.getValue());
            
        }
    }
    
}
