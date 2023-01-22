class Shape
{
    private int red,blue,green;
    Shape()
    {
        red=0;
        blue=0;
        green=0;
    }
    Shape(int r,int b,int g)
    {
        red=r;
        blue=b;
        green=g;
    }
    public void setred(int a)
    {
        red=a;
    }
    public void setblue(int a)
    {
        blue=a;
    }
    public void setgreen(int a)
    {
        green=a;
    }
    public void getred()
    {
        System.out.println("Red : "+red);
    }
    public void getblue()
    {
        System.out.println("Blue : "+blue);
    }
    public void getgreen()
    {
        System.out.println("Green : "+green);
    }
    public void print()
    {
        getred();
        getblue();
        getgreen();
    }
    public void tostring()
    {
        System.out.println("Red:"+red+",Blue:"+blue+",Green:"+green);
    }
}
class ShapeDemo2
{
    public static void main(String[] args)
    {
        Shape s1=new Shape();
        s1.setred(55);
        s1.setblue(88);
        s1.setgreen(44);
        s1.print();
        s1.tostring();
        Shape s2=new Shape(66,77,88);
        s2.tostring();
    }
}