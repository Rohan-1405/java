class Date
{
    private int date,month,year;
    Date()
    {
        date=1;
        month=1;
        year=2000;
    }
    Date(int da,int mo,int ye )
    {
        date=da;
        month=mo;
        year=ye;
    }
    public void setda(int a)
    {
        date=a;
    }
    public void setmo(int a)
    {
        month=a;
    }
    public void setye(int a)
    {
        year=a;
    }
    public void getda()
    {
        System.out.println("Date : "+date);
    }
    public void getmo()
    {
        System.out.println("Date : "+month);
    }
    public void getye()
    {
        System.out.println("Date : "+year);
    }
    public void  print()
    {
        getda();
        getmo();
        getye();
    }
    public void tostring()
    {
        System.out.println(date+"/"+month+"/"+year);
    }
}
class DateDemo2
{
    public static void main(String[] args)
    {
        Date d1=new Date(15, 05, 2003);
        d1.print();
        d1.tostring();
        Date d2=new Date();
        d2.setda(16);
        d2.setmo(05);
        d2.setye(2003);
        d2.tostring();
    }
}