import java.util.Scanner;
public class Function{
    public static int sum(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number=");
        int a=sc.nextInt();
        System.out.println("Enter second number=");
        int b=sc.nextInt();
        // sum(a,b);
        System.out.println(sum(a, b));
    }
}