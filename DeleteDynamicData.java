package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteDynamicData {

	public static void main(String[] args) {


		try 
		{
		
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter product Id Which You Want To Delete Details:");
			int id=scan.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
			String deletequery="delete from product where id=?";
		    PreparedStatement  stmt=con.prepareStatement(deletequery);
		    stmt.setInt(1, id);
		   int count= stmt.executeUpdate();
		    con.close();
		   System.out.println(count +" Row Deleted");
						
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
