package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import DB.DBconnect;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBconnect.connect();
			System.out.print("How much users you will put into the database? ");
			int n = sc.nextInt();
			
			for (int i = 1; i<=n; i++) {
				ps = conn.prepareStatement(
						"INSERT INTO users_log" +
						"(email, age, logintime, name)" +
						"VALUES " +
						"(?, ?, ?, ?)"
						);
				
				sc.nextLine();
				System.out.printf("Enter the %d user name: ", i);
				String name = sc.nextLine();
				System.out.printf("Enter the %d user email: ", i);
				String email = sc.nextLine();
				System.out.printf("Enter the %d user age: ", i);
				int age = sc.nextInt();
				LocalDateTime logDate = LocalDateTime.now();
				
				ps.setString(1, email);
				ps.setInt(2, age);
				ps.setTimestamp(3, Timestamp.valueOf(logDate));
				ps.setString(4, name);
				
				ps.executeUpdate();
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBconnect.closeResultSet(rs);
			DBconnect.closeStatement(ps);
			DBconnect.closeConnection();
		}
		
	}
}
