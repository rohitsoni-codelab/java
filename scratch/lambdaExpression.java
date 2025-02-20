package scratch;
@FunctionalInterface
interface Car1{
    void dis();

}
public class lambdaExpression {
    public static void main(String[] args) {
        Car1 obj=()->System.out.println("Driving...");
        obj.dis();
    }
    
}
