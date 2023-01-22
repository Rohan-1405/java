class CalcDemo2
{
    public static void main(String args[])
    {   
        try
        {
            int x = Integer.parseInt(args[0]);
            String op = args[1];
            int y = Integer.parseInt(args[2]);      
            if (op.equals("+"))
                System.out.println("x + y = "+x+y);

            else if (op.equals("-"))
                System.out.println("x - y = "+(x-y));

            else if (op.equals("x"))
                System.out.println("x * y = "+x*y);

            else if (op.equals("%"))
                System.out.println("x % y = "+x%y);
            else if (op.equals("/"))
                try
                {
                    System.out.println("x / y = "+x/y);
                }catch(Exception e)
                {
                    System.out.println("Devided by zero");
                }
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("zero arguments passed..");
        } 
        catch (NumberFormatException e) {
            System.out.println("string value passed instead of number..");
        }
    }
}