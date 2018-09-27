package com.wipro.topgear.Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	Connection conn;
    public static void main( String[] args ) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
       // System.out.println( "Hello World!" );
    	App obj=new App();
    	obj.connectionDB();
    	obj.getdetails();
       }
    public void connectionDB() throws SQLException,ClassNotFoundException, InstantiationException, IllegalAccessException
    {
    	 //String dburl="jdbc.derby:myDB;create=true";
        String dburl = "jdbc:derby:myDB;create=true";
        
    	//String driver="org.apache.derby.jdbc.EmbeddedDriver";
        // Class.forName(driver);
    	Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    	  conn = DriverManager.getConnection(dburl); 
          
    }
    public void getdetails() throws SQLException
    {
    	Statement stmt=conn.createStatement(); 
    	System.out.println("Creating table");
    	
    	String sql = "CREATE table USERS(id INTEGER ,name VARCHAR(25));";
        stmt.execute(sql);
        
        System.out.println("inserting data");
    	
        String insert1="insert into USERS  values(1,'madhu')";
        String insert2="insert into USERS  values(2,'madhukar')";
        String insert3="insert into USERS  values(3,'madhukar sadula')";
        stmt.execute(insert1);
        stmt.execute(insert2);
        stmt.execute(insert3);
        String selectquery="select * from USERS";
      ResultSet rs=stmt.executeQuery(selectquery);  
    	//String insert1="";
      
      System.out.println("getting data from table");
    	while(rs.next())  
    	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
    	conn.close();  
    }
}
