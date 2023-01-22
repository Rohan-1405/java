class ExceptionDemo5 
{
    public static void main(String[] args) throws InterruptedException   
    {
        m1();
    }
    public static void m1() throws InterruptedException
    {
        m2();
    }
    public static void m2() throws InterruptedException
    {
        m3();
    }
    public static void m3() throws InterruptedException
    {

        System.out.println("Welcome");
        Thread.sleep(3000);
        System.out.println("Bye");

    }
}