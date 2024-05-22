package OperatorPrograms;
public class TernaryOperator
{
    public static void main(String[] args)
    {
        int a=10,b=40,c=80,ternaryoperator;

        ternaryoperator=((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max Of Three Numbers = "+ternaryoperator);
    }
}






















/* 6.Ternary operator
The ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary.

Syntax: condition ? if true : if false

The above statement means that if the condition evaluates to true, then execute the statements after the ‘?’ else execute
the statements after the ‘:’ */







