package scratch;
interface Computer1{
    void compileCode();
}
class laptop1 implements Computer1{
    public void compileCode()
    {
        System.out.println("you got 5 errors!!!");
    }
}
class desktop1 implements Computer1{
    public void compileCode()
    {
        System.out.println("you got 5 errors!!!");
        System.out.println("its much faster!!!");
    }
}
class Developer1{
    public void buildCode(Computer1 ref)
    {   
        ref.compileCode();
        System.out.println("---------------------");
        
    }
}

public class interfaceApp {
    public static void main(String[] args) {
        Computer1 unit1=new laptop1();
        Computer1 unit2=new desktop1();

        Developer1 dev=new Developer1();
        dev.buildCode(unit1);
        dev.buildCode(unit2);
        
    }
    
}
