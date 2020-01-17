package Bus;

import Data.CustomerDB;

import java.sql.SQLException;

public class Customer {
    private int cid;
    private String password;
    private String fname;
    private String lname;
    private Date birthdate;
    private int managerId;

    public Customer() {

    }

    public Customer(int cid, String pd, String fn, String ln, Date da, int ac) {
        this.cid = cid;
        this.password = pd;
        this.fname = fn;
        this.lname = ln;
        this.birthdate = da;
        this.managerId = ac;
    }

    public int getCustomerId() {
        return this.cid;
    }

    public void setCustomerId(int id) {
        this.cid = id;
    }

    public String getCustomerPassword() {
        return this.password;
    }

    public void setCustomerPassword(String ps) {
        this.password = ps;
    }

    public String getCustomerFirstname() {
        return this.fname;
    }

    public void setCustomerFirstname(String fn) {
        this.fname = fn;
    }

    public String getCustomerLastname() {
        return this.lname;
    }

    public void setCustomerLastname(String ln) {
        this.lname = ln;
    }

    public Date getCustomerBirthdate() {
        return this.birthdate;
    }

    public void setCustomerBirthdate(Date da) {
        this.birthdate = da;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String ToString() {
        return "Customer ID:" + this.cid + "\nPassword:" + this.password + "\nFirstname:" + this.fname + "\nLastname:" + this.lname + "\nBirthdate:" + this.birthdate + "\nAccount:" + this.managerId;
    }

    public static void insert(Customer c) throws SQLException {
        CustomerDB.insert(c);
    }

    public static void CheckList(long key) throws SQLException {
        CustomerDB.CheckList(key);
    }

    public static void Display() throws SQLException {
        CustomerDB.Display();
    }


    public static void Remove(long ckey,long mkey) throws SQLException {
        CustomerDB.Remove(ckey,mkey);
    }

    public static Customer Search(long key) throws SQLException {
        return CustomerDB.Search(key);
    }

    public static void Update(long key, String new_pin, String new_fn, String new_ln, int day, int month, int year) throws SQLException{
        CustomerDB.Update(key, new_pin, new_fn, new_ln, day, month, year);
    }
    public static void Sort() throws SQLException{
        CustomerDB.Sort();
    }

}
