package scratch;

import java.util.*;

class Mythread1 extends Thread{
    public void run() {
        String tName=Thread.currentThread().getName();
        System.out.println(tName);
        if(tName.equals("T1"))
        {
            CalcNum1();
        }
        else{
            Message();
        }
    }

    public void CalcNum1() {

        System.out.println("-----------------CALCULATION-----------------");
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        System.out.print("Enter a number=");
        int num2 = sc.nextInt();
        int res;try
        {
            res = num1 / num2;
            System.out.print("Value =" + res);
        }catch(
        ArithmeticException e)
        {
            System.out.println("!!!Enter a positive number!!!");
        }finally
        {
            System.out.println("Exiting the Calculation part");
            sc.close();
        }
    }

    public void Message(){

        System.out.println("-------------Messaging part-------------");
        try {
                // for(int i=0;i<=5;i++)
                // {
                //     System.out.println("focus....");
                //     Thread.sleep(5000);
                // }
                System.out.println("*");
                Thread.sleep(3000);
            } 
        catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        finally
            {
                System.out.println("----------------------------------------");
            }
            System.out.println("Ending Messages");
    }
}

public class thread_single_{
    public static void main(String[] args) {
        Mythread1 ob1=new Mythread1();
        Mythread1 ob2=new Mythread1();

        ob1.setName("T1");
        ob2.setName("t2");

        ob1.start();
        ob2.start();

    }
}