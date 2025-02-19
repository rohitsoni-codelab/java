//car has a engine
package scratch;
class Car{
    private Engine eng;
    public Car(Engine eng)
    {
        this.eng=eng;
    }
    public void start()
    {
        eng.startEngine();
    }

}
class Engine{
    public void startEngine()
    {
        System.out.println("Car is started");
    }
}
public class hasARelation {
    public static void main(String[] args) {
        Engine e1=new Engine();
        Car c1=new Car(e1);
        c1.start();
        
    }
    
}
