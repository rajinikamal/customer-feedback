package office;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Review;

public class admindao {
	String url = "jdbc:mysql://localhost:3306/feedback";
	String user="root";
	String pass="root";
	Connection con=null;
//	

	public String checkLogin(Admin a)
	
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			Statement s = con.createStatement();
			ResultSet rs= s.executeQuery("select * from admin");
			while(rs.next())
			{
				String duser = rs.getString("user");
				String dpass = rs.getString("pass");
				if(duser.equals(a.getUser()) && dpass.equals(a.getPass()))
				{
					return "success";
				}
				
			}
			
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failure";
		
		
	}
}
