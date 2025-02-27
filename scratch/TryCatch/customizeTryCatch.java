package scratch.TryCatch;

public class customizeTryCatch {
    public static void main(String[] args) {
        int a=6;
        int b=-2;
        int c;

        try{
            if(b<=0)
            {
                Exception ex= new ArithmeticException();
                throw ex;
            }
            c=a/b;
            System.out.println("Value"+c);
        }
        catch(Exception ex)
        {
            System.out.println("Enter a non negative number");
        }
        
    }
    
}
