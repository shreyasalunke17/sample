package StringPrograms;
public class StringSCPvsHeapTest
{
    public static void main(String[] args)
    {
        //New keyword
        String s = new String("Java");
        String s1 = new String("Java");
        String s2 = new String("Java");


        //Literal    SCP
        String l1 = "Java";
        String l2 = "Java";
        String l3 = "Java123";
        String l4 = "Java123";
    }
}
