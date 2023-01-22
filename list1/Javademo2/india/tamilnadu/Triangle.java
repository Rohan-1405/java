package india.tamilnadu;
import india.punjab.*;
public class Triangle extends Shape
{
    int base,height;
    public Triangle()
    {
        base=0;
        height=0;
    }
    public Triangle(int r,int b,int g,int ba,int hei)
    {
        super(r,b,g);
        base=ba;
        height=hei;
    }
    public void getarea()
    {
        System.out.println("Area of Triangle : "+(base*height)/2);
    }
    void setbas(int bas)
    {
        base=bas;
    }
    void getbas()
    {
        System.out.println("Base : "+base);
    }
    void sethei(int bas)
    {
        base=bas;
    }
    void gethei()
    {
        System.out.println("Height : "+height);
    }
    public void print()
    {
        super.print();
        getbas();
        gethei();
    }
    public void tostring()
    {
        System.out.print("Base:"+base+",Height:"+height);
        super.tostring();
    }
}