package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQueryOperation {

	public static void main(String[] args) {
		// Aggregate function task 1.max 2.min 3.avg 4.count 5.sum
		
		
		try
		{   
			String query1,query2,query3,query4,query5;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1210");
		    query1="select max(salary) from emp";
			PreparedStatement stmt=con.prepareStatement(query1);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				System.out.println("maximum value is:"+rs.getInt("max(salary)"));
			}
			query2="select min(salary) from emp";
			PreparedStatement stmt1=con.prepareStatement(query2);
			ResultSet rs1=stmt1.executeQuery();
			while(rs1.next()) 
			{
				System.out.println("minimum value is:"+rs1.getInt("min(salary)"));
			}
			query3="select avg(salary) as avrage from emp";
			PreparedStatement stmt2=con.prepareStatement(query3);
			ResultSet rs2=stmt2.executeQuery();
			while(rs2.next()) 
			{
				System.out.println("avrage value is:"+rs2.getInt("avrage"));
			}
			query4="select sum(salary) as totalsum from emp";
			PreparedStatement stmt3=con.prepareStatement(query4);
			ResultSet rs3=stmt3.executeQuery();
			while(rs3.next()) 
			{
				System.out.println("total sum is:"+rs3.getInt("totalsum"));
			}
			query5="select count(salary) as total from emp";
			PreparedStatement stmt4=con.prepareStatement(query5);
			ResultSet rs4=stmt4.executeQuery();
			while(rs4.next())
			{
				System.out.println("total count is:"+rs4.getInt("total"));
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
