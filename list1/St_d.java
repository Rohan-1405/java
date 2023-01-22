class St_d
{
    static int a=10;
    static int b=20;
    public static void sm1()
    {
        sm2();
    }
    public static void sm2()
    {
       System.out.println(a);
       System.out.println(b);

    }
    public static void nsm1()
    {
        nsm2();
    }
    public static void nsm2()
    {
       System.out.println(a);
       System.out.println(b);

    }
    public static void main(String[] args)
    {
        sm1();
        nsm1();    
    }
}
