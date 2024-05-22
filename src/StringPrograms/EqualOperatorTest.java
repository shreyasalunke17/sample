package StringPrograms;
public class EqualOperatorTest
{
    public static void main(String[] args)
    {
        //== operator  vs equals() method
        // == will check the memory address
        //equals() will check the contains inside the object

        String s = "Java";             //SCP
        String s1 = new String("Java");
        String s2 = new String("Java").intern();//Main Heap

        boolean t1 = (s.equals(s1));   //true
        boolean t2 = (s == s1);        //false
        System.out.println(t1);
        System.out.println(t2);

        String ss = "Java";
        boolean t3 = (s1 == s2);
        System.out.println(t3);
    }
}
