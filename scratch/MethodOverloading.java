package scratch;

class Calc1
{
    public int add(int a,int b)
    {
        int res1=a+b;
        return res1;
    }

    public int add(int a,int b,int c)
    {
        int res1=a+b+c;
        return res1;
    }
    public double add(double a,double b,double c)
    {
        double res1=a+b+c;
        return res1;
    }
}
public class MethodOverloading {

    public static void main(String[] args)
    {
        Calc1 obj1= new Calc1();
        int res1=obj1.add(5,4);
        System.out.println(res1);
        System.out.println(obj1.add(5,6,3));
        System.out.println(obj1.add(5.3,5.2,.6));
    }
}
