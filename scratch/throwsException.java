package scratch;

class DemoA {
    public void A() {
        try {

            B();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void B() throws Exception {
        int a, b, c;
        a = 6;
        b = 0;

        // try {

            c = a / b;
            System.out.println("Ending...");
        // } catch (Exception e) {
        //     System.out.println("Error" + e.getMessage());
        // }
    }

}

public class throwsException {
    public static void main(String[] args) {
        DemoA obj = new DemoA();
        obj.A();
    }

}
