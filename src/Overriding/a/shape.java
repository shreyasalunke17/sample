package Overriding.a;
public class shape
{
    public int show(){
        System.out.println("This is a public method of package a");
        return 10;
    }
    protected int show(int a)
    {
        System.out.println("This is a protected paremeterize method of package a");
        return 10;
    }
    protected int show(int a,String c)
    {
        System.out.println("This is a protected method of package a");
        return 10;
    }
}











/*Default method overriding
// Hello.java
package a;
public class Hello {
    void printMessage()
    {
        System.out.println("Hello");
    }
}

// World.java
package b;
import a.Hello;
public class World extends Hello {
    void printMessage()
    {
        System.out.println("World");
    }
    public static void main(String[] args)
    {
        Hello obj = new Hello();
        obj.printMessage();
    }
}
error: printMessage() is not public in Hello; cannot be accessed from outside package
Visibility of a default method is within its package only. Hence it can’t be access outside the package.
Thus, no overriding in this case.*/


