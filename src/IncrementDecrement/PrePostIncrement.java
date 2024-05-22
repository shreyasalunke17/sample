package IncrementDecrement;
public class PrePostIncrement
{
    public static void main(String args[])
    {
        int i=20;
        i++;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println("Pre incremented value="+ ++i);
        System.out.println("Post increment="+ i++);
        System.out.println("After Post increment="+ +i);
    }
}
