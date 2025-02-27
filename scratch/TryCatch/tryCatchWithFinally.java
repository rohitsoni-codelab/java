package scratch.TryCatch;
import java.util.*;
public class tryCatchWithFinally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter=");
            int num=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Use only integer");
        }
        finally{
            sc.close();
            System.out.println("Closing the Scanner class");
        }
        System.out.println("Ending the application");
    }
}
