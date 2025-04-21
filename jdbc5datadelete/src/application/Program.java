package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import dbaccess.DBConnect;


public class Program {
	
	public static void main(String[] args){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null; //CRIA CONEXÃO
		PreparedStatement pst = null;
		try {
			conn = DBConnect.connectDB();
			
			pst = conn.prepareStatement(
					"DELETE FROM department " 
					+ "WHERE "
					+ "Id = ?"
					);
			
			pst.setInt(1, 5);
			
			int rowsAffected = pst.executeUpdate();
			System.out.println("Done! Rows Affected: " + rowsAffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnect.closeStatement(pst);
			DBConnect.closeConnection();
		}
		
	}

}
