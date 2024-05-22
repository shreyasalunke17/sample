package IncrementDecrement;
public class Prog10
{
    public static void main(String[] args)
    {
        int a=20;
        a= a-- - --a;
        //20 - 18=2         a--=20 => a=19 => --a=18
        System.out.println(a);

        int b=20;
        b= b-- + ++b;
        //20 + 20=40
        System.out.println(b);
    }
}






















