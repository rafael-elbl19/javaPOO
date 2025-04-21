package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


import dbaccess.DBConnect;
import exceptions.DbIntegrityException;


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
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DBConnect.closeStatement(pst);
			DBConnect.closeConnection();
		}
		
	}

}
