class Compound
{
    public static void main(String[] args)
    {
        double p,r,n,a;
        p=1000;
        r=12;
        n=5;
        a=p*Math.pow((1+r/100),n)-p;
        System.out.println("Compound Interest : "+a);
    }
}