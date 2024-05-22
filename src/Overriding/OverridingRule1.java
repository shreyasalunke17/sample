package Overriding;
/* Rule No:1 => A method can only be Overridden in Subclass,not in same class.(It should be parent child relationship)*/
class SuperClass
{
    void display()
    {
        System.out.println("Superclass display method");
    }
}
class SubClass extends SuperClass
{
    void display()
    {
        System.out.println("Subclass display method");
    }
}
class Main
{
    public static void main(String[] args)
    {
        SuperClass obj1 = new SuperClass();
        obj1.display();
        SuperClass obj2 = new SubClass();
        obj2.display();
    }
}


/* If a Parent type reference refers to a Parent object, then Parent's show is called
* If a Parent type reference refers to a Child object Child's show() is called.This is called RUN TIME POLYMORPHISM.*/


/*If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent
class, it is known as method overriding.

Usage of Java Method Overriding
---------------------------------
Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism */