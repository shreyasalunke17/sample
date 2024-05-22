package StringPrograms;
public class ImmutableVsFinal
{

    public static void main(String[] args) {
        //Immutable
        String s = "Java";
        System.out.println(s);    //Java
        String s1 = s.concat(" Programming");
        System.out.println(s1);   //Java Programming

        //Immutable  => we can not change or modify the object
        //final  => memory can not be changed
        //final
        //  final Integer i = 400;
        //i  = 200;
    }
}
