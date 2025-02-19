package scratch;
class Computer{
    public void compileCode()
    {

    }
}
class laptop extends Computer{
    public void compileCode()
    {
        System.out.println("you got 5 errors!!!");
    }
}
class desktop extends Computer{
    public void compileCode()
    {
        System.out.println("you got 5 errors!!!");
        System.out.println("its much faster!!!");
    }
}
class Developer{
    public void buildCode(Computer ref)
    {   
        ref.compileCode();
        System.out.println("---------------------");
        
    }
}

public class abstractApp {
    public static void main(String[] args) {
        Computer unit1=new laptop();
        Computer unit2=new desktop();

        Developer dev=new Developer();
        dev.buildCode(unit1);
        dev.buildCode(unit2);
        
    }
    
}
