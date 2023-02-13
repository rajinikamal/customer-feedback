package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Review;

public class Dataacess {
	String url = "jdbc:mysql://localhost:3306/feedback";
	String user="root";
	String pass="root";
	Connection con=null;
//	Statement st=null;
//	PreparedStatement ps=null;

	public void insertUser(Review r1)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement("insert into user(uname,email,message,type,rating) values(?,?,?,?,?);");
			ps.setString(1, r1.getName());
			ps.setString(2, r1.getEmail());
			ps.setString(3, r1.getMessage());
			ps.setString(4, r1.getFeedbacktype());
			ps.setString(5, r1.getRatings());
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
