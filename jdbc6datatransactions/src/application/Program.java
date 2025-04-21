package application;import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;


import dbaccess.DBConnect;
import exceptions.DbException;
import exceptions.DbIntegrityException;


public class Program {
	
	public static void main(String[] args){
		/* TRANSAÇÃO -> OU EXECUTA TUDO OU NÃO EXECUTA NADA
		 * setAutoCommit(false) -> se for true, cada transação isolada vai valer / se for false -> só efetiva a transação depois de confirmar
		 * commit() -> confirmar transação
 		 * rollback() -> volta o banco no estado que estava antes de começar
		 */
		
		Connection conn = null;
		Statement st = null;
		try {
			conn = DBConnect.connectDB();
			
			st = conn.createStatement();
			
			conn.setAutoCommit(false);
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2 WHERE DepartmentId = 1");
			
			int n = 0;
			if (n < 2) {
				throw new SQLException();
			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 2 WHERE DepartmentId = 2");
			
			conn.commit();
			
			System.out.println(rows1);
			System.out.println(rows2);
			
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("Transaction rolled back! " + e.getMessage());
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBConnect.closeStatement(st);
			DBConnect.closeConnection();
		}
		
	}

}
