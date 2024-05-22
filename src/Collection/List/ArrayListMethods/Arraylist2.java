package Collection.List.ArrayListMethods;
import java.util.ArrayList;
public class Arraylist2
// Java code to illustrate void add(int index, Object element)
{
    public static void main(String[] args)
    {
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(10);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);

        // adding element 35 at fourth position
        arrlist.add(3, 35);

        // let us print all the elements available in list
        for (Integer number : arrlist)
        {
            System.out.println("Number = " + number);
        }
    }
}

/*
add(Object o) => This method is used to append a specific element to the end of a list.
*/