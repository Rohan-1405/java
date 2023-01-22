class MyThread extends Thread
{
    private int start,delay,end;
    MyThread(int st,int de,int en)
    {
        start=st;
        delay=de;
        end=en;
    }
    public void run()
    {
        System.out.println(start);
        try 
        {
            Thread.sleep(delay);
        }catch (InterruptedException e) {
           System.out.println("delay val negative");
        }
        System.out.println(end);
    }
}
class ThreadDemo1
{
    public static void main(String[] args) {
        MyThread m1=new MyThread(10, 5000, 20);
        m1.start();
        MyThread m2=new MyThread(30, 3000, 40);
        m2.start();
    }
}