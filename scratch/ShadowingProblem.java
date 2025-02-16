package scratch;
import java.util.*;
class Student{
    int age;
    String name;
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class ShadowingProblem {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(23);
        s1.setName("Rohit");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        
    }
    
}
