package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection getConnectSQLDB(/*String username,String password,String service,String url*/) throws SQLException {
        //Class.forName("oracle.jdbc.driver.OracleDriver");
        // ToConnectDB.getConnectSQLDB("system","123","localhost","jdbc:oracle:thin:");
        Connection myConnection=null;
        myConnection = DriverManager.getConnection("jdbc:oracle:thin:"+ "system" + "/" + "123" + "@" + "localhost");
        return myConnection;
    }
}
