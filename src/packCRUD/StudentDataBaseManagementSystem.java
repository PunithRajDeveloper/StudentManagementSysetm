package packCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDataBaseManagementSystem {
	
	Connection connection=new ConnectionObject().getConnectiponObject();
	
    public void saveStudentData(int id,String name,String address,
    		long num,String email,String password) {
    	
    	try {
			String query="INSERT INTO STUDENT VALUE(?,?,?,?,?,?)";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3,address);
			preparedStatement.setLong(4, num);
			preparedStatement.setString(5, email);
			preparedStatement.setString(6, password);

			preparedStatement.execute();

			connection.close();
			System.out.println("DATA SAVED");

		} catch ( Exception e) {
			e.printStackTrace();
		}
    	
		
	}
    
    public void upDateStudentData(int id,String address) {
    	
    	try {
			String query="UPDATE STUDENT SET NAME = ? WHERE id=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(3,address);
			

			preparedStatement.execute();

			connection.close();
			System.out.println("DATA upDated");

		} catch ( SQLException e) {
			e.printStackTrace();
		}
    	
	}
    
    public void deleteStudentData(int id) {
    	
    	try {
			String query="DELETE FROM STUDENT WHERE id = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
			connection.close();
			System.out.println("DATA deleted successfully");

		} catch ( Exception e) {
			e.printStackTrace();
		}
    	
		
	}
    
    public void readStudentData(int id) {
    	
    	try {
			String query="SELECT * FROM STUDENT WHERE id=?";
			Statement statement=connection.createStatement();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
		    preparedStatement.setInt(1, id);
		    ResultSet resultSet=preparedStatement.executeQuery();
		
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("------------------------");
			}
			
			System.out.println("DATA RETRIVED SUCCESSFULLY");
			
			connection.close();

		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
    
    public void getCompletStudentData() {
    	
    	try {
			String query="SELECT * FROM STUDENT ";
			Statement statement=connection.createStatement();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
		    ResultSet resultSet=preparedStatement.executeQuery();
		
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getLong(4));
				System.out.println(resultSet.getString(5));
				System.out.println(resultSet.getString(6));
				System.out.println("------------------------");
			}
			
			System.out.println("DATA RETRIVED SUCCESSFULLY");
			
			connection.close();

		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
