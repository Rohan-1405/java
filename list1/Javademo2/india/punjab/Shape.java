package india.punjab;
public abstract class Shape 
{
    abstract public void getarea();
    private int red,blue,green;
    public Shape()
    {
        red=0;
        blue=0;
        green=0;
    }
    public Shape(int r,int b,int g)
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
        System.out.print(",Red:"+red+",Blue:"+blue+",Green:"+green);
    }
}
