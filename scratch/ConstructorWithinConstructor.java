package scratch;
class Demo1{
    protected int age;
    protected String name;
    public Demo1()
    {
        this(21,"Santi");
        age=19;
        name="Rohit";
        System.out.println("one");
    }
    public Demo1(int age)
    {
        this.age=age;
        name="Raghav";
        System.out.println("two");
    }
    public Demo1(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println("three");
    }
    public void disp()
    {
        System.out.println("age="+age);
        System.out.println("name="+name);
    }
}
public class ConstructorWithinConstructor {

    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        d1.disp();
    }
    
}
