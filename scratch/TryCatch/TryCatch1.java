package scratch.TryCatch;

public class TryCatch1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        int c = 0;  
        
        try {
            c = a / b; 
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        
        System.out.println("Done");
        System.out.println("Result: " + c);
    }
}
