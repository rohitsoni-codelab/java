package scratch;

import java.util.*;

class CalcNum implements Runnable {
    public void run() {
        System.out.println("-----------------CALCULATION-----------------");
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        System.out.print("Enter a number=");
        int num2 = sc.nextInt();
        int res;
        try {
            res = num1 / num2;
            System.out.print("Value =" + res);
        } catch (ArithmeticException e) {
            System.out.println("!!!Enter a positive number!!!");
        } finally {
            System.out.println("Exiting the Calculation part");
            sc.close();
        }

    }
}

class Message1 implements Runnable {
    public void run() {
        System.out.println("-------------Messaging part-------------");
        try {
                for(int i=0;i<=5;i++)
                {
                    System.out.println("focus....");
                    Thread.sleep(2000);
                }
            } 
        catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        finally
            {
                System.out.println("----------------------------------------");
            }
            System.out.println("Ending Messag");
    }
    }

public class thread_runnable {
    public static void main(String[] args) {
        CalcNum ob1 = new CalcNum();
        Message1 ob2 = new Message1();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
    }
}