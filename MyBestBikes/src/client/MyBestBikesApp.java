package client;

import java.util.*;

import bus.*;
import bus.Date;

public class MyBestBikesApp {

	public static void main(String[] args) {
		ArrayList<bike> myblist=new ArrayList<bike>();
		ArrayList<mountainbikes> mblist=new ArrayList<mountainbikes>();
		ArrayList<roadbikes> rblist=new ArrayList<roadbikes>();
		//bike b1=new bike();
		Date d1=new Date();
		mountainbikes mb1=new mountainbikes();
		roadbikes rb1=new roadbikes();
		Scanner scan1=new Scanner(System.in);
		System.out.println("\n\t Hello");
		String opt1;
		int tag,flag,input,opt,snum1;
		do {
			//main menu
			do {
			System.out.println("---------Main Menu---------");
			System.out.println("Add a new bike to the store  #1\nSearch a bike from the store by no #2\n"
					+ "Remove a bike from the store #3\n"
					+"Update bike info by the Sno #4\n Display bike by price in descending order #5\nDisplay mountain bikes  #6"
					+"Display road bikes  #6\nExit this application  #8");
			System.out.println("Enter your selection:");
			tag =scan1.nextInt();
			switch(tag) {
			case 1:
				System.out.println("---------Choice Select-----------");
				System.out.println("Mountain bike #1\nRoad Bike #2\nEnter your choice£º");
				flag=scan1.nextInt();
				if(flag==1) {
				mb1.setType(Enumtype.MountainBike);
				System.out.print("input a serial number: ");
				snum1=scan1.nextInt();
				if(!validator.SerialCheck(String.valueOf(snum1)/*,8*/))
				{
					System.out.println("serial number should be 8 digits");
					break;
				}
				else {
					mb1.setSno(Integer.valueOf(snum1));
				}
				System.out.print("input a brand: ");
				mb1.setBrand(scan1.next());
				System.out.print("input a model: ");
				mb1.setModel(scan1.next());
				System.out.print("input a speed: ");
				mb1.setSpeed(scan1.nextFloat());
				System.out.print("input a color(white 1,red 2, blue 3): ");
				input=scan1.nextInt();
				if(input==1){mb1.setColor(Enumcolor.white);}
				else if(input==2){mb1.setColor(Enumcolor.red);}
				else if(input==3){mb1.setColor(Enumcolor.blue);}
				System.out.print("input a price: ");
				mb1.setPrice(scan1.nextFloat());
				int day;
				do {
				System.out.print("input made day(1-31): ");
				day=scan1.nextInt();
				d1.setDay(day);
				}while(day<1||day>31);
				int month;
				do {
				System.out.print("input made month (1-12): ");
				month=scan1.nextInt();
				d1.setMonth(month);
				}while(month<1||month>12);
				System.out.print("input made year : ");
				d1.setYear(scan1.nextInt());
				mb1.setMadedate(d1);
				System.out.print("input a Suspension(front 1,rear 2,front and rear 3): ");
				opt=scan1.nextInt();
				if(opt==1){mb1.setSuspension(EnumSuspension.front);}
				else if(opt==2){mb1.setSuspension(EnumSuspension.rear);}
				else if(opt==3){mb1.setSuspension(EnumSuspension.frontandrear);}
				System.out.print("input a height: ");
				mb1.setHeight(scan1.nextFloat());
				myblist.add(mb1);
				}
				else if(flag==2) {
					rb1.setType(Enumtype.RoadBike);
					System.out.print("input a serial number: ");
					rb1.setSno(scan1.nextInt());
					System.out.print("input a brand: ");
					rb1.setBrand(scan1.next());
					System.out.print("input a model: ");
					rb1.setModel(scan1.next());
					System.out.print("input a speed: ");
					rb1.setSpeed(scan1.nextFloat());
					System.out.print("input a color(white 1,red 2, blue 3): ");
					input=scan1.nextInt();
					if(input==1){rb1.setColor(Enumcolor.white);}
					else if(input==2){rb1.setColor(Enumcolor.red);}
					else if(input==3){rb1.setColor(Enumcolor.blue);}
					System.out.print("input a price: ");
					rb1.setPrice(scan1.nextFloat());
					int day;
					do {
					System.out.print("input made day(1-31): ");
					day=scan1.nextInt();
					d1.setDay(day);
					}while(day<1||day>31);
					int month;
					do {
					System.out.print("input made month (1-12): ");
					month=scan1.nextInt();
					d1.setMonth(month);
					}while(month<1||month>12);
					System.out.print("input made year : ");
					d1.setYear(scan1.nextInt());
					System.out.print("input a seat height : ");
					d1.setYear(scan1.nextInt());
					rb1.setMadedate(d1);
					myblist.add(rb1);
					}
				
				break;
			case 2://search
				int sno;
				System.out.print("input the searchNo : ");
						sno=scan1.nextInt();
				   	 for (bike abike : myblist) {
				            if (abike.getSno() == sno) {
				            	System.out.print(abike.toString());
				            }
				        }
				   	break;
			case 3://remove
				System.out.println("Remove a bike from the store");
				System.out.print("input your searchNo: ");
				int newNo=scan1.nextInt();
				for (bike abike : myblist) {
				 if (abike.getSno() == newNo) {
					 
				   myblist.remove(abike);
		            	System.out.print("a bike already remove");
		            }
			}
				break;
			case 4:{//update
			
			}
			break;
			case 5://display by order
				 Collections.sort(myblist,new PricePredicate());
				 for(bike bk :myblist)
				 {
					 System.out.println(bk);
				 }
				 break;
			case 6://display mountain
			
				for(bike abike:myblist) {
					if(abike instanceof mountainbikes) {
						mblist.add((mountainbikes)abike);
					}
					
				}
				System.out.println(mblist);
				break;
			case 7://display road
				
				for(bike abike:myblist) {
					if(abike instanceof roadbikes ) {
						rblist.add((roadbikes )abike);
					}
					
				}
				System.out.println(rblist);
				
			break;
			default :
			}
			}while(tag!=8);
		System.out.println("Do you want to exit this application? Y/N");
		opt1=scan1.next();
		}while(opt1.equals("N")||opt1.equals("n"));
			
		scan1.close();
		System.out.println("Thank you for using our system!");
}
}