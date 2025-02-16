package scratch;
import java.util.*;
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("Rohit");
        System.out.println(str);
        System.out.println(str.capacity());
        str.append("Soni");
        System.out.println(str.capacity());
        System.out.println(str.charAt(2));
        str.setCharAt(5, 'D');
        System.out.println(str);

    }
    
}
