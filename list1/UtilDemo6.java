import java.util.*;
public class UtilDemo6 
{
    public static void main(String[] args) 
    {
        Person p1=new Person();
        p1.setter("parth", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        String s=p1.print();
        StringTokenizer st=new StringTokenizer(s,",");
        System.out.println(st.countTokens());
        while(st.hasMoreElements())
        {
            System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
    }
}
