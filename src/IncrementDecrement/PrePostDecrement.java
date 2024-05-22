package IncrementDecrement;

public class PrePostDecrement
{
    public static void main(String args[])
    {
        int i=20;
        i--;
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
        System.out.println("Pre Decremented value="+ --i);
        System.out.println("Post Decrement="+ i--);
        System.out.println("After Post Decrement="+ +i);
    }
}
