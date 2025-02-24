package scratch;

import java.util.Scanner;

class Calc extends Thread {
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
        } catch (Exception e) {
            System.out.println("!!!Enter a positive number!!!");
        } finally {
            System.out.println("Exiting the Calculation part");
        }

    }
}

class Message extends Thread {
    public void run() {
        System.out.println("-------------Messaging part-------------");
        System.out.println("----------------------------------------");
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Calc t1 = new Calc();
        Message t2 = new Message();
        t1.start();
        t2.start();

    }

}
