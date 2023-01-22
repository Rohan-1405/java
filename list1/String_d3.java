class String_d3
{
    public static void main(String[] args)
    {
        String s1="MALAYALAM";
        StringBuffer buffer=new StringBuffer(s1);
        buffer.reverse();
        String s2=buffer.toString();
        if(s1.equals(s2))
            System.out.println(s1+" : String is Palindrome");
        else
            System.out.println(s1+" : String is not Palindrome");

    }
}
