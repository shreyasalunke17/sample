package Overriding;
/*A method declared final cannot be overridden */
class Shape
{
    public void Area()
    {
        System.out.println("Area method of shape");
    }
    public final void Perimeter()
    {
        System.out.println("Perimeter method of shape");
    }
    }
     class Rectangle extends Shape
     {
      //  public void Perimeter()
        {
        System.out.println("Perimeter method of shape");
        }
    }
      public class OverridingRule5
      {
        public static void main(String[] args)
        {
            Rectangle obj = new Rectangle();
            obj.Perimeter();
            obj.Area();
        }
    }


















/*If we try to override the final method (Perimeter method of shape) of the superclass.
the compiler will throw an error.
Hence we do not override the final method of the superclass in Java.*/


/*What is a Final Keyword in Java?
In Java,the final keyword can be used to indicate that something cannot be changed. It can be used in several contexts,
such as to declare a variable as a constant, to declare a method as final, or to declare a class as final.
The final Keyword in Java behaves differently when used with classes, methods, and variables.


/*Why Does The final Keyword Prevent Overriding?
In the beginning, it was discussed that methods to be Overridden follow Dynamic Method Dispatch (late binding)But the
methods which are declared as final follow static binding (early binding), which means that the method definition will
be grouped with a body at compile-time itself.
In other words, JVM must know exactly which method to call at compile-time.To accomplish this,for every final method
definition there must be a unique body. But if Overriding is allowed then there can be multiple bodies for a method
definition and then the compiler won’t be able to choose one of them.*/


/*Points to remember about Final Keyword in Java:
---------------------------------------------------
Once any data member (a variable, method, or class) gets declared as final,it can only be assigned once.
The final variable cannot be reinitialized with another value.
A final method cannot be overridden by another method.
A final class cannot be extended or inherited by another child class. */


/*Dynamic Method Dispatch or Runtime Polymorphism in Java:
-----------------------------------------------------------
Method overriding is one of the ways in which Java supports Runtime Polymorphism. Dynamic method dispatch is the mechanism
by which a call to an overridden method is resolved at run time, rather than compile time.
When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) of
that method is to be executed based upon the type of the object being referred to at the time the call occurs. Thus, this
determination is made at run time.
At run-time, it depends on the type of the object being referred to (not the type of the reference variable) that determines
which version of an overridden method will be executed
A superclass reference variable can refer to a subclass object. This is also known as upcasting.
Java uses this fact to resolve calls to overridden methods at run time.
Therefore, if a superclass contains a method that is overridden by a subclass, then when different types of objects are
referred to through a superclass reference variable, different versions of the method are executed. Here is an example that
illustrates dynamic method dispatch */
