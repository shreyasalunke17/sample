package Collection.List.ArrayListMethods;

// A Java program to demonstrate shallow copy using clone()
// An object reference of this class is contained by Test2
class Test
{
    int x, y;
}
// Contains a reference of Test and implements clone with shallow copy.
class Test2 implements Cloneable
{
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class CloneShallowCopy
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t2 = (Test2)t1.clone();

        // Creating a copy of object t1 and passing it to t2
        t2.a = 100;

        // Change in primitive type of t2 will not be reflected in t1 field
        t2.c.x = 300;

        // Change in object type field will be reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
    }
}

/*
i)Usage of clone() method-Shallow Copy
Note – In the below code example the clone() method does create a completely new object with a different hashCode value,
which means its in a separate memory location. But due to the Test object c being inside Test2, the primitive types have
achieved deep copy but this Test object c is still shared between t1 and t2. To overcome that we explicitly do a deep copy
for object variable c, which is discussed later.
*/