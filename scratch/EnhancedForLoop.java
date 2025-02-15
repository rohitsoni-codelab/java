package scratch;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int n[] = { 1, 32, 4, 15, 6 };
        for (int a : n) {
            System.out.println(a);
        }

        int a[][] = {
                { 3, 5, 6, 6 },
                { 5, 3, 6, 3 },
                { 5, 3, 6, 2 }
        };
        for(int i[]:a)
        {
            for(int b:i)
            {
                System.out.print(b+" ");
            }
            System.out.println("\n");
        }
    }

}
