package scratch.Thread;

// import scratch.palindromString;

class PrintingThread extends Thread {
    public void run() {
        System.out.println("-----------printing thread-------------");
        try {
            for (int i = 0; i <= 2; i++) 
            {
                System.out.println("Chappak..."+(i+1));
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Getting some Error");
            e.printStackTrace();
        }
    }

}
class PrintingThread1 extends Thread{
    public void run()
    {
        System.out.println("-----------Writing Thread-------------");
        try {
            for (int i = 0; i <= 2; i++) 
            {
                System.out.println("Tappak..."+(i+1));
                // Thread.sleep(2000);
            }
        } 
        catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Getting some Error");
            e.printStackTrace();
        }
    }
}
public class IsAlive_join {
    public static void main(String[] args) throws Exception{
        PrintingThread t1=new PrintingThread();
        PrintingThread1 t2=new PrintingThread1();

        System.out.println(t1.isAlive()); 
        t1.start();
        t1.join();
        t2.start();
        System.out.println(t1.isAlive()); // why this line is executed before the t2.start
    }

}
