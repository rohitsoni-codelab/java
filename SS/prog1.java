class box
{
    int length,breadth,height;
    void setDimension(int x,int y,int z)
    {
        length=x;
        breadth=y;
        height=z;
    }

    void showDimension()
    {
        System.out.println("length of the box is "+ length);
        System.out.println("breadth of the box is"+ breadth);
        System.out.println("height of the box is "+ height);
    }
}

class prog1{
    public static void main(String [] args)
    {
        box b1=new box();
        b1.setDimension(10,20,40);
        b1.showDimension();
    }
}