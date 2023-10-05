package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectCountData {

	public static void main(String[] args) {


		try
		{
			
			Class.forName(DBPropertiesUtil.getProperty("driver"));
			Connection con=DriverManager.getConnection(DBPropertiesUtil.getProperty("url"), DBPropertiesUtil.getProperty("user"), DBPropertiesUtil.getProperty("password"));
			PreparedStatement stmt=con.prepareStatement("select name,count(quantity) as total from product group by name");
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString("name")+"\t");
			    System.out.print(rs.getInt("total")+"\n");
	
			}
			con.close();
			
		}
		catch(Exception ex)
		{
		ex.printStackTrace();
		}

	}

}
