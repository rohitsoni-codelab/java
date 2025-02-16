package scratch;

import java.util.Scanner;

class LoanFarmer{
    int pa;
    static float ri;
    static{
        ri=8.5f;
    }
    float t;
    float si;
    public void set()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle amount=");
        pa=sc.nextInt();
        System.out.println("Enter Time=");
        t=sc.nextFloat();
    }
    public void compute()
    {
        si=(pa*ri*t)/100;
    }
    public void disp()
    {
        System.out.println("Simple Intrest is"+si);
    }
}

public class AssignmentFarmer {
    public static void main(String[] args)
    {
        LoanFarmer f1=new LoanFarmer();
        f1.set();
        f1.compute();
        f1.disp();

        LoanFarmer f2=new LoanFarmer();
        f2.set();
        f2.compute();
        f2.disp();
    }
    
}
