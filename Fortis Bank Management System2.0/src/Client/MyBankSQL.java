package Client;

import Bus.*;
import Bus.Date;
import Data.AccountDB;
import Data.CustomerDB;
import Data.ManagerDB;
import Data.ToConnectDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyBankSQL {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //connect to the SQL
        //Connection myConnection= ToConnectDB.getConnectSQLDB("system","123","localhost","jdbc:oracle:thin:");
        System.out.println("Connecting the SQL....");
        Date date1 = new Date();
        Manager Manager1 = new Manager();
        Customer Customer1 = new Customer();
        Account Account1=new Account();
        int option,choice,flag;
        int ManagerId;
        int SearchManagerId;
        Scanner scan = new Scanner(System.in);
            do {//main
                System.out.println("--------Bank Application----------");
                System.out.println("login in:\n#1 Manger\n#2 Customer\n#3 Exit");
                System.out.println("Enter your choice:");
                choice = scan.nextInt();
                if (choice == 1) {
                   System.out.println("-----Weclome Manager!----");
                    System.out.println("Username：");
                    ManagerId=scan.nextInt();
                    CustomerDB.Display();
                    CustomerDB.CheckList(100002);/*
                    Manager1.setManagerId(scan.nextInt());
                    System.out.println("Password：");//if username exist and then verify the password
                    Manager1.setManagerPin(scan.next());
                    myManagerList.add(Manager1);*/
                    do {
                    System.out.println("--------Manager Menu---------");
                    System.out.println("#1 Display all Managers\n" +
                            "#2 Create a new Customer\n" +
                            "#3 Delete a Customer\n" +
                            "#4 Update a Manager\n" +
                            "#5 Search a Manager\n" +
                            "#6 Add a new Manager\n" +
                            "#7 Sort all Manager by id\n" +
                            "#8 Log out this application ");
                    System.out.println("Enter your choice:");
                    flag = scan.nextInt();
                    switch (flag) {
                        case 1://Display
                            System.out.println("List of Manager:");
                            ManagerDB.Display();
                            break;
                        //Create customer
                        case 2:
                            System.out.println("Please create new customer...");
                            System.out.println("input new customer id:");
                            Customer1.setCustomerId(scan.nextInt());
                            System.out.println("input new customer password:");
                            Customer1.setCustomerPassword(scan.next());
                            System.out.println("input new customer firstname:");
                            Customer1.setCustomerFirstname(scan.next());
                            System.out.println("input new customer lastname:");
                            Customer1.setCustomerLastname(scan.next());
                            System.out.println("input new customer's day of birth:");
                            date1.setDay(scan.nextInt());
                            System.out.println("input new customer's month of birth:");
                            date1.setMonth(scan.nextInt());
                            System.out.println("input new customer's year of birth:");
                            date1.setYear(scan.nextInt());
                            Customer1.setManagerId(ManagerId);
                            Customer1.setCustomerBirthdate(date1);
                            CustomerDB.insert(Customer1);
                            break;

                        //delete
                        case 3:
                            System.out.println("Input a Customer Id to be deleted:");
                            int newId = scan.nextInt();
                            CustomerDB.Remove(newId,ManagerId);
                            System.out.print("The Manager " + newId + " is already removed/n");
                            break;
                        case 4:
                            //update
                            System.out.println("Input a Manager Id to be updated:");
                            int updateId=scan.nextInt();
                            System.out.println("Please enter your new password：");//if username exist and then verify the password
                            String new_pin=scan.next();
                            ManagerDB.Update(updateId,new_pin);
                            break;
                        case 5://Search
                            System.out.println("Please search your Manager Id：");//if username exist and then verify the password
                            SearchManagerId = scan.nextInt();
                            System.out.println(ManagerDB.Search(SearchManagerId).toString());
                            break;
                        case 6://Add
                            System.out.println("Please enter your Manager Id：");
                            Manager1.setManagerId(scan.nextInt());
                            System.out.println("Please enter your password：");
                            Manager1.setManagerPin(scan.next());
                            ManagerDB.insert(Manager1);
                        case 7://Sort
                            System.out.println("Sort by Manager Id：");
                            ManagerDB.Sort();
                            break;
                        default:
                            break;
                    }
                } while (flag != 8);
            }
                else if(choice==2){
                    System.out.println("Please enter your username：");
                    int CustomerId=scan.nextInt();
                    System.out.println("Please enter your password：");//if username exist and then verify the password
                    //Manager1.setManagerPin(scan.next());
                    do {
                        System.out.println("--------Customer Menu---------");
                        System.out.println("#1 view my Account\n" +
                                "#2 Create a new Account\n" +
                                "#3 Close an Account\n" +
                                "#4 Update a Customer profile\n" +
                                "#5 Search a Customer\n" +
                                "#6 Check Account List\n" +
                                "#7 Sort all Customer by id\n" +
                                "#8 Display all Customers \n" +
                                "#9 Log out  ");
                        System.out.println("Enter your choice:");
                        flag = scan.nextInt();
                        switch (flag) {
                            case 1://view my Account
                                System.out.println("List of Account:");
                                CustomerDB.CheckList(CustomerId);
                                break;
                            case 2://Create a new Account
                                System.out.println("Please create new Account...");
                                System.out.println("input new Account no:");
                                Account1.setAccountNo(scan.nextInt());
                                System.out.println("input new Account pin:");
                                Account1.setPin(scan.nextInt());
                                System.out.println("Select an Account type:1 Checking/n2 Saving/n3 Credit");
                                int ops=scan.nextInt();
                                if (ops==1){
                                    Account1.setAccountType(EnumAccountType.checking);
                                    System.out.println("input the checking no");
                                    Account1.setCkno(scan.nextInt());
                                }
                                else if(ops==2){
                                    Account1.setAccountType(EnumAccountType.saving);
                                    System.out.println("input the saving no");
                                    Account1.setSvno(scan.nextInt());
                                }
                                else if(ops==3){
                                    Account1.setAccountType(EnumAccountType.credit);
                                    System.out.println("input the Credit no");
                                    Account1.setCdno(scan.nextInt());
                                }
                                else {
                                    System.out.println("Please enter a valid number from 1-3");
                                }
                                System.out.println("input the balance:");
                                date1.setDay(scan.nextInt());
                                System.out.println("input Account opened-day:");
                                date1.setDay(scan.nextInt());
                                System.out.println("input Account opened-month:");
                                date1.setMonth(scan.nextInt());
                                System.out.println("input Account opened-year:");
                                date1.setYear(scan.nextInt());
                                Account1.setDate(date1);
                                Account1.setCid(CustomerId);
                                AccountDB.insert(Account1);
                                break;
                            case 3://Close an Account
                                System.out.println("Input an Account No to be deleted:");
                                int newNo = scan.nextInt();
                                CustomerDB.Remove(newNo,CustomerId);
                                System.out.print("The Account No " + newNo + " is already removed/n");
                                break;
                            case 4:
                                //update
                                System.out.println("Input a Customer Id to be updated:");
                                int updateId=scan.nextInt();

                                System.out.println("Please enter your new password：");//if username exist and then verify the password
                                String new_pin=scan.next();
                                //CustomerDB.Update(updateId,new_pin);
                                break;
                            //search
                            case 5:
                                System.out.println("Please search your Customer Id：");//if username exist and then verify the password
                                //SearchCustomerId = scan.nextInt();
                                //System.out.println(CustomerDB.Search(SearchCustomerId).toString());
                                break;
                            case 6:
                                System.out.println("Please enter your Customer Id：");
                                Customer1.setCustomerId(scan.nextInt());
                                System.out.println("Please enter your password：");
                               // Customer1.setCustomerPin(scan.next());
                                CustomerDB.insert(Customer1);
                            case 7:
                                System.out.println("Sort by Customer Id：");
                                CustomerDB.Sort();
                                break;
                            default:
                                break;
                        }
                    } while (flag != 9);
                }
                else
                {
                    System.out.println("Exit....");

                }
            }while(choice!=3);
        scan.close();
        System.out.println("Thank  you for using our application!");
    }
    }
