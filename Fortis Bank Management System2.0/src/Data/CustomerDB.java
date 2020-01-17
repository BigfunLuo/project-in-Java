package Data;

import Bus.*;
import Bus.Date;

import java.sql.*;

public class CustomerDB {

    public static void insert(Customer c) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "insert into Customer values(?,?,?,?,?,?,?,?) ";
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.setInt(1,c.getCustomerId());
        myPreparedStatement.setString(2,c.getCustomerPassword());
        myPreparedStatement.setString(3,c.getCustomerFirstname());
        myPreparedStatement.setString(4,c.getCustomerLastname());
        myPreparedStatement.setInt(5,c.getCustomerBirthdate().getDay());
        myPreparedStatement.setInt(6,c.getCustomerBirthdate().getMonth());
        myPreparedStatement.setInt(7,c.getCustomerBirthdate().getYear());
        myPreparedStatement.setInt(8,c.getManagerId());
        myPreparedStatement.executeUpdate();
    }
    //Check Account List
    public static void CheckList(long key) throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select c.cid,fname,lname,accountno,accounttype,ckno,svno,cdno from Customer c,Account a " +
                "where c.cid=a.cid and c.cid="+key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, ano,fn,ln,ckno,svno,cdno,type;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            fn = myResultset.getString(2);
            ln = myResultset.getString(3);
            ano = myResultset.getString(4);
            type = myResultset.getString(5);
            ckno = myResultset.getString(6);
            svno = myResultset.getString(7);
            cdno = myResultset.getString(8);
            System.out.println("Customer Id:"+id + "| FirstNmae:" + fn+ "|  LastName:" + ln+ "| Account No:" +ano+
                    "| Account type:" + type+ "| Checking No:" + ckno+ "| Saving No:" + svno+ "| Credit No:" + cdno);
        }
    }
    //Display all Customers
    public static void Display() throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "select * from Customer";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, pin,fn,ln,day,month,year,mid;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            pin = myResultset.getString(2);
            fn = myResultset.getString(3);
            ln = myResultset.getString(4);
            day = myResultset.getString(5);
            month = myResultset.getString(6);
            year=myResultset.getString(7);
            mid = myResultset.getString(6);
            System.out.println("Customer Id:"+id + "| Password:" + pin+ "| FirstName:" + fn+ "| LastName:" + ln+
                    "| Birthdate:" +day+"-"+month+"-"+year+ "| ManagerId:" + mid);
        }
    }
    //Close an Account
    public static void Remove(long ckey,long mkey) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "delete * from Customer where cid ="+ ckey+" and mid ="+mkey ;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();
        //myConnection.commit();
    }
    //Search a Customer
    public static Customer Search(long key) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select * from Customer where CustomerId = " + key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        Customer aCustomer=new Customer();
        Date aDate=new Date();
        while (myResultset.next()){
            aCustomer.setCustomerId(myResultset.getInt(1));
            aCustomer.setCustomerPassword(myResultset.getString(2));
            aCustomer.setCustomerFirstname(myResultset.getString(3));
            aCustomer.setCustomerLastname(myResultset.getString(4));
            aDate.setDay(myResultset.getInt(5));
            aDate.setMonth(myResultset.getInt(6));
            aDate.setYear(myResultset.getInt(7));
            aCustomer.setCustomerBirthdate(aDate);
            aCustomer.setManagerId(myResultset.getInt(8));
        }
        return aCustomer;
        //myConnection.commit();
    }
/* Login in
public static Customer LoginMatch(long key,String ck_pin) throws SQLException {
     Connection myConnection= ToConnectDB.getConnectSQLDB();
     Customer aCustomer= new Customer();
     String sqlQuery = "Select * from Customer where CustomerId = " + key+" and password ='"+ck_pin+"'";
     Statement myStatement = myConnection.createStatement();
     ResultSet myResultset = myStatement.executeQuery(sqlQuery);
     while (myResultset.next()){
         aCustomer.setCustomerId(myResultset.getInt(1));
         aCustomer.setCustomerPin(myResultset.getString(2));
     }
     return aCustomer;
     //myConnection.commit();
 }*/
    //Update a Customer profile
    public static void Update(long key,String new_pin,String new_fn,String new_ln,int day,int month,int year) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "update Customer set password ='" + new_pin +"',fname ='"+new_fn+"',lname ='" +new_ln+
                "', bday = " +day+ ", bmonth = " +month+ ", byear = " +year+ " where CustomerId = " + key;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();

    }
    //Sort all Customer by id
    public static void Sort() throws SQLException {
        String sqlQuery = "select * from Customer order by cid";
        Statement myStatement =ToConnectDB.getConnectSQLDB().createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        ToConnectDB.getConnectSQLDB().commit();
        String id, pin,fn,ln,day,month,year,mid;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            pin = myResultset.getString(2);
            fn = myResultset.getString(3);
            ln = myResultset.getString(4);
            day = myResultset.getString(5);
            month = myResultset.getString(6);
            year=myResultset.getString(7);
            mid = myResultset.getString(8);
            System.out.println("Customer Id:"+id + "| Password:" + pin+ "| FirstName:" + fn+ "| LastName:" + ln+
                    "| Birthdate:" +day+"-"+month+"-"+year+ "| ManagerId:" + mid);
        }
    }
}
