package scratch.Thread;

import scratch.palindromString;

class PrintingThread extends Thread {
    public void run() {
        System.out.println("-----------printing thread-------------");
        try {
            for (int i = 0; i <= 3; i++) 
            {
                System.out.println("Chappak...");
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

public class IsAlive_join {
    public static void main(String[] args) {
        PrintingThread t1=new PrintingThread();
        t1.isAlive();
        t1.start();
        t1.isAlive();
    }

}
