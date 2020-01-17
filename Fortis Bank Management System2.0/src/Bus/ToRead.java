package Bus;

import java.io.*;
import java.util.ArrayList;

public class ToRead {
    public static ArrayList<Manager> ReadfromManagerfile(File FileName) throws IOException, ClassNotFoundException{
        @SuppressWarnings("resource")
        ObjectInputStream inStream=new ObjectInputStream(new FileInputStream(FileName));
        ArrayList<Manager> aList = (ArrayList<Manager>)inStream.readObject();
        //inStream.close();
        return aList;

    }
    public static ArrayList<Customer> ReadCustomerfromfile(File FileName) throws IOException, ClassNotFoundException{
        @SuppressWarnings("resource")
        ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(FileName));
        ArrayList<Customer> aList = (ArrayList<Customer>)inStream.readObject();
        //inStream.close();
        return aList;
    }
}
