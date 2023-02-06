package CLS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    static String URL="jdbc:mysql://localhost:3306/Bakery";
//set pass to your mysql password to run
    static String pass="Hn770911";
    static String user="root";
    public static Connection connectDB(){
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,user,pass);
            return connection;

        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
