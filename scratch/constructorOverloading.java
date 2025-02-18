package scratch;
class Demo{
    int age;
    String name;

    public Demo()
    {
        System.out.println("Zero parameterized constructor");
        age=19;
        name="Rohit";
    }
    public Demo(int age)
    {
        System.out.println("age parameter constructor");
        this.age=age;
        name="Shubham";
    }
    public Demo(int age, String name)
    {
        System.out.println("age and name parameter constructor");
        this.age=age;
        this.name=name;
    }
    public void disp()
    {
        System.out.println(age);
        System.out.println(name);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.disp();
        Demo d2=new Demo(23);
        d1.disp();
        Demo d3=new Demo(34,"raj");
        d1.disp();

    }
    
}
