package Data;

import Bus.*;
import Bus.Date;

import java.sql.*;


public class TransactionDB {
    //CREATE TABLE Transaction(transactionNo NUMBER,description VARCHAR2(50),tranday number,tranmonth number,tranyear number,
    //amount NUMBER,CONSTRAINT tran_PK PRIMARY KEY (transactionNo));
    public static void insert(Transaction t) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "insert into Transation values(?,?,?,?,?,?) ";
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.setInt(1,t.getTransactionNo());
        myPreparedStatement.setString(2,t.getDescription());
        myPreparedStatement.setInt(3,t.getTransactiondate().getDay());
        myPreparedStatement.setInt(4,t.getTransactiondate().getMonth());
        myPreparedStatement.setInt(5,t.getTransactiondate().getYear());
        myPreparedStatement.setFloat(6,t.getAmount());

        myPreparedStatement.executeUpdate();
    }
    //Check Transaction List
    /*public static void CheckTransaction(long key) throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select a.Transationno,transactionNo,type,description,Transationtype,amount from Transaction t,Transation a \n" +
                "where t.ano=a.Transationno and t.ano="+key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String ano ,tno,type,desc,atype,amount;
        while (myResultset.next()) {
            ano= myResultset.getString(1);
            tno = myResultset.getString(2);
            type = myResultset.getString(3);
            desc = myResultset.getString(4);
            atype = myResultset.getString(5);
            amount = myResultset.getString(6);
            System.out.println("Transation No:"+ ano + "| Transaction No:" + tno+ "|  description:" +desc+ "| Transaction Type:" +type+
                    "| Transation type:" + atype+ "| Amount:" +amount);
        }
    }*/
    //Display all Transations
    public static void Display() throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "select * from Transaction";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, ds,day,month,year,amount;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            ds= myResultset.getString(2);
            day = myResultset.getString(5);
            month = myResultset.getString(6);
            year=myResultset.getString(7);
            amount= myResultset.getString(8);
            System.out.println("Transation No:"+id + "| description:" + ds+
                    "| Transationdate:" + day+"-"+month+"-"+year+ "| Amount:" + amount);
        }
    }

    //Search a Transation by date
    public static Transaction Search( ) throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select * from Transation where tranyear = " ;//+ key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        Transaction aTransaction = new Transaction();
        Date aDate = new Date();
        while (myResultset.next()) {
            aTransaction.setTransactionNo(myResultset.getInt(1));
            aTransaction.setDescription(myResultset.getString(2));
            aDate.setDay(myResultset.getInt(3));
            aDate.setMonth(myResultset.getInt(4));
            aDate.setYear(myResultset.getInt(5));
            aTransaction.setTransactiondate(aDate);
            aTransaction.setAmount(6);

        }
        return aTransaction;
    }

}
