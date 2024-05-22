package Collection.List.ArrayListMethods;
// A Java program to demonstrate deep copy using clone()
// An object reference of this class is contained by Test2
class Test1 {
    int x, y;
}

// Contains a reference of Test and
// implements clone with deep copy.
class Testt2 implements Cloneable {
    int a, b;

    Test c = new Test();

    public Object clone() throws CloneNotSupportedException
    {
        // Assign the shallow copy to new reference variable t
        Testt2 t = (Testt2)super.clone();

        // Creating a deep copy for c
        t.c = new Test();
        t.c.x = c.x;
        t.c.y = c.y;
        // Create a new object for the field c and assign it to shallow copy obtained,to make it a deep copy
        return t;
    }
}
public class CloneDeepCopy
{
    public static void main(String[] args)
            throws CloneNotSupportedException
    {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t3 = (Test2)t1.clone();
        t3.a = 100;
        // Change in primitive type of t2 will not be reflected in t1 field
        t3.c.x = 300;
        // Change in object type field of t2 will not be reflected in t1(deep copy)
        System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
        System.out.println(t3.a + " " + t3.b + " " + t3.c.x + " " + t3.c.y);
    }
}

/*
ii)Usage of clone() method – Deep Copy
If we want to create a deep copy of object X and place it in a new object Y then a new copy of any referenced objects fields
are created and these references are placed in object Y. This means any changes made in referenced object fields in object
X or Y will be reflected only in that object and not in the other. In the below example, we create a deep copy of the object.
A deep copy copies all fields and makes copies of dynamically allocated memory pointed to by the fields.
A deep copy occurs when an object is copied along with the objects to which it refers.
*/