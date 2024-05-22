package ExceptionHandling.Checked;
import java.text.SimpleDateFormat;
import java.util.Date;

class ParseException extends Throwable
{
    public static void main(String[] args)
    {
        String dateString = "2024-16-04"; // Invalid date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try
        {
            Date date = dateFormat.parse(dateString);
            System.out.println("Parsed date: " + date);

        }
        catch (java.text.ParseException e)
        {
            throw new RuntimeException(e);
        }
    }
}
/*
ParseException is an exception that indicates an error occurred during parsing, typically involving the conversion
of strings to other data types, such as dates or numbers. This exception is commonly associated with classes like
SimpleDateFormat and NumberFormat.
In this example, we attempt to parse the string "2022-13-01" into a Date object using a SimpleDateFormat object with
the pattern "yyyy-MM-dd". However, the month value 13 is invalid, leading to a ParseException being thrown.
When the exception is caught, the program prints an error message indicating the issue with parsing the date.
*/












