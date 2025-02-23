package scratch;
import java.util.*;

class MyException extends Exception{
    public MyException()
    {}
    
    public MyException(String str)
    {
        super(str);
    }

}

public class customException {


    public static void main(String[] args) {
        int num1=6;
        int num2=-2;
        try{
            if(num2<0)
            {
                Exception e=new MyException("Negative number");
                throw e;
            }
            else{
                int result=num1/num2;
                System.out.println("value="+result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a positive number");    
        }
    }
    
}
