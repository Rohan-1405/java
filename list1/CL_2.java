class CL_2
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder();
        String s2="";
        for(String s1:args)
        {
            s2=sb.append(s1).toString();
        }
        System.out.println("uppercase : "+s2.toUpperCase());
        System.out.print("lowercase : "+s2.toLowerCase());
    }
}