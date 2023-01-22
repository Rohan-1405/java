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
        System.out.print("Red:"+red+",Blue:"+blue+",Green:"+green);
    }
}
class Rectangle extends Shape
{
    private int length,breadth;
    Rectangle()
    {
        length=0;
        breadth=0;
    }
    Rectangle(int r,int b,int g,int le,int br)
    {
        super(r,b,g);
        length=le;
        breadth=br;
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
        super.tostring();
        System.out.println(",Length:"+length+",Breadth:"+breadth);
    }
}
class Circle extends Shape
{
    int radius;
    Circle()
    {
        radius=0;
    }
    Circle(int r,int b,int g,int rad)
    {
        super(r,b,g);
        radius=rad;
    }
    void setrad(int r)
    {
        radius=r;
    }
    void getrad()
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
        super.tostring();
        System.out.println(",Radius : "+radius);
    }
}
class ShapeDemo4
{
    public static void main(String[] args)
    {
        // Shape s1=new Shape();
        // s1.tostring();
        // Shape s2=new Shape(66,77,88);
        // s2.tostring();
        // Rectangle s3=new Rectangle(66,77,88,10,20);
        // s3.tostring();
        Circle s3=new Circle(66,77,88,5);
        s3.tostring();
    }
}