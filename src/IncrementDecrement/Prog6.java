package IncrementDecrement;
public class Prog6
{
    public static void main(String[] args)
    {
        int a=20;
        a= a++ + ++a;
        //20 + 22 = 42
        System.out.println(a);

    }
}
//              int a=20
//20            a=a++ => 20, value 20 is assigned so,,,20
//22            In ++a => 21 stored value of a++ then,pre-increment ++a=22
//----
//42            20+22=42



















