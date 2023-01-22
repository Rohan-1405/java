class Cricket
{
    public static void main(String args[])
    {
        String[] name=new String[20];
        double[][] run=new double[20][20];
        for(int i=0;i<(args.length);i+=4)
        {
            name[i]=args[i];
            for(int j=1;j<=3;j++)
            {
                run[i][j-1]=Double.parseDouble(args[i+j]);
                run[i][3]+=run[i][j-1];
            }
        }
        name[16]="Total";
        for (int i = 0; i <13; i++)
            for (int j = 0; j <5; j++)
                run[16][j]+=run[i][j];       
        if(run[16][0]>0)
        {
            System.out.println("Name\t|\tMatch1\t|\tMatch2\t|\tMatch3\t|\tTotal");
            for(int i=0;i<(args.length);i++)
            {
                for(int j=0;j<=4;j++)
                {            
                    System.out.println("------------------------------------------------------------------------");
                    System.out.print(name[i]);
                    System.out.print("\t|\t"+run[i][j]+"\t|\t"+run[i][j+1]+"\t|\t"+run[i][j+2]+"\t|\t"+run[i][j+3]+"\n");
                    i+=3;
                    j+=4;
                }
            }
            System.out.println("------------------------------------------------------------------------");
            System.out.print(name[16]+"\t|\t"+run[16][0]+"\t|\t"+run[16][1]+"\t|\t"+run[16][2]+"\t|\t"+run[16][3]+"\n");
        }
    }
}