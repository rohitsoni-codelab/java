package scratch;

public class ReverseString {
    public static void main(String[] args) {

        String s1 = "Rohit";
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);



        String str1="Rohit Soni";
        String str2="";
        String sarr[]=str1.split(" ");
        for(int i=sarr.length-1;i>=0;i--)
        {
            str2=str2+sarr[i]+" ";
        }
        System.out.println(str2);
    }
}
