interface IFace1
{
    public int x=10;
    public void m1();
}
interface IFace2
{
    public int /*IFace1*/x=12;
    public int y=20;
    public void m2();
}
interface IFace3 extends IFace1,IFace2
{
    public int z=30;
    public void m3();
}
class IFaceDemo4 implements IFace3
{
    public static void main(String[] args)
    {
        // IFaceDemo1 ifd1=new IFaceDemo1();
        // ifd1.m1();
        // IFace1 if1=new IFaceDemo1();    
        // if1.m1();
        // IFace2 if2=new IFaceDemo2();    
        // if2.m1();
        // if2.m2();
        // IFace3 if3=new IFaceDemo3();    
        // if3.m1();
        // if3.m2();
        // if3.m3();\
        IFace3 if3=new IFaceDemo4();    
        if3.m1();
        if3.m2();
        if3.m3();
    }
    public void m1()
    {
        System.out.println("m1() : x = "+IFace2.x);
    }
    public void m2()
    {
        System.out.println("m2() : y = "+y);
    }
    public void m3()
    {
        System.out.println("m3() : z = "+z);
    }
}
