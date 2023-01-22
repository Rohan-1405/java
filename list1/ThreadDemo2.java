class MyThread implements Runnable
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
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(end);
    }
}
class ThreadDemo2
{
    public static void main(String[] args) {
        Thread m1=new Thread(new MyThread(10, 110, 20));
        m1.start();
        Thread m2=new Thread(new MyThread(30, 3000, 40));
        m2.start();
    }
}