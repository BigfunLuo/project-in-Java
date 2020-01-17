package Bus;

//import java.util.Date;

import Data.AccountDB;

import java.sql.SQLException;

public class Account {
	private int accountno;
	private int pin ;
	private EnumAccountType accounttype;
	private float balance;
	private Date openeddate;
	private int cid;
	private int ckno;
	private int cdno;
	private int svno;

   public int getCid() {
		return this.cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Account(){
	this.accountno=0;
	this.pin=0;
	this.accounttype=EnumAccountType.undefined;
	this.balance=0;
	this.openeddate=null;
	this.cid=0;
   }
   	public Account(int ano,int pw,EnumAccountType type,float balance,Date date,int no) {
	this.accountno=ano;
	this.pin=pw;
	this.accounttype=type;
	this.balance=balance;
	this.openeddate=date;
	this.cid=no;
   	}
   	public int getAccountNo() {
	return this.accountno;
   	}
   	public void setAccountNo(int ano) {
	this.accountno=ano;
   	}
   	public int getPin() {
	return this.pin;
   	}
   	public void setPin(int pin) {
	this.pin=pin;
   	}
   	public EnumAccountType getAccountType() {
	return this.accounttype;
   	}
   	public void setAccountType(EnumAccountType type) {
	this.accounttype=type;
   	}

   	public float getBalance() {
	return this.balance;
   	}
   	public void setBalance(float balance) {
	this.balance=balance;
   	}

   	public Date getDate() {
	return this.openeddate;
   	}
   	public void setDate(Date date) {
	this.openeddate=date;
   	}
	public int getCkno() {
		return ckno;
	}

	public void setCkno(int ckno) {
		this.ckno = ckno;
	}

	public int getCdno() {
		return cdno;
	}

	public void setCdno(int cdno) {
		this.cdno = cdno;
	}

	public int getSvno() {
		return svno;
	}

	public void setSvno(int svno) {
		this.svno = svno;
	}
   	public String toString() {
	return "Account No:"+this.accountno+"\nPin:"+this.pin+"\nAccount Type:"+this.accounttype+"\nOpened Date:"+openeddate.toString()+
			"\nBalance:"+this.balance+"\nCustomer id:"+this.cid;//transaction.toString();
			
   		}
	public static void insert(Account a) throws SQLException {
		AccountDB.insert(a);
	}
	public static void CheckTransaction(long key) throws SQLException {
		AccountDB.CheckTransaction(key);
	}
	public static void Display() throws SQLException {
		AccountDB.Display();
	}
	public static void Remove(long ckey,long akey) throws SQLException {
		AccountDB.Remove(ckey, akey);
	}
	public static Account Search(long key) throws SQLException {
		return AccountDB.Search(key);
	}
	public static void Update(long key,String new_pin,String atype,int bal,int opday,int opmonth,int opyear,int ckno,int svno,int cdno) throws SQLException{
		AccountDB.Update(key, new_pin, atype, bal, opday, opmonth, opyear, ckno, svno, cdno);
	}
	public static void Sort() throws SQLException {
		AccountDB.Sort();
	}

}
