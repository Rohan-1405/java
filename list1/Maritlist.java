class Maritlist
{
    public static void main(String[] args)
    {
        String[] name=new String[args.length];
        int[] marks=new int[args.length];
        for(int i=0;i<(args.length)-1;i++)
        {
            name[i]=args[i];
            marks[i]=Integer.parseInt(args[i+1]);
            i++;
        }
        System.out.println("Name\t|\tMarks");
        for(int i=0;i<args.length;i++)
        {
            System.out.println("---------------------");
            System.out.print(name[i]);
            System.out.println("\t|\t"+marks[i]);
            i++;
        }
    }
}