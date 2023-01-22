class MarksOutOfBoundsException extends Exception
{
    MarksOutOfBoundsException()
    {
        super("marks out of range");
    }
    MarksOutOfBoundsException(String s)
    {
        super("marks out of range");
    }
}
class Exam
{
    int mark;
    void setter(int mk) throws MarksOutOfBoundsException
    {
        MarksOutOfBoundsException m=new MarksOutOfBoundsException();
        
        if(mk>=0 && mk<=100)  
        {
            mark=mk;
        }
        else
            throw m;
    }
    void getter()
    {
        System.out.println(mark);
    }
    int tostring()
    {
        return mark;
    }
}
class ExceptionDemo6 
{
    public static void main(String[] args) 
    {
        Exam m1=new Exam();
        try {
            m1.setter(101);
            m1.getter();
        } catch (MarksOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}