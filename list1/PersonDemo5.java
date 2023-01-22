class Person
{
    private String name,gender,city,email,bloodgroup,cell;
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
        getnm();
        getgen();
        getcty();
        getmai();
        getbg();
        getcell();
    }
    public void tostring()
    {
        System.out.print(name+","+bloodgroup+","+gender+","+city+","+email+","+cell);
    }
}
class Employee extends Person
{
    private String basic, designation, department,joining_date;
    Employee()
    {
        basic="zero";
        designation="blank";
        department="blank";
        joining_date="blank";
    }
    Employee(String bas,String des,String dep,String dat,String nm,String gen,String cty,String mai,String bg,String no)
    {
        super( nm, gen, cty, mai, bg, no);
        basic=bas;
        designation=des;
        department=dep;
        joining_date=dat;
    }
    public void setbas(String bas) 
    {
        basic=bas;
    }
    public void setdes(String des) 
    {
        designation=des;
    }
    public void setdep(String dep) 
    {
        department=dep;
    }
    public void setdat(String dat) 
    {
        joining_date=dat;
    }
    public void getbas()
    {
        System.out.println(basic);
    }
    public void getdes()
    {
        System.out.println(designation);
    }
    public void getdep()
    {
        System.out.println(department);
    }
    public void getdat()
    {
        System.out.println(joining_date);
    }
    public void print()
    {
         super.print();
        getbas();
        getdes();
        getdep();
        getdat();
    }
    public void tostring()
    {
        super.tostring();
        System.out.println(","+basic+","+department+","+designation+","+joining_date);
    }
}
class Student extends Person
{
    private String course;
    private int rollno,mark;
    Student()
    {
        course="Blank";
        rollno=0;
        mark=0;
    }
    Student(String c,int r,int m,String nm,String gen,String cty,String mai,String bg,String no)
    {
        super( nm, gen, cty, mai, bg, no);
        course=c;
        rollno=r;
        mark=m;
    }
    public void setcor(String s)
    {
        course=s;
    }
    public void setroll(int r)
    {
        rollno=r;
    }
    public void setma(int m)
    {
        mark=m;
    }
    public void getcor()
    {
        System.out.println("Course : "+course);
    }
    public void getroll()
    {
        System.out.println("Course : "+rollno);
    }
    public void getma()
    {
        System.out.println("Mark : "+mark);
    }
    public void print()
    {
        super.print();
        getcor();
        getroll();
        getma();
    }
    public void tostring()
    {
        super.tostring();
        System.out.println(","+course+","+rollno+","+mark);
    }
}
class PersonDemo5
{
    public static void main(String[] args)
    {
        Employee p2=new Employee("basic","Manager","Marketing","12/01/2003","parth", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p2.tostring();
        p2=null;
        Student s1=new Student("BCA",03,516,"Rohan","Male","Gondal","rohan@gmail.com","AB-","9925500012");
        s1.tostring();
        s1=null;
        System.gc();
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}