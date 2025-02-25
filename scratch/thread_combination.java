package scratch;
// import java.io.*;
import java.util.*;


// Running the Threads in Java


// Method 1 - Thread Class
class ThreadImpl extends Thread
{
      // Method to start Thread
      @Override
      public void run()
    {
          String str = "Thread Class Implementation Thread"
                      + " is Running Successfully";
        System.out.println(str);
    }
}

// Method 2 - Runnable Interface
class RunnableThread implements Runnable 
{    
      // Method to start Thread
      @Override
    public void run()
    {
          String str = "Runnable Interface Implementation Thread"
                      + " is Running Successfully";
        System.out.println(str);
    }

}

public class thread_combination
{
    public static void main(String[] args)
    {
          
          // Method 1 - Thread Class
          ThreadImpl t1 = new ThreadImpl();
          t1.start();
      
          // Method 2 - Runnable Interface
        RunnableThread g2 = new RunnableThread();
        Thread t2 = new Thread(g2);
          t2.start();
          
    }
    
}
