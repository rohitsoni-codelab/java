package scratch;
import java.util.*;
class Demo0{
    int age;
    String name;

    public Demo0()
    {
        System.out.println("Zero parameterized constructor");
        age=19;
        name="Rohit";
    }
    public Demo0(int age)//constructor overloading
    {
        System.out.println("age parameter constructor");
        this.age=age;
        name="Shubham";
    }
    public Demo0(int age, String name)//constructor overloading
    {
        System.out.println("age and name parameter constructor");
        this.age=age;
        this.name=name;
    }
    public void disp()// method
    {
        System.out.println(age);
        System.out.println(name);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//--> user input lene ke liye scanner class banaye...
        Demo0 d1=new Demo0();
        d1.disp();//-->
        Demo0 d2=new Demo0(23);
        d2.disp();
        Demo0 d3=new Demo0(34,"raj");
        d3.disp();


        System.out.print("Enter any name=");
        String naam=sc.next();//user input liyeee...

        Demo0 d5=new Demo0(20, naam);//
        d5.disp();

    }
    
}
