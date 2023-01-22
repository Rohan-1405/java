import java.util.*;
class CL_5
{
    public static void main(String[] args)
    {
        int[] pop=new int[args.length];
        for(int i=0;i<args.length;i++)
            pop[i]=Integer.parseInt(args[i]);
        Arrays.sort(pop);
        for(int i=0;i<pop.length;i++)
            System.out.println(pop[i]);
    }
}