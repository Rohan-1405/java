package india.punjab;
public class Rectangle extends Shape
{
    private int length,breadth;
    Rectangle()
    {
        length=0;
        breadth=0;
    }
    public Rectangle(int r,int b,int g,int le,int br)
    {
        super(r,b,g);
        length=le;
        breadth=br;
    }
    public void getarea()
    {
        System.out.println("Area of Rectangle : "+length*breadth);
    }
    public void setlen(int l)
    {
        length=l;
    }
    public void setbre(int b)
    {
        breadth=b;
    }
    public void getlen()
    {
        System.out.println("Length"+length);
    }
    public void getbre()
    {
        System.out.println("Breadth"+breadth);
    }
    public void print()
    {
        super.print();
        getlen();
        getbre();
    }
    public void tostring()
    {
        System.out.print("Length:"+length+",Breadth:"+breadth);
        super.tostring();
    }
}