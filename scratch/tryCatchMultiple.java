package scratch;
public class tryCatchMultiple {

    public static void main(String[] args) {
        int a,b,c;
        a=2;
        b=0;
        int [] ar= {3,4,5,6};
        try{
            c=a/b; //try will treat only first exception
            System.out.println("VALUE="+c);
            System.out.println("value="+ar[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't divid by zero");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Stay within the limits");
            System.out.println("Value="+ar[3]);
        }

        System.out.println("Ending the application");
    }
}
