interface IFace1
{
    public int x=10;
    public void m1();
}
interface IFace2
{
    public int y=20;
    public void m2();
}
class IFaceDemo2 implements IFace1,IFace2
{
    public static void main(String[] args)
    {
        // IFaceDemo1 ifd1=new IFaceDemo1();
        // ifd1.m1();
        IFace1 if1=new IFaceDemo1();    
        if1.m1();
        IFace2 if2=new IFaceDemo2();    
        if2.m2();
    }
    public void m1()
    {
        System.out.println("m1() : x = "+x);
    }
    public void m2()
    {
        System.out.println("m2() : y = "+y);
    }
}
