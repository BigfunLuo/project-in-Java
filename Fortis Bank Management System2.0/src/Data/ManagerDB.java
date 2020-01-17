package Data;

import Bus.Manager;
import com.sun.org.apache.xpath.internal.operations.Neg;

import java.sql.*;
import java.util.ArrayList;

public class ManagerDB {
    public static void insert(Manager m) throws SQLException {

        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "insert into Manager values(?,?) ";
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.setInt(1,m.getManagerId());
        myPreparedStatement.setString(2,m.getManagerPin());
        myPreparedStatement.executeUpdate();
    }
    public static void Display() throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "select * from Manager";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, pin;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            pin = myResultset.getString(2);
            System.out.println("Manager Id:"+id + "| Password:" + pin);
        }
    }

    public static Manager Search(long key) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select * from Manager where managerId = " + key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        Manager amanager=new Manager();
        while (myResultset.next()){
            amanager.setManagerId(myResultset.getInt(1));
            amanager.setManagerPin(myResultset.getString(2));
        }
        return amanager;
        //myConnection.commit();
    }
   /* Login in
   public static Manager LoginMatch(long key,String ck_pin) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        Manager amanager= new Manager();
        String sqlQuery = "Select * from Manager where managerId = " + key+" and password ='"+ck_pin+"'";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        while (myResultset.next()){
            amanager.setManagerId(myResultset.getInt(1));
            amanager.setManagerPin(myResultset.getString(2));
        }
        return amanager;
        //myConnection.commit();
    }*/

    public static void Update(long key,String new_pin) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "update Manager set name ='" + new_pin + "' where managerId = " + key;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();

    }
    public static void Sort() throws SQLException {

        String sqlQuery = "select * from Manager order by managerId";
        Statement myStatement =ToConnectDB.getConnectSQLDB().createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        ToConnectDB.getConnectSQLDB().commit();
        while (myResultset.next()) {
            String id = myResultset.getString(1);
            String pin = myResultset.getString(2);
            System.out.println("Manager Id:"+id + "| Password:" + pin);
        }
    }
    public static Boolean IsDuplicateId(long key) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select * from Manager where managerId = " + key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        while (myResultset.next()){
          return true;
        }
        return false;
}
public static boolean CheckManager() throws SQLException {
    Connection myConnection= ToConnectDB.getConnectSQLDB();
    String sqlQuery = "Select * from Manager where managerId = " + key;
    Statement myStatement = myConnection.createStatement();
    ResultSet myResultset = myStatement.executeQuery(sqlQuery);
    while (myResultset.next()){
        return true;
    }
    return false;
}

}
