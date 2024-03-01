import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int age=20;
        int maths=89;
        int physics=87;
        int chemistry=98;

        //using array
        int[]arr=new int[3];
        arr[0]=97;
        arr[1]=89;
        arr[2]=90;
        System.out.println(arr);
        System.out.println(arr[0] +arr[1] +arr[2]);

        //sorting
        //for sorting we have to import a "arrays"
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        
        //multidimensional array
        int[][] arr1={{98,89,99},{78,98,77}};
        System.out.println(arr1[0][0]);

    }
    
}
