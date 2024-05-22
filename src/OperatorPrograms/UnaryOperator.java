package OperatorPrograms;
public class UnaryOperator
{
    public static void main(String[] args)
    {
        int a=20;
        int b=30;

        System.out.println("Post-increment : "+(a++));
        System.out.println("Pre-increment : "+(++a));
        System.out.println("Post-decrement : "+(b--));
        System.out.println("Pre-decrement : "+(--b));
    }
}




















/* 2. Unary Operators
Unary operators need only one operand. They are used to increment,decrement,or negate a value.

– : Unary minus, used for negating the values.
+ : Unary plus indicates the positive value (numbers are positive without this, however). It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.
++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators.
Post-Increment: Value is first used for computing the result and then incremented.
Pre-Increment: Value is incremented first, and then the result is computed.
– –  : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators.
Post-decrement: Value is first used for computing the result and then decremented.
Pre-Decrement: The value is decremented first, and then the result is computed.
! : Logical not operator, used for inverting a boolean value. */










































