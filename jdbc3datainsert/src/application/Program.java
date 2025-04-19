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
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", //PLECEHOLDER, LUGAR ONDE DEPOIS O VALOR VAI SER COLOCADO PERMITIDO PELO PREPARED STATEMENT (5 valores)
					Statement.RETURN_GENERATED_KEYS); //RETORNA A CHAVE DO OBJETO RECEM CRIADO NA BASE DE DADOS PARA SER PEGO PELA getGeneratedKeys
			pst.setString(1, "Pessoa Teste 3"); //ÍNDICE DO "?" E O VALOR INSERIDO
			pst.setString(2, "pessoateste3@hotmail.com");
			pst.setDate(3, new java.sql.Date(sdf.parse("01/01/2000").getTime()));
			pst.setDouble(4, 8000);
			pst.setInt(5, 4);
			
			int rowsAffected = pst.executeUpdate();


			if (rowsAffected> 0) {
				ResultSet rs = pst.getGeneratedKeys(); //PEGA A KEY ID GERADA E RETORNA UM TIPO ResultSet, POR ISSO DECLARAMOS COMO RS
				while(rs.next()) {
					int id = rs.getInt(1); //PEGANDO O VALOR DO ID NA COLUNA 1
					System.out.println("Done! ID = " + id);
				}
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DBConnect.closeStatement(pst);
			DBConnect.closeConnection();
		}
		
	}

}
