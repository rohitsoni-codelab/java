package scratch;
import java.util.*;

public class Pangram {
    public static void main(String[] args)
    {
        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        String str="The quick brown fox jumps over lazy dog";
        str=str.replace(" ", "");
        str=str.toLowerCase();
        char [] ar1=str.toCharArray();
        int [] ar2=new int[26];
        boolean flag=true;

        for(int i=0;i<ar1.length;i++)
        {
            ar2[ar1[i]-'a']++;
        }

        for(int i=0;i<ar2.length;i++)
        {
            if(ar2[i]==0)
            {
                flag=false;
                break;
            }

        }

        if(flag)
        {
            System.out.println("This is Pangramm");
        }
        else
        {
            System.out.println("Pangram is not possible");
        }
    }
    
}
