public class constant {
    public static void main(String[] args) {
       
        float pi=3.14F;
        pi=5.63F;
        System.out.println(pi);

        //to overcome this, use "final" to finilize the variable
        final float PI=3.14F;
        // PI=5.62F; this line give error on updating 
        System.out.println(PI);
    }
    
}
