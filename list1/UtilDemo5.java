import java.util.*;
class UtilDemo5
{
    public static void main(String[] args) 
    {
        Hashtable<String,Person> h1=new Hashtable<String,Person>();
        Person p[];
        p=new Person[5];
        p[0]=new Person("A", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p[1]=new Person("B", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p[2]=new Person("C", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p[3]=new Person("D", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        p[4]=new Person("E", "male", "rajkot", "parth@gmail.com", "o+", "9876325140");
        h1.put("s1", p[0]);
        h1.put("s2", p[1]);
        h1.put("s3", p[2]);
        h1.put("s4", p[3]);
        h1.put("s5", p[4]);
        Set<String> e1=h1.keySet();
        System.out.println(e1);
        for (String key : e1) {
            Person value = (Person) h1.get(key);
            System.out.println(key + " " + value.tostring());
        }
    }
}