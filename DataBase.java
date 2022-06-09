import java.sql.*;

public class DataBase {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@164.92.198.78:1539:XEPDB1","CAHIDB","qonan1");
            Statement stmt = con.createStatement();
            //Thread.sleep(5000);
            ResultSet resultSet = stmt.executeQuery("select * from ot.home_work");
            while (resultSet.next()){
                System.out.println(resultSet.getString(2));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
