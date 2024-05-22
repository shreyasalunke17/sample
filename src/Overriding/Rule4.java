package Overriding;
class A2 {
protected void method()
{
    System.out.println("Hello Java");
}
}
class B2 extends A2
 {
    public void method() {
        System.out.println("Hello Java");
    }
    public static void main(String[] args)
    {
            B2 b = new B2();
            b.method();
        }
}

/*In the above Example Superclass class A defined a method whose access modifier is protected.
While doing method overriding in SubClass Class B we define access modifier as Public.
Because Public access modifier is less restricted than Protected hence this program compiles successfully.*/