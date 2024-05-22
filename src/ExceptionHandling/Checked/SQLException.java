package ExceptionHandling.Checked;
import java.sql.*;
class SQLExceptionn
{
    public static void main(String[] args)
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","username", "password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
        }
        catch (java.sql.SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}

