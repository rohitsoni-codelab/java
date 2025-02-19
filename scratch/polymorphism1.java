package scratch;
class Aeroplane1{
    public void fly()
    {
        System.out.println("redy to fly");    
    }
    public void takeoff()
    {
        System.out.println("ready to taking off");
    }
}
class cargoPlane1 extends Aeroplane1{
    public void fly()
    {
        System.out.println("flying at low heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs short runway");
    }

}
class passangerPlane1 extends Aeroplane1{
    public void fly()
    {
        System.out.println("flying at medium heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs mediun runway");
    }

}
class fighterPlane1 extends Aeroplane1{
    public void fly()
    {
        System.out.println("flying at higher heigt");
    }
    public void takeoff()
    {
        System.out.println("It needs long runway");
    }

}
class Airport{
    public void poly(Aeroplane1 ref)
    {
        ref.fly();
        ref.takeoff();
        System.out.println("--------------------------------------");
    }
}
public class polymorphism1 {
    public static void main(String[] args) {
        Aeroplane1 cp=new cargoPlane1();
        passangerPlane1 pp=new passangerPlane1();
        fighterPlane1 fp=new fighterPlane1();
        // cp.fly();
        // cp.takeoff();

        Airport ap=new Airport();

        ap.poly(cp);
        ap.poly(pp);
        ap.poly(fp);

        
    }
    
}
