package OperatorPrograms;
public class BitwiseOperator
{
    public static void main(String[] args)
    {
        int d =0b1010;
        int e =0b1100;
        System.out.println("d & e: " +(d & e));
        System.out.println("d | e: " +(d | e));
        System.out.println("d ^ e: " +(d ^ e));
        System.out.println("~d: " +(~d));
        System.out.println("d << 2: " +(d << 2));
        System.out.println("e >> 1: " +(e >> 1));
        System.out.println("e >>> 1: " +(e >>> 1));
    }
}
















/* 7.Bitwise Operators
These operators are used to perform the manipulation of individual bits of a number.
They can be used with any of the integer types. They are used when performing update and query
operations of the Binary indexed trees.

&, Bitwise AND operator: returns bit by bit AND of input values.
|, Bitwise OR operator: returns bit by bit OR of input values.
^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
~, Bitwise Complement Operator: This is a unary operator which returns the one’s complement
representation of the input value, i.e.with all bits inverted. */









