package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.PreparedStatement;

public class ToConnectDB {
    public static Connection getConnectSQLDB() throws SQLException {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection myConnection=null;
         myConnection = DriverManager.getConnection("jdbc:oracle:thin:"+ "system" + "/" + "123" + "@" + "localhost");
        return myConnection;
    }
}
