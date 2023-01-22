class Math
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public float add(float a,float b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public long add(long a,long b)
    {
        return a+b;
    }
}
class Mathdemo
{
    public static void main(String[] args)
    {
        Math n1=new Math();
        System.out.println("Addition is : "+n1.add(2,5));
        Math n2=new Math();
        System.out.println("Addition is : "+n2.add(2.25,5.89));
        Math n3=new Math();
        System.out.println("Addition is : "+n3.add(20000,500));
        Math n4=new Math();
        System.out.println("Addition is : "+n4.add(285000.254,5521.054));
    }
}
