package scratch.Thread;

class Driving implements Runnable {
    public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + " Intered to parking lot");
            Thread.sleep(2000);
            synchronized(this)
            {

                System.out.println(Thread.currentThread().getName() + " Took the Car and getting inside the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Out for office");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Got back and parked the car");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Getting Error");
        }
    }
}

public class synchronizedKeyword {
    public static void main(String[] args) {
        Driving dr = new Driving();

        Thread t1 = new Thread(dr);
        Thread t2 = new Thread(dr);
        Thread t3 = new Thread(dr);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();

    }

}
