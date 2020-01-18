package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import bus.Student;


public class College {
	public static Exception createTable(Connection currentConnection)throws SQLException
	{
			Statement currentStatement = null;		
	   String sqlString = 
	   "create table Student (id number not null ,"
	    +  "fn varchar2(50),ln varchar2(50),email varchar2(15),fee number,feepersession number,feepercredit number)" ;
				
			currentStatement  = currentConnection.createStatement();
				
				currentStatement.execute(sqlString);
				
				currentConnection.commit();			
				currentConnection.close();
				
				return null;
			
		}
	

	public static Exception alterTable(int id , Connection currentConnection) throws SQLException
	{
		Statement currentStatement = null;
		String sqlString = "alter  table Student add constraint pk_id primary key(id);"; 
		
			currentStatement  = currentConnection.createStatement();
			currentStatement.execute(sqlString);
			            currentConnection.commit();
						currentConnection.close();
						
			return null;		

	}	


		
	public static int insert(Student current) throws SQLException
	{
			int succes = -1;
		
		Connection myConnection = data.ConnectionDB.getConnectSQLDB();
		
		Statement myStatement = myConnection.createStatement();
					
		  String requete = "insert into Student (id, fn, ln, email,fee)"
				  
			               + "values ("+ current.getSid() + ",'" + current.getFn()+"','" + current.getLn()
				                       +  "','"+ current.getEmail()+ "',"+ current.getFirstfees()+")" ;	

	        succes = myStatement.executeUpdate(requete);	

	         myConnection.commit(); 	myConnection.close();

	  return succes;
	}

	public static int delete(Student current) throws SQLException
	{
			int succes = -1;
			
					Connection myConnection = data.ConnectionDB.getConnectSQLDB();
					
					Statement myStatement = myConnection.createStatement();
								
					String requete = "delete from Student where id=" + current.getSid() ;	
			
			succes = myStatement.executeUpdate(requete);	
			
			myConnection.commit(); 	myConnection.close();
						
		return succes;
	}

	public static int delete(int key)throws SQLException
	{
			int succes = -1;
			
					Connection myConnection = data.ConnectionDB.getConnectSQLDB();
					
					Statement myStatement = myConnection.createStatement();
								
					String requete = "delete from Student where id=" + key ;	
			
			succes = myStatement.executeUpdate(requete);	
			
			myConnection.commit(); 	myConnection.close();
				
		return succes;
	}

	 public static Student search(int key) throws SQLException
	 {

		Connection myConnection = data.ConnectionDB.getConnectSQLDB();
		
		Statement myStatement = myConnection.createStatement();
		
		String request = "SELECT * FROM Student WHERE ID = " +key + " ;";
		
		ResultSet myResultSet = myStatement.executeQuery(request);
		
		 Student current = new Student(myResultSet.getInt(1), myResultSet.getString(2),
				 myResultSet.getString(3), myResultSet.getString(4),myResultSet.getFloat(5));
		  
		 return current;
		 
	 }

	public static HashMap<Integer, Student>  getList() throws SQLException
	{
		
		HashMap<Integer,Student>  maListe = new  HashMap<Integer, Student>();

		Connection myConnection = data.ConnectionDB.getConnectSQLDB();
		 String query = "select * from Student";
		 Statement myStatement;
	     ResultSet resultSet;	
	     
	        myStatement = myConnection.createStatement();
	        resultSet  =  myStatement.executeQuery(query);
	        
		String fn,ln,mail; 	//float fee,feeps; 
		int sid;float fee;
		Student current ;
	        while(resultSet.next()) 
	        {
	               sid = resultSet.getInt(1);
	               fn = resultSet.getString(2);
	               ln = resultSet.getString(3);
	               mail=resultSet.getString(4);
	               fee=resultSet.getFloat(5);
	               current = new Student(sid, fn, ln,mail,fee);

	            maListe.put(   ((Student)current).getSid(),current);

	        }
			myConnection.close();	
		 		 
		return maListe;
	}
}
