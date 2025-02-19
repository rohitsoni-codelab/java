package scratch;
abstract class Aeroplane2{
    abstract public void fly();
    abstract public void takeoff();
}
class cargoPlane2 extends Aeroplane2{
    public void fly()
    {
        System.out.println("flying at low heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs short runway");
    }

}
class passangerPlane2 extends Aeroplane2{
    public void fly()
    {
        System.out.println("flying at medium heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs mediun runway");
    }

}
class fighterPlane2 extends Aeroplane2{
    public void fly()
    {
        System.out.println("flying at higher heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs long runway");
    }
    public void alert()
    {
        System.out.println("Alert...");
    }

}
public class abstractClass {
    public static void main(String[] args) {
        cargoPlane2 cp=new cargoPlane2();
        fighterPlane2 fp1=new fighterPlane2();
        fp1.alert();// wrong to fix it change fighterplane2 fp1=new fighterplane2();


    }
    
}
