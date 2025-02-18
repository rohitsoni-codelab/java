package scratch;
class Aeroplane{
    public void fly()
    {
        System.out.println("Aeroplane is flying");

    }
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
}
class cargoPlane extends Aeroplane{
    public void fly()
    {
        System.out.println("CargoPlane is flying at low hight");
    }
    public void carryGoods()
    {
        System.out.println("CargoPlane carrys goods");
    }

}
class passengerPlane extends Aeroplane{

}
public class TypesOfInheritence {
    public static void main(String[] args) {
        
        cargoPlane cp=new cargoPlane();
        cp.fly();
        cp.takeOff();
        cp.carryGoods();
    }
    
}
