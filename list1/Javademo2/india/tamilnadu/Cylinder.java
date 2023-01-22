package india.tamilnadu;
import india.punjab.*;
public class Cylinder extends Circle
{
    int radius,height;
    public Cylinder()
    {
        radius=0;
        height=0;
    }
    public Cylinder(int r,int b,int g,int ba,int hei)
    {
        super(r,b,g,ba);
        radius=ba;
        height=hei;
    }
    public void getarea()
    {
        System.out.println("Area of Cylinder : "+(3.14*radius*radius*height));
    }
    public void setrad(int bas)
    {
        radius=bas;
    }
    public void getrad()
    {
        System.out.println("Radius : "+radius);
    }
    void sethei(int bas)
    {
        radius=bas;
    }
    void gethei()
    {
        System.out.println("Height : "+height);
    }
    public void print()
    {
        super.print();
        getrad();
        gethei();
    }
    public void tostring()
    {
        System.out.println("Height:"+height+",");
        super.tostring();
    }
}