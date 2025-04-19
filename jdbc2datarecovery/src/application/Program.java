package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbaccess.DBConnect;

public class Program {
	
	public static void main(String[] args) {
		
		Connection conn = null; //CRIA CONEXÃO
		Statement st = null; //PERMITE UM OBJETO STATEMENT, QUE SERVE COMO UMA PONTE ENTRE O JAVA E O SQL
		ResultSet rs= null;
		try {
			conn = DBConnect.connectDB();
			st = conn.createStatement(); //INSTANCIA UM OBJETO DO TIPO STATEMENT BASEADO NA CONEXÃO conn
			rs = st.executeQuery("select * from department"); //O RS VAI RECEBER O RESULTADO VINDO DA EXECUÇÃO DO CÓDIGO DO executequery
			
			//FORMA DE PERCORRER O RESULTSET, ENQUANTO rs TIVER next, PRINTA O ID E O NOME
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
		} catch (SQLException e) {
			//IMPRIME TODA A TRILHA DE CHAMADAS ATÉ O ERRO
			e.printStackTrace();
		} finally {
			DBConnect.closeResultset(rs);
			DBConnect.closeStatement(st);
			DBConnect.closeConnection();
		}
		
	}

}
