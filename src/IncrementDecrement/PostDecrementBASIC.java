package IncrementDecrement;

public class PostDecrementBASIC
{
    public static void main(String[] args) {
        int x = 10;
        int y = x--;
        System.out.println("Value of y is: "+y);
    }
}


/* Post Decrement Operator:
If a decrement operator is used after an operand, then it is called Post decrement operator.

Syntax: operand-- */

/**
 Post decrement operator is applied on ‘x’, here the case is the complete opposite of pre decrement operator, first,
 the value
 of variable ‘x’ is assigned to the variable ‘y’ and then the value of ‘x’ is decremented by 1.
 As per example,the initial value of ‘x’ is 10. After applying post decrement operator on variable ‘x’ the current
 values of‘x’ (i.e.10) is assigned to ‘y’, and then the value of ‘x’ is decremented by 1.So when displaying the value
 of ‘y’ it is showing as 10 */












