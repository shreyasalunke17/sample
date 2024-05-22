package Overriding;
/*Rule No:4 => The access level cannot be more restrictive than the overridden method’s access level.
For example:If the super class method is declared public then the over-ridding method in the sub class
cannot be either private or default or protected.*/
/*class A1 {
    protected void method()
    {
        System.out.println("Hello");
    }
}

 class B1 extends A1
{
    void method()
    {
        System.out.println("Hello");
    }

    public static void main(String args[])
    {
        B1 obj=new B1();
        obj.method();
    }
}*/

//Compile Time Error
//private is more restricted then default and default is more restricted than protected.
/* Note: In the above Example Superclass class A defined a method whose access modifier is protected.
While doing method overriding in SubClass Class B we didn’t define any access modifier so Default access
modifier will be used. By the rule, Default is more restricted then Protected so this program will give compile time error.
Instead of default, we could’ve used public which is less restricted then protected.*/

