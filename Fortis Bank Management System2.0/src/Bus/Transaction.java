package Bus;

import Data.TransactionDB;

import java.sql.SQLException;

public class Transaction {
	private int transactionNo;
	private String description;
	private Date transactiondate;
	private float amount;
	private EnumTransactionType type;
	private int accountno;

	public int getTransactionNo() {
		return this.transactionNo;
	}

	public void setTransactionNo(int transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTransactiondate() {
		return this.transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public EnumTransactionType getType() {
		return this.type;
	}

	public void setType(EnumTransactionType type) {
		this.type = type;
	}

	public Transaction() {
		this.type = EnumTransactionType.undefined;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public Transaction(int transactionNo, String description, Date transactiondate, float amount,
					   EnumTransactionType type, int ano) {
		this.transactionNo = transactionNo;
		this.description = description;
		this.transactiondate = transactiondate;
		this.amount = amount;
		this.type = type;
		this.accountno = ano;
	}

	public String toString() {
		return "Transaction [transactionNo=" + this.transactionNo + ", description=" + this.description + ", transactiondate="
				+ transactiondate.toString() + ", amount=" + this.amount + ", type=" + this.type + ",accountno=" + this.accountno + "]";
	}

	public static void insert(Transaction t) throws SQLException {
		TransactionDB.insert(t);
	}

	public static void Display() throws SQLException {
		TransactionDB.Display();
	}

	public static Transaction Search() throws SQLException {
	return TransactionDB.Search();
	}
}