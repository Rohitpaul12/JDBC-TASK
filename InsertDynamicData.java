package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {

	public static void main(String[] args) {
	
		try 
		{
		   Scanner scan=new Scanner(System.in);
		   System.out.println("Enter Product ID:");
		   int id=scan.nextInt();
		   System.out.println("Enter Product Name:");
		   String name=scan.next();
		   System.out.println("Enter Product Price:");
		   double price=scan.nextDouble();
		   System.out.println("Enter Product Quantity:");
		   int quantity=scan.nextInt();
		   
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
		   String insertquery="insert into product values(?,?,?,?)";
		   PreparedStatement stmt=con.prepareStatement(insertquery);
		   stmt.setInt(1, id);
		   stmt.setString(2, name);
		   stmt.setDouble(3, price);
		   stmt.setInt(4, quantity);
		   int count=stmt.executeUpdate();
		   con.close();
		   System.out.println(count +"  Rows Inserted");
		   
		   
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		

	}

}
