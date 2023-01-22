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
        System.out.print(",Red:"+red+",Blue:"+blue+",Green:"+green);
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
        System.out.print("Length:"+length+",Breadth:"+breadth);
        super.tostring();
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
        System.out.print("Radius:"+radius);
        super.tostring();
    }
}
class Triangle extends Shape
{
    int base,height;
    Triangle()
    {
        base=0;
        height=0;
    }
    Triangle(int r,int b,int g,int ba,int hei)
    {
        super(r,b,g);
        base=ba;
        height=hei;
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
class Cylinder extends Circle
{
    int radius,height;
    Cylinder()
    {
        radius=0;
        height=0;
    }
    Cylinder(int r,int b,int g,int ba,int hei)
    {
        super(r,b,g,ba);
        radius=ba;
        height=hei;
    }
    void setrad(int bas)
    {
        radius=bas;
    }
    void getrad()
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
        System.out.print("Height:"+height+",");
        super.tostring();
    }
}
class ShapeDemo7
{
    public static void main(String[] args)
    {
        // Shape s1=new Shape();
        // s1.tostring();
        // System.out.println();
        // Shape s2=new Shape(66,77,88);
        // s2.tostring();
        // System.out.println();
        Rectangle s3=new Rectangle(66,77,88,10,20);
        s3.tostring();
        System.out.println();
        Circle s4=new Circle(66,77,88,5);
        s4.tostring();
        System.out.println();
        Triangle s5=new Triangle(66,77,88,5,8);
        s5.tostring();
        System.out.println();
        Cylinder s6=new Cylinder(66,77,88,5,10);
        s6.tostring();
    }
}