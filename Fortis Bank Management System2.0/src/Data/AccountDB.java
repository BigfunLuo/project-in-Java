package Data;

import Bus.*;
import Bus.Date;


import java.sql.*;

public class AccountDB {

//"#2 Create a new Account\n"
//CREATE TABLE Account(accountno NUMBER, pin number not null,accounttype VARCHAR2(50),balance number,
//openday number,openmonth number,openyear number,cid NUMBER,ckno number not null,svno number,CONSTRAINT ano_PK PRIMARY KEY (accountno));
    public static void insert(Account a) throws SQLException {
    Connection myConnection= ToConnectDB.getConnectSQLDB();
    String sqlStmt = "insert into Account values(?,?,?,?,?,?,?,?,?,?,?) ";
    PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
    myPreparedStatement.setInt(1,a.getAccountNo());
    myPreparedStatement.setInt(2,a.getPin());
    myPreparedStatement.setString(3,a.getAccountType().toString());
    myPreparedStatement.setFloat(4,a.getBalance());
    myPreparedStatement.setInt(5,a.getDate().getDay());
    myPreparedStatement.setInt(6,a.getDate().getMonth());
    myPreparedStatement.setInt(7,a.getDate().getYear());
    myPreparedStatement.setInt(8,a.getCid());
    myPreparedStatement.setInt(9,a.getCkno());
    myPreparedStatement.setInt(10,a.getSvno());
    myPreparedStatement.setInt(11,a.getCdno());
    myPreparedStatement.executeUpdate();
}
    //Check Transaction List
    public static void CheckTransaction(long key) throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select a.accountno,transactionNo,type,description,accounttype,amount from Transaction t,Account a \n" +
                "where t.ano=a.accountno and t.ano="+key;
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
            System.out.println("Account No:"+ ano + "| Transaction No:" + tno+ "|  description:" +desc+ "| Transaction Type:" +type+
                    "| Account type:" + atype+ "| Amount:" +amount);
        }
    }
    //Display all Accounts
    public static void Display() throws SQLException {
        Connection myConnection = ToConnectDB.getConnectSQLDB();
        String sqlQuery = "select * from Account";
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        String id, pin,fn,ln,day,month,year,cid,ckno,svno,cdno;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            pin = myResultset.getString(2);
            fn = myResultset.getString(3);
            ln = myResultset.getString(4);
            day = myResultset.getString(5);
            month = myResultset.getString(6);
            year=myResultset.getString(7);
            cid = myResultset.getString(8);
            ckno = myResultset.getString(9);
            svno = myResultset.getString(10);
            cdno=myResultset.getString(11);
            System.out.println("Account No:"+id + "| Password:" + pin+ "| FirstName:" + fn+ "| LastName:" + ln+
                    "| Openeddate:" + day+"-"+month+"-"+year+ "| Customer Id:" + cid+"| Checking Id:" + ckno
                    + "| Saving No:" + svno+ "| Credit No:" + cdno);
        }
    }
    //Close an Account
    public static void Remove(long ckey,long akey) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "delete * from Account where cid ="+ ckey+" and ano ="+akey ;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();
        //myConnection.commit();
    }
    //Search a Account
    public static Account Search(long key) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlQuery = "Select * from Account where AccountId = " + key;
        Statement myStatement = myConnection.createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        Account aAccount=new Account();
        Date aDate= new Date();
        while (myResultset.next()){
            aAccount.setAccountNo(myResultset.getInt(1));
            aAccount.setPin(myResultset.getInt(2));
            aAccount.setAccountType(EnumAccountType.valueOf(myResultset.getString(3)));
            aAccount.setBalance(myResultset.getInt(4));
            aDate.setDay(myResultset.getInt(5));
            aDate.setMonth(myResultset.getInt(6));
            aDate.setYear(myResultset.getInt(7));
            aAccount.setDate(aDate);
            aAccount.setCid(myResultset.getInt(8));
            aAccount.setCkno(myResultset.getInt(9));
            aAccount.setSvno(myResultset.getInt(10));
            aAccount.setCdno(myResultset.getInt(11));
        }
        return aAccount;
        //myConnection.commit();
    }
    /* Login in
    public static Account LoginMatch(long key,String ck_pin) throws SQLException {
         Connection myConnection= ToConnectDB.getConnectSQLDB();
         Account aAccount= new Account();
         String sqlQuery = "Select * from Account where AccountId = " + key+" and password ='"+ck_pin+"'";
         Statement myStatement = myConnection.createStatement();
         ResultSet myResultset = myStatement.executeQuery(sqlQuery);
         while (myResultset.next()){
             aAccount.setAccountId(myResultset.getInt(1));
             aAccount.setAccountPin(myResultset.getString(2));
         }
         return aAccount;
         //myConnection.commit();
     }*/
    //Update a Account profile
    public static void Update(long key,String new_pin,String atype,int bal,int opday,int opmonth,int opyear,int ckno,int svno,int cdno) throws SQLException {
        Connection myConnection= ToConnectDB.getConnectSQLDB();
        String sqlStmt = "update Account set password ='" + new_pin +"',Account type ='" + atype + "',balance =" +bal+
                " , openday = " +opday+ ", openmonth = " +opmonth+ ", openyear = " +opyear+", ckno =" +ckno+
                ", svno= "+svno+ ", cdno = " +cdno+ " where AccountId = " + key;
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(sqlStmt);
        myPreparedStatement.executeUpdate();

    }
    //Sort all Account by id
    public static void Sort() throws SQLException {
        String sqlQuery = "select * from Account order by cid";
        Statement myStatement =ToConnectDB.getConnectSQLDB().createStatement();
        ResultSet myResultset = myStatement.executeQuery(sqlQuery);
        ToConnectDB.getConnectSQLDB().commit();
        String id, pin,fn,ln,day,month,year,cid,ckno,svno,cdno;
        while (myResultset.next()) {
            id = myResultset.getString(1);
            pin = myResultset.getString(2);
            fn = myResultset.getString(3);
            ln = myResultset.getString(4);
            day = myResultset.getString(5);
            month = myResultset.getString(6);
            year=myResultset.getString(7);
            cid = myResultset.getString(8);
            ckno = myResultset.getString(9);
            svno = myResultset.getString(10);
            cdno=myResultset.getString(11);
            System.out.println("Account No:"+id + "| Password:" + pin+ "| FirstName:" + fn+ "| LastName:" + ln+
                    "| Openeddate:" + day+"-"+month+"-"+year+ "| Customer Id:" + cid+"| Checking Id:" + ckno
                    + "| Saving No:" + svno+ "| Credit No:" + cdno);
        }
    }


}
