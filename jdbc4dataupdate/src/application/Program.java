package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

import dbaccess.DBConnect;


public class Program {
	
	public static void main(String[] args){
		Connection conn = null;
		PreparedStatement pst = null;
		
		try {
			conn = DBConnect.connectDB();
			pst = conn.prepareStatement(
					"UPDATE seller " //ATUALIZE A TABELA seller
					+ "SET BaseSalary = BaseSalary + ? " //SETE O BaseSalary COMO ELE MESMO + UM VALOR QUE VOU COLOCAR
					+ "WHERE " //SEMPRE!! UPDATE SEM WHERE FODE O BANCO DE DADOS INTEIRO
					+ "(DepartmentId = ?)" //WHERE O DepartmentId FOR IGUAL A UM VALOR QUE IREI COLOCAR
					);
			
			pst.setDouble(1, 200.0); //NO PRIMEIRO ? AUMENTA 200 NO SALÁRIO
			pst.setInt(2, 2); //NO SEGUNDO ? LOCALIZA O ID COMO 2, PARA RESTRINGIR ÀS PESSOAS DO DEPARTAMENTO 2
			
			int rowsAffected = pst.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnect.closeStatement(pst);
			DBConnect.closeConnection();
		}
	}
}
