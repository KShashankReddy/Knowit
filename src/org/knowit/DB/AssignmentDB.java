package org.knowit.DB;

import org.knowit.connection.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class AssignmentDB {
	
	public void addAssignment(String comments,String desc){
		
		Connection connection=MyConnection.getConnection();
		
		
 try {
	PreparedStatement statement=connection.prepareStatement("insert into assignment values(?,?,?,?)");
	statement.setInt(1, getId());
	statement.setString(2, desc);
	statement.setString(3, "tets");
	statement.setString(4, comments);
	statement.executeUpdate();
	//connection.commit();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	
	
	public int getId(){
		Connection connection=MyConnection.getConnection();
		int primarykey=0;
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet result= statement.executeQuery("select max(id) from assignment");
			
			while(result.next()){
				primarykey=result.getInt(1);
				primarykey=primarykey+1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return primarykey;
	
	}

}
