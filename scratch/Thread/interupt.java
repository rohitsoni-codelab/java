package scratch.Thread;
class PrintingThread2 implements Runnable{
    public void run()
    {   
        System.out.println("========= Printing Thread ============");
        for(int i=0;i<3;i++)
        {
            try{

                System.out.println("print"+(i+1));
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Getting some error "+e.getMessage());
            }
        }

    }
}
public class interupt {
    public static void main(String[] args) throws Exception{
        PrintingThread2 i1=new PrintingThread2();
        Thread t1=new Thread(i1);

        t1.start();
        t1.interrupt();
        t1.join();
        t1.interrupt();
    }
    
}
