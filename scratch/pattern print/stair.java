import java.util.Scanner;

public class stair {
    public static void main(String[] args) {
        System.out.println("hello");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }




        System.out.println("Number 1(Butterfly 8-8)");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        // n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");

        }

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");

        }



        System.out.println("new pattern");
        for( int i = 1;i<=n;i++)
        {
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (int j = n; j >= 1; j--) {
            System.out.print("*");
        }
        System.out.println("\n");

    }
    

}
}