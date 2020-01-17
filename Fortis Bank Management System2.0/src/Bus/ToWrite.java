package Bus;

import java.io.*;
import java.util.ArrayList;

public class ToWrite {
    public static void WritetoManagerfile(ArrayList<Manager> ArrayList,String FileName) throws IOException, ClassNotFoundException{

        @SuppressWarnings("resource")
        //ArrayList<Manager> myList=new ArrayList<Manager>();
        ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(FileName));
        outStream.writeObject(ArrayList);
        outStream.close();

    }
    public static void WritetoCustomerfile(ArrayList<Customer> ArrayList,String FileName) throws IOException, ClassNotFoundException{
        @SuppressWarnings("resource")
        //ArrayList<Customer> ArrayList=new ArrayList<Customer>();
        ObjectOutputStream outStream=new ObjectOutputStream(new FileOutputStream(FileName));
        outStream.writeObject(ArrayList);
        outStream.close();

    }
}
