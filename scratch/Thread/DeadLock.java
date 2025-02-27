package scratch.Thread;

class Library implements Runnable {
    String res1 = new String();
    String res2 = new String();
    String res3 = new String();

    public void run()
    {
        String name= Thread.currentThread().getName();
        if(name.equals("Stud1"))
        {
            try
            {

                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println(name+" occupied resource 1");
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println(name+" occupied resource 2");
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println(name+" occupied resource 3");
                            Thread.sleep(3000);
                        }
                    }


                }
            }
            catch(Exception e)
            {
                System.out.println("Getting some error");
            }
        }
        else{

            try
            {

                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println(name+" occupied resource 1");
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println(name+" occupied resource 2");
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println(name+" occupied resource 3");
                            Thread.sleep(3000);
                        }
                    }


                }
            }
            catch(Exception e)
            {
                System.out.println("Getting some error");
            }

        }
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Stud1");
        t2.setName("Stud2");

        t1.start();
        t2.start();
    }

}
