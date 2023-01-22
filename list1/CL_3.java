import java.util.*;
class CL_3
{
    public static void main(String args[])
    {
        String[] cities= args;
        int size = cities.length;  
        for(int i = 0; i<size-1; i++)   
        {  
            for (int j = i+1; j<cities.length; j++)   
            {  
                if(cities[i].compareTo(cities[j])>0)   
                {  
                    String temp = cities[i];  
                    cities[i] = cities[j];  
                    cities[j] = temp;  
                }  
            }
        }
        System.out.println("Cities : "+Arrays.toString(args));
    }
}
