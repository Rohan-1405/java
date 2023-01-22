import java.util.Random;
class UtilDemo2 
{
    public static void main(String[] args) 
    {
        Random rnd=new Random();
        System.out.print("Range between 0 to 255 : ");
        for(int i =0; i<5; i++)
        {
            int range = rnd.nextInt(255);
            System.out.print("," + range);
        } 
    }
}