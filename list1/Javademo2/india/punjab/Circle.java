package india.punjab;
public class Circle extends Shape
{
    int radius;
    public Circle()
    {
        radius=0;
    }
    public Circle(int r,int b,int g,int rad)
    {
        super(r,b,g);
        radius=rad;
    }
    public void getarea()
    {
        System.out.println("Area of Circle : "+(3.14*radius*radius));
    }
    public void setrad(int r)
    {
        radius=r;
    }
    public void getrad()
    {
        System.out.println("Radius : "+radius);
    }
    public void print()
    {
        super.print();
        getrad();
    }
    public void tostring()
    {
        System.out.print("Radius:"+radius);
        super.tostring();
    }
}