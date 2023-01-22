class Person
{
    private String name,gender,city,email,bloodgroup;
    private String cell;
    Person()
    {
        name="Noname";
        gender="Nogender";
        city="Nocity";
        email="Noemail";
        bloodgroup="Nobloodgroup";
        cell="Nonumber";
    }
    Person(String nm,String gen,String cty,String mai,String bg,String no)
    {
        name=nm;
        gender=gen;
        city=cty;
        email=mai;
        bloodgroup=bg;
        cell=no;
    }
    public void setnm(String nm)
    {
        name=nm;
    }
    public void setgen(String gen)
    {
        gender=gen;
    }
    public void setcty(String c)
    {
        city=c;
    }
    public void setmai(String mail)
    {
        email=mail;
    }
    public void setbg(String bg)
    {
        bloodgroup=bg;
    }
    public void setcell(String nm)
    {
        cell=nm;
    }
    public void getnm()
    {
        System.out.println("Name : "+name);
    }
    public void getgen()
    {
        System.out.println("Gender : "+gender);
    }
    public void getcty()
    {
        System.out.println("City : "+city);
    }
    public void getmai()
    {
        System.out.println("Email : "+email);
    }
    public void getbg()
    {
        System.out.println("Bloodgroup : "+bloodgroup);
    }
    public void getcell()
    {
        System.out.println("Cell : "+cell);
    }

    public void print()
    {
        System.out.println("\""+name+","+bloodgroup+","+gender+","+city+","+email+","+cell+"\".");
    }
    public String tostring()
    {
        return "Name : "+name+",Gender : "+gender+",City : "+city+",Email : "+email+",Bloodgroup : "+bloodgroup+",Cell : "+cell;
    }
}
class PersonDemo2
{
    public static void main(String[] args)
    {
        Person p1=new Person();
        p1.setnm("rohan");
        p1.setgen("male");
        p1.setcty("gondal");
        p1.setmai("rohan@gmail.com");
        p1.setbg("ab-");
        p1.setcell("9925500012");
        p1.getnm();
        p1.getgen();
        p1.getcty();
        p1.getmai();
        p1.getbg();
        p1.getcell();
        Person p2=new Person("parth", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p2.print();
        p2=null;
        System.gc();
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}