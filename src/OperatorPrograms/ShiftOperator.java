package OperatorPrograms;
public class ShiftOperator
{
    public static void main(String[] args)
    {
        int a=20;
        System.out.println("a<<1 : "+(a << 1));
        System.out.println("a>>1 : "+(a >> 1));
    }
}























/* 8.Shift Operators
These operators are used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively. They can be used when we have to multiply or divide a number by two. General format-

Syntax: number shift_op number_of_places_to_shift;

<<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result.
Similar effect as multiplying the number with some power of two.

>>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result.
The leftmost bit depends on the sign of the initial number. Similar effect to dividing the number with some power of two.

>>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result.
The leftmost bit is set to 0. */


















