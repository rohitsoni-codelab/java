public class nonpremetive {
    public static void main(String[] args) {
        //method 1
        String name="krishna";
        
        //method 2
        String name1 =new String("krish");
        
        //printing part
        System.out.println(name);
        System.out.println(name1);

        //length
        System.out.println(name.length());
        System.out.println(name1.length());
        
        //concating
        String name2=name+" and "+name1;
        System.out.println(name2);

        //charat
        System.out.println(name.charAt(3));

        //replace
        String name4=name;
        System.out.println(name4.replace('n', 'o'));

    }
    
}
