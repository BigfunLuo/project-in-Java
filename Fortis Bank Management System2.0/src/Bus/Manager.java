package Bus;

import Data.ManagerDB;


import java.sql.SQLException;

public class Manager {
		private int mangerId;
		private String password;
		public Manager() {
			
		}
       public Manager(int Id, String pd) {
			this.mangerId=Id;
			this.password=pd;
		}
       public int getManagerId(){
    	   return this.mangerId;
       }
       public void setManagerId(int id) {
    	   this.mangerId=id;
       }
       public String getManagerPin(){
    	   return this.password;
       }
       public void setManagerPin(String ps) {
    	   this.password=ps;
       }


	@Override
	public String toString() {
		return "Manager Id:"+this.mangerId + "| Password:" +this.password;
	}
	public static void insert(Manager m)  {
			Manager.insert(m);
	}
	public static void Display(){
			Manager.Display();
	}

	public static void Update(long key,String new_pin){
			Manager.Update(key,new_pin);
	}
	public static void Sort(){
			Manager.Sort();
		}
	public static Manager LoginMatch(long key, String ck_pin){
		return Manager.LoginMatch(key,ck_pin);
	}
    public static Boolean IsDuplicateId(long key) throws SQLException {
		    return ManagerDB.IsDuplicateId(key);
    }

}
