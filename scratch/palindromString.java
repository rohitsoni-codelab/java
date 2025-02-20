package scratch;

import java.util.*;

public class palindromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        // String str2 = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     str2 = str2 + str.charAt(i);
        // }

        StringBuilder str2=new StringBuilder(str).reverse();

        
        if (str2.equals(str)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }

}
