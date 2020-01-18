package bus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileHander {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList Readfromfile(ArrayList<Student> aList) throws IOException, ClassNotFoundException{
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.ser"));
		aList =(ArrayList) ois.readObject();
			return aList;
		}
 public static void Writetofile(ArrayList<Student> ArrayList) throws IOException, ClassNotFoundException{
		
		@SuppressWarnings("resource")
		ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream("Student.ser"));
		outStream.writeObject(ArrayList);
		//outStream.close();
		
	}
}
