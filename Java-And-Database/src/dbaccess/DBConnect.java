package dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane; 
public class DBConnect {
	
	public Connection connectDB() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/usersdb?user=root&password=1122003a&useSSL=false&allowPublicKeyRetrieval=true";
			conn = DriverManager.getConnection(url); //Verifica um driverJDBC compatível e conecta à base de dados da url
			
		} 
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "DBConnect error: " + e.getMessage());
		}
		
		return conn;
	}
	
}
