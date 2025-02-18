package scratch;
class Demo{
    int a;
    String name;


    public Demo()
    {
        System.out.println("This is for parameterized constructor");
    }

    public Demo(int a)
    {
        this.a=a;
    }
    public void disp()
    {
        System.out.println(a);
    }
}
public class Constructors {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.disp();

        Demo d2=new Demo(19);
        d2.disp();
    }
    
}
