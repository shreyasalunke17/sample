package IncrementDecrement;
class PreIncrement1
{
    public static void main(String[] args)
    {
        int variable=5;
        System.out.println("Value of the variable="+variable);

        int preIncrement = ++variable;
        System.out.println("variable="+variable);
        System.out.println("preIncrement="+ preIncrement);
        System.out.println("++preIncrement="+ ++preIncrement);
    }
}






















/* Syntax: ++operand */
/* Pre-Increment Operator (++x)
If the increment operator (++) is specified before the variable like a prefix (++x),then it is called pre-increment operator */

/*You can use unary operators to represent a positive value, negative value, increment a value by 1,
decrement a value by 1 or to negate a value.
+x (positive value)
-x (negative value)
++x (increment operation)
--x (decrement operation)
!x (negation)

Types of Unary Operators
There are 5 types of the Unary Operators
1. Unary Plus
It represents a positive value like +x = x or +5 = 5
2. Unary Minus
It represents a negative value like -x = -x or -5 = -5
3. Increment Unary Operator
It increments the value by 1 where ++x = x+1
4. Decrement Unary Operator
It decrements the value by 1 where --x = x-1
5. Logical Complement
It logically inverts the value of a boolean like if x = true,then !x will be false
Increment Operator (++)
The increment (++) operator (also known as increment unary operator) in Java is used to increase the value of a variable by 1
Since it is a type of a unary operator, it can be used with a single operand.

The syntax for increment operator is a pair of addition signs i.e.
++x;
x++;

The operator can be applied either before or after the variable.Both will have the same increment of 1
However, they both have separate uses and can be categorized as the following types
Pre-Increment Operator
Post-Increment Operator */

