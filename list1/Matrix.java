class Matrix
{
    public static int[][] A={{1,3,4},{2,4,3},{3,4,5}};
    public static int[][] B={{1,3,4},{2,4,3},{1,2,4}};    
    public static int[][] C=new int[3][3];    
    public static void add()
    { 
        for(int i=0;i<3;i++)   
            for(int j=0;j<3;j++) 
                C[i][j]=A[i][j]+B[i][j];
 
    }
    public static void sub()
    {
        for(int i=0;i<3;i++)   
            for(int j=0;j<3;j++)   
                C[i][j]=A[i][j]-B[i][j];
    }
    public static void mul()
    {
        for(int i=0;i<3;i++) 
            for(int j=0;j<3;j++)   
                for(int k=0;k<3;k++)
                    C[i][j]=A[i][k]*B[k][j];
    }
    public static void pri()
    {
        for(int i=0;i<C.length;i++) 
        { 
            for(int j=0;j<C[i].length;j++) 
                System.out.print(C[i][j]+" "); 
            System.out.println(); 
        } 
    }
    public static void main(String[] args)
    {
        System.out.println("addition is : ");
        add();
        pri();
        System.out.println("subtraction is : ");
        sub();
        pri();
        System.out.println("multiplication is : ");
        mul();
        pri();

    }
}
