package dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane; 
public class DBConnect {
	
	public static Connection connectDB() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/coursejdbc?user=root&password=1122003a&useSSL=false&allowPublicKeyRetrieval=true";
			conn = DriverManager.getConnection(url);
			
		} 
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "DBConnect error: " + e.getMessage());
		}
		
		return conn;
	}
	
	public static void closeConnection() {
		if (connectDB() != null) {
			try {
				connectDB().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeStatement (Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeResultset (ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
