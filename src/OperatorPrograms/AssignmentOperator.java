package OperatorPrograms;
public class AssignmentOperator
{
    public static void main(String[] args)
    {
        int a = 4;
        System.out.println("a += 2: "+(a +=2));
        System.out.println("a -= 5: "+(a -=5));
        System.out.println("a *= 4: "+(a *=4));
        System.out.println("a /= 3: "+(a /=3));
        System.out.println("a %= 5: "+(a %=10));
        System.out.println("a <<= 2: "+(a <<=2));
        System.out.println("a >>= 2: "+(a >>=2));
        System.out.println("a >>>= 1: "+(a >>>=1));
    }
}

















/* 3.Assignment Operator
‘=’ Assignment operator is used to assign a value to any variable. It has right-to-left associativity, i.e. value given
on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant.

The general format of the assignment operator is:

Syntax: variable = value;

In many cases,the assignment operator can be combined with other operators to build a shorter version of the statement
called a Compound Statement. For example, instead of a = a+5, we can write a += 5.

+=, for adding the left operand with the right operand and then assigning it to the variable on the left.
-=, for subtracting the right operand from the left operand and then assigning it to the variable on the left.
*=, for multiplying the left operand with the right operand and then assigning it to the variable on the left.
/=, for dividing the left operand by the right operand and then assigning it to the variable on the left.
%=, for assigning the modulo of the left operand by the right operand and then assigning it to the variable on the left. */




