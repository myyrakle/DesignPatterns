package example;

import java.sql.*;

//프록시 클래스
class PersonProxy
{
    private Connection connection;
    public void connect() throws SQLException
    {
        this.connection = DriverManager.getConnection("..."); //... 연결했다고 가정
    }

    public void printAllNames() throws SQLException
    {
        PreparedStatement statement = connection.prepareStatement("select name from students");
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next())
            System.out.println(resultSet.getString("name"));
    }
}

public class UseProxy
{
    public static void main(String[] args)
    {
        try
        {
            PersonProxy proxy = new PersonProxy();
            proxy.connect(); //연결
            proxy.printAllNames(); //출력
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}