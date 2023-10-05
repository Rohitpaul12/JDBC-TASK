package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDynamicDetails {

	public static void main(String[] args) {
		
		
		try 
		{
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter new Product Quantity:");
			int quantity= scan.nextInt();
			System.out.println("Enter id which you want to Updated:");
			int id=scan.nextInt();
		
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
			String updatequery="update product set quantity=? where id=?";
			PreparedStatement stmt=con.prepareStatement(updatequery);
			stmt.setInt(1, quantity);
			stmt.setInt(2, id);
			int count= stmt.executeUpdate();
			con.close();
			System.out.println(count + "  row Update");
			
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
