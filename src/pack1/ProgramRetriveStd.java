package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProgramRetriveStd {
public static void main(String[] args) throws Exception {
	
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/abc";
		String userId="root";
		String passWord="root";
		String quary="SELECT * FROM STUDENT";
		
		
		Class.forName(driver);
		
		Connection connection=DriverManager.getConnection(url, userId, passWord);
		
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery(quary);
		
		while(resultSet.next()) {
			System.out.println("id is        : "+resultSet.getInt(1));
			System.out.println("Name is      : "+resultSet.getString(2));
			System.out.println("Address is   : "+resultSet.getString(3));
			System.out.println("Phone number : "+resultSet.getLong(4));
			System.out.println("Email id is  : "+resultSet.getString(5));
			System.out.println("Password is  : "+resultSet.getString(6));
			System.out.println("------------------------");
		}
		
		System.out.println("DATA RETRIVED SUCCESSFULLY");  
		
		connection.close();
		
	}
}

