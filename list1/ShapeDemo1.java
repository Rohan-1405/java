class Shape
{
    private int red,blue,green;
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
        getred();
    }
    public void tostring()
    {
        System.out.println("Red:"+red+",Blue:"+blue+",Green:"+green);
    }
}
class ShapeDemo1
{
    public static void main(String[] args)
    {
        Shape s1=new Shape();
        s1.setred(55);
        s1.setblue(88);
        s1.setgreen(44);
        s1.print();
        s1.tostring();
    }
}