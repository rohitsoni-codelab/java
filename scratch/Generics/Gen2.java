package scratch.Generics;

import java.util.ArrayList;
class Stud{
    private String name;
     
    public Stud(String name)
    {
        this.name=name;
    }
    public String toString(){
        return name;
    }
}

public class Gen2 {
    public static void main(String[] args) 
    {
        Stud s1=new Stud("Rajan");
        Stud s2=new Stud("Rohit");
        ArrayList<Stud> al=new ArrayList<Stud>();
        al.add(s1);
        al.add(s2);
        System.out.println(al);

        
        

    }
    
}
