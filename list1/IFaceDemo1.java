interface IFace1
{
    public int x=10;
    public void m1();
}
class IFaceDemo1 implements IFace1
{
    public static void main(String[] args)
    {
        IFaceDemo1 ifd1=new IFaceDemo1();
        // ifd1.x=20;
        ifd1.m1();
        IFace1 if1=new IFaceDemo1();    
        if1.m1();
    }
    public void m1()
    {
        System.out.println("m1() : x = "+x);
    }
}
