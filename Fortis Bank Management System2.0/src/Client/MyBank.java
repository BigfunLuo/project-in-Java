package Client;

import Bus.*;
//import Bus.Date;


//import java.io.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class MyBank {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		/*ArrayList<Customer> myCustomerList = new ArrayList<Customer>();
		ArrayList<Account> myAccountList = new ArrayList<Account>();
		ArrayList<Transaction> myTransationList = new ArrayList<Transaction>();
		ArrayList<Manager> myManagerList = new ArrayList<Manager>();
		Date date1 = new Date();*/
		//Manager Manager1 = new Manager();
		/*Customer Customer1 = new Customer();
		int option;
		String SearchManagerId;
		int choice,flag;*/
		//Scanner scan = new Scanner(System.in);
		/*do {
			System.out.println("--------Bank Application----------");
			System.out.println("login in:\n#1 Manger\n#2 Customer\n#3 Exit");
			System.out.println("Enter your choice:");
			choice = scan.nextInt();
			if (choice == 1) {
				*//*System.out.println("Please enter your username：");
				//String ManagerId=scan.next();
				Manager1.setManagerId(scan.next());
				System.out.println("Please enter your password：");//if username exist and then verify the password
				Manager1.setManagerPin(scan.next());
				System.out.println("Please enter your CustomerId：");
				//String ManagerId=scan.next();
				Manager1.setCid(scan.next());
				ArrayList<Manager> myManagerConsole = new ArrayList<Manager>();
				myManagerConsole.add(Manager1);
				ToWrite.WritetoManagerfile(myManagerConsole,"Manager.ser");*/
		        File pathfile=new File("Manager.ser");
				ArrayList<Manager> myManagerfile=new ArrayList<Manager>();
				myManagerfile= ToRead.ReadfromManagerfile(pathfile);
				for(Manager element : myManagerfile)
				{
					System.out.println(element);
				}
				/*do {
					System.out.println("--------Manager Menu---------");
					System.out.println("#1 Display all Customer belong to this Manager\n#2 Create a new Customer\n#3 Delete a Manager\n" +
							"#4 Update a Manager\n#5 Search a Manager\n#6 Exit this application ");
					System.out.println("Enter your choice:");
					flag = scan.nextInt();
					//String pathandname="C:\\Users\\vivian\\Desktop\\java\\Fortis Bank Management System2.0\\Manager.txt";
					//myCustomerList =  ToRead.ReadCustomerfromfile(myCustomerList,pathandname);
					//myManagerList =  ToRead.ReadfromManagerfile(myManagerList, pathandname);
					switch (flag) {
						case 1:
                            System.out.println("Please enter your Manager username：");//if username exist and then verify the password
                            SearchManagerId = scan.next();
					for (Manager amanager :myManagerList) {
						if (amanager.getManagerId().equals(SearchManagerId)) {
							System.out.print(amanager.toString1());
						}
					}
							break;
						//Create
						case 2:
							System.out.println("Please create new customer...");
							System.out.println("input new customer id:");
							Customer1.setCustomerId(scan.next());
							System.out.println("input new customer password:");
							Customer1.setCustomerPassword(scan.next());
							System.out.println("input new student firstname:");
							Customer1.setCustomerFirstname(scan.next());
							System.out.println("input new customer lastname:");
							Customer1.setCustomerLastname(scan.next());
							System.out.println("input new customer's day of birth:");
							date1.setDay(scan.nextInt());
							System.out.println("input new customer's month of birth:");
							date1.setMonth(scan.nextInt());
							System.out.println("input new customer's year of birth:");
							date1.setYear(scan.nextInt());
							System.out.println("input new account no:");
							Customer1.setAccountno(scan.nextInt());
							Customer1.setCustomerBirthdate(date1);
							myCustomerList.add(Customer1);
							myManagerList.add(Manager1);
							break;

						//delete
						case 3:
							System.out.println("Input a Manager Id to be deleted:");
							String newId = scan.next();
							for (Manager aManager : myManagerList) {
								if (aManager.getManagerId() == newId) {

									myManagerList.remove(aManager);
									System.out.print("The Manager " + newId + " is already removed");
								}
							}
							System.out.println("The Manager is removed");
							break;
						case 4:
							//update
							System.out.println("Input a Manager Id to be updated:");
							Manager1.setManagerId(scan.next());//search
							do {
								System.out.println("---------Menu to update-------");
								System.out.println("Modify Manager Username #1/nModify Manager Password #2");
								option = scan.nextInt();
								if (option == 1) {
									System.out.println("Please enter your new username：");//if username exist and then verify the password
									Manager1.setManagerId(scan.next());
									myManagerList.add(Manager1);
								} else if (option == 2) {
									System.out.println("Please enter your new password：");//if username exist and then verify the password
									Manager1.setManagerPin(scan.next());
									myManagerList.add(Manager1);
								} else {
									System.out.println("please enter valid option from 1-3");
								}
							} while (option != 3);
							break;
						//search
						case 5:
							System.out.println("Please enter your new username：");//if username exist and then verify the password
							SearchManagerId = scan.next();
							for (Manager aManger : myManagerList) {
								if (aManger.getManagerId() == SearchManagerId) {
									System.out.print(aManger.toString());
								}
							}
							break;
						default:
							break;
					}
				} while (flag != 6);
			}
			else if(choice==2){
				System.out.println("Please enter your username：");
				//String ManagerId=scan.next();
				Manager1.setManagerId(scan.next());
				System.out.println("Please enter your password：");//if username exist and then verify the password
				Manager1.setManagerPin(scan.next());
			}
			else
			{
				System.out.println("Please Enter a vaild Choice from 1 to 3....");

			}

			/*File ManagerFile=new File("C:\\Users\\vivian\\Desktop\\java\\Fortis Bank Management System2.0\\Manager.txt")
			if(ManagerFile.exists()){

				myManagerList =  ToRead.ReadfromManagerfile(myManagerList, "C:\\Users\\vivian\\Desktop\\java\\Fortis Bank Management System2.0\\Manager.txt");

			}
			else {
				System.out.println("The File is not exist!..");
			}


		}while(choice!=3);*/
		//scan.close();
	}
	}

