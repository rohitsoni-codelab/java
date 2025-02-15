    package scratch;

    class Calc {
        public int add(int []arr)
        {
            int res=0;
            for(int i:arr)
            {
                res+=i;
            }
            return res;
        }
        
    }

    public class AnonumousArray 
    {
        public static void main (String[] args) 
        {
            Calc obj1=new Calc();
            int res=obj1.add(new int[]{4,5,6,3,5});
            System.out.println(res);
        }

    }
