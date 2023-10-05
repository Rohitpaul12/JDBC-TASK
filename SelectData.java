package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class SelectData {

	public static void main(String[] args) {

		
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
			PreparedStatement stmt=con.prepareStatement("select * from  product");
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
			 System.out.print(rs.getInt("id")+"\t");
			 System.out.print(rs.getString("name")+"\t");
			 System.out.print(rs.getInt("price")+"\t");
			 System.out.print(rs.getInt("quantity")+"\n");
				
			}
			con.close();
			
		}
		catch(Exception ex)
		{
		ex.printStackTrace();
		}

	}

}
