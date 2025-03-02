package scratch.Generics;

class Geni <T>{
    T obj;
    public Geni(T obj)
    {
        this.obj=obj;
    }
    void display()
    {
        System.out.println("The type of data"+ obj.getClass().getName());
    }
    public T getObj()
    {
        return obj;
    }

}
public class Gen3 {
    public static void main(String[] args) 
    {
    
        Geni<Integer> g=new Geni<Integer>(10);
        g.display();
        System.out.println(g.getObj());
        // System.out.println(g.display());
        
    }
    
}
