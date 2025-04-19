package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	
	public static Connection connect() {
		
		Connection conn = null;
		
		try {
			String urlString = "jdbc:mysql://localhost:3306/usersdatabase?user=root&password=1122003a&useSSL=false&allowPublicKeyRetrieval=true";
			conn = DriverManager.getConnection(urlString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void closeConnection() {
		try {
			if (connect() != null) {
				connect().close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeStatement(Statement st) {
		try {
			if (st != null) {
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
