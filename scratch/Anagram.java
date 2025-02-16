package scratch;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="SCHOOL MASTER";
        String str2="THE CLASSROOM";
        str1=str1.replaceAll(" ", "");
        str2=str2.replace(" ", "");
        
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // System.out.println(str1);

        char [] ar1=str1.toCharArray();
        char [] ar2=str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);


        if(Arrays.equals(ar1,ar2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
    }
    
}
