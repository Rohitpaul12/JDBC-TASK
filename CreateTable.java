package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try 
		{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
			PreparedStatement st=con.prepareStatement("create table product(id int,name varchar(10),price int ,quantity int)");
			 int count=st.executeUpdate();
			con.close();
			System.out.println(count+" Table Created....");
			
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
