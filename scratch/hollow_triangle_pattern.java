package scratch;
import java.util.*;

public class hollow_triangle_pattern {

    public static void printPattern(int n)
    {
        int i, j, k;

        for (i = 1; i <= n; i++) {
          
            // inner loop to print spaces.
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
          
            for (k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    // Driver Function
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=sc.nextInt();
        printPattern(n);
        sc.close();
    }
}

