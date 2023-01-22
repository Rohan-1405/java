import java.util.*;
class UtilDemo3 
{
    public static void main(String[] args) 
    {
        Vector<Integer> v1=new Vector<Integer>(5);
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        Vector<Boolean> v2=new Vector<Boolean>(5);
        v2.add(null );
        v2.add(true );
        v2.add(false);
        v2.add(true );
        v2.add(false);
        Vector<Character> v3=new Vector<Character>(5);
        v3.add('a');
        v3.add('b');
        v3.add('c');
        v3.add('d');
        v3.add('e');
        Vector<String> v4=new Vector<String>(5);
        v4.add("bca  ");
        v4.add("bba  ");
        v4.add("bsc  ");
        v4.add("ba   ");
        v4.add("b.com");
        Vector<StringBuffer> v5=new Vector<StringBuffer>(5);
        v5.add(new StringBuffer("A"));
        v5.add(new StringBuffer("B"));
        v5.add(new StringBuffer("C"));
        v5.add(new StringBuffer("D"));
        v5.add(new StringBuffer("E"));
        
        for(int i=0;i<v1.size();i++)
        {
            System.out.println(v1.elementAt(i)+" "+v5.elementAt(i)+" "+v3.elementAt(i)+" "+v4.elementAt(i)+" "+v2.elementAt(i));
        }
        System.out.println(": Inside enumeration : ");
        Enumeration<Integer> e1=v1.elements();
        Enumeration<Boolean> e2=v2.elements();
        Enumeration<Character> e3=v3.elements();
        Enumeration<String> e4=v4.elements();
        Enumeration<StringBuffer> e5=v5.elements();
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement()+" "+e5.nextElement()+" "+e3.nextElement()+" "+e4.nextElement()+" "+e2.nextElement());
        }
    }
}