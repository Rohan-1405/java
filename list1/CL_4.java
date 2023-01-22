import java.util.*;
class CL_4
{
   public static void main(String args[])
   {
        int f=0;
        String[] s1=new String[11];
        Scanner sc=new Scanner(System.in);
        System.out.println("Write name of 10 cities : ");
        for(int i=0;i<s1.length;i++)
        {
            System.out.print(i+" : ");
            s1[i]=sc.next();
        }
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].equals("rajkot"))
            {
                System.out.print("City found at Index "+ i +" Named as : "+s1[i]);
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("-1 not found");
        }
   }
}
