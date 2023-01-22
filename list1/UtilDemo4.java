import java.util.*;
class UtilDemo4 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s1=new Stack<Integer>();
        s1.add(10);
        s1.push(20);
        s1.addElement(30);
        s1.add(40);
        s1.add(50);
        Stack<Boolean> s2=new Stack<Boolean>();
        s2.add(null );
        s2.push(true );
        s2.addElement(false);
        s2.add(true );
        s2.add(false);
        Stack<Character> s3=new Stack<Character>();
        s3.add('a');
        s3.push('b');
        s3.addElement('c');
        s3.add('d');
        s3.add('e');
        Stack<String> s4=new Stack<String>();
        s4.add("bca  ");
        s4.push("bba  ");
        s4.addElement("bsc  ");
        s4.add("ba   ");
        s4.add("b.com");
        Stack<StringBuffer> s5=new Stack<StringBuffer>();
        s5.add(new StringBuffer("A"));
        s5.push(new StringBuffer("B"));
        s5.addElement(new StringBuffer("C"));
        s5.add(new StringBuffer("D"));
        s5.add(new StringBuffer("E"));
        
        for(int i=0;i<s1.size();i++)
        {
            System.out.println(s1.elementAt(i)+" "+s5.elementAt(i)+" "+s3.elementAt(i)+" "+s4.elementAt(i)+" "+s2.elementAt(i));
        }
        System.out.println(" : Inside enumeration : ");
        Enumeration<Integer> e1=s1.elements();
        Enumeration<Boolean> e2=s2.elements();
        Enumeration<Character> e3=s3.elements();
        Enumeration<String> e4=s4.elements();
        Enumeration<StringBuffer> e5=s5.elements();
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement()+" "+e5.nextElement()+" "+e3.nextElement()+" "+e4.nextElement()+" "+e2.nextElement());
        }
        System.out.println(" : POP : ");

        while(!s1.empty())
        {
            System.out.println(s1.pop()+" "+s5.pop()+" "+s3.pop()+" "+s4.pop()+" "+s2.pop());
            
        }
    }
}