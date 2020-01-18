package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import bus.FStudent;


public class FStudentDB {
	public static void insert(FStudent s) throws SQLException {
        Connection myConnection= ConnectionDB.getConnectSQLDB();
        String sqlStmt = "insert into fstudent values(?,?,?,?,?,?) ";
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.setInt(1,s.getSid());
        myPreparedStatement.setString(2,s.getFn());
        myPreparedStatement.setString(2,s.getLn());
        myPreparedStatement.setString(2,s.getEmail());
        myPreparedStatement.setFloat(2,s.getfeesPerSession());
        myPreparedStatement.setFloat(2,s.getFirstfees());
        myPreparedStatement.executeUpdate();
    }
    public static void Display() throws SQLException {
        Connection myConnection= ConnectionDB.getConnectSQLDB();
        String sqlQuery = "select * from fstudent";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, fn,ln,mail,pay,fpay;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            fn= myResultset.getString(2);
            ln = myResultset.getString(1);
            mail= myResultset.getString(2);
            pay = myResultset.getString(1);
            fpay= myResultset.getString(2);
            System.out.println("Sid:"+id + "|Firstname:" + fn+ "|Lastname£º" + ln+ "|Email£º" +mail+ "|fee per session£º" 
            +pay+ "|Fist fee:" +fpay+ "|Total£º" +(fpay+pay));
        }

    }
    public static void Remove(long key) throws SQLException {
        Connection myConnection= ConnectionDB.getConnectSQLDB();
        String sqlStmt = "delete from fstudent where id = " + key;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();
        //myConnection.commit();
    }
   
    public static void Search(int key) throws SQLException {

        String sqlQuery = "select * from fstudent where sid="+key;
        Statement myStatement =ConnectionDB.getConnectSQLDB().createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        ConnectionDB.getConnectSQLDB().commit();
        String id, fn,ln,mail,pay,fpay;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            fn= myResultset.getString(2);
            ln = myResultset.getString(1);
            mail= myResultset.getString(2);
            pay = myResultset.getString(1);
            fpay= myResultset.getString(2);
            System.out.println("Sid:"+id + "|Firstname:" + fn+ "|Lastname£º" + ln+ "|Email£º" +mail+ "|fee per session£º" 
            +pay+ "|Fist fee:" +fpay+ "|Total£º" +(fpay+pay));
    }
    }
}
