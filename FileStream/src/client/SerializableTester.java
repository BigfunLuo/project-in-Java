package client;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bus.Person;

public class SerializableTester {

	@SuppressWarnings("unchecked")
	public static void main(String x[]) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		ArrayList<Person> listFromConsole=new ArrayList<Person>();
		listFromConsole.add(new Person(1000,"lory"));
		listFromConsole.add(new Person(1001,"zara"));
		ArrayList<Person> listFromFile=new ArrayList<Person>();
		
		//to write
		FileOutputStream outFile=new FileOutputStream("personal.ser");
		ObjectOutputStream outStream=new ObjectOutputStream(outFile);
		outStream.writeObject(listFromConsole);
		outStream.close();
		//to read
		FileInputStream inFile=new FileInputStream("personal.ser");
		ObjectInputStream inStream=new ObjectInputStream(inFile);
		listFromFile=(ArrayList<Person>)inStream.readObject();
		for(Person element : listFromFile)
		{
			System.out.println(element);
		}
		inStream.close();
	}

}
