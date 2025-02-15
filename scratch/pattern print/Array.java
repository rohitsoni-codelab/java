import java.util.*;
public class Array {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elments to be stored in the list");
        int size=sc.nextInt();
        int[] list=new int[size];
        System.out.println("Enter any values one by one-");
        for(int i=0;i<size;i++)
        {
            list[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(list[i]);
        }

    }
}
