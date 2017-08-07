package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BD {

	public static Connection dbConnection = null;
	public static final String ipAdd= "localhost";
	public static final String port= "3306";
	//public static final String dbname="cnam";
	public static final String dbname="distr";
	public static final String username="root";
	public static final String userpassword="";
	//public static final String tablename="tablecin";
	public static final String tablename="bs";
	public static final String datacollumnName="montant";
	public static final String idcolumnName="cin";

	public static Connection getConnection()throws Exception
	{
		if(dbConnection !=null)
		{
			return dbConnection;
		}
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url =String.format("jdbc:mysql://%s:%s/%s",ipAdd,port,dbname);
		Class.forName(driver);
		dbConnection =DriverManager.getConnection(url, username, userpassword);
		System.out.println("connected");
		return dbConnection;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public static String get(String cin)throws Exception
	{
	try
	{
		Connection con=getConnection();
		String query=String.format("select %s from %s where %s=%s", datacollumnName,tablename,idcolumnName,cin);
		System.out.println(query);
		PreparedStatement statement= con.prepareStatement(query);
		ResultSet result =statement.executeQuery();
		String array=null;
		while(result.next())
		{
			array=result.getString(datacollumnName);
			
		}
		return array;
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return null;
		
	}
	
	}
	
	

