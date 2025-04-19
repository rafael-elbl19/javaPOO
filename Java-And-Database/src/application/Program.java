package application;

import java.sql.Connection;

import dbaccess.DBConnect;

public class Program {
	
	public static void main(String[] args) {
		
		DBConnect DB = new DBConnect();
		Connection connection = DB.connectDB();
		
		if (connection != null) {
			System.out.println("Conexão bem sucedida!");
		} else {
			System.out.println("Falha na conexão.");
		}
		
	}

}
