package IncrementDecrement;
public class Prog11
{
    public static void main(String[] args)
    {
        int a=1;
        System.out.println(a++); //Post-increment=>assign vale of a=1,But not stored           1
        System.out.println(a++); //Post-incremented value is 2                                 2    then a++ value becomes 3
        System.out.println(++a); //a=3 => ++a => a=4                                           4

        System.out.println(a++); //4 then, a++ value becomes 5                                 4
        System.out.println(a++); //5 Here,value stored 5 & increment by 1 i.e. 6               5

        System.out.println(a--); //6 so,that 6 then a-- value becomes 5                        6
        System.out.println(a--); //5 value stored,and decrement by 1 so, value is 4            5  then next --a

        System.out.println(--a); //3 pre decrement so that value becomes 3                     3  then next --a
        System.out.println(--a); //2 value is 2                                                2  then a-- => 1
        System.out.println(a--); //2 but not stored becz post-decrement,value only assigned    2
        System.out.println(a);   //value get stored so a=1                                     1
    }
}
