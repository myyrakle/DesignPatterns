package example;

import java.sql.*;

public class NoProxy
{
  public static void main(String[] args)
  {
    try
    {
      Connection connection =
              DriverManager.getConnection("..."); //... 연결했다고 가정

      PreparedStatement statement =
              connection.prepareStatement("select name from students");

      ResultSet resultSet = statement.executeQuery();

      //전부 출력
      while(resultSet.next())
        System.out.println(resultSet.getString("name"));
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }
}