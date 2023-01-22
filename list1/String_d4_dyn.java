import java.util.*;
public class String_d4_dyn
{
    public static void main(String[] args)   
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str=sc.nextLine();
        for(int i=0;i<=str.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
