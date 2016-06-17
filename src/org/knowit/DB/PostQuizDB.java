package org.knowit.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.knowit.connection.MyConnection;

public class PostQuizDB 
{

	public void submitfill(String fillup,String answerf ){
		
		Connection connection=MyConnection.getConnection();
		
		
 try {
	PreparedStatement statement=connection.prepareStatement("insert into quiz values(?,?,?)");
	statement.setInt(1, getId());
	statement.setString(2, fillup);
	statement.setString(3, answerf);
	
	statement.executeUpdate();
	//connection.commit();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
public void submitmc(String mcq,String option1,String option2,String option3,String option4,String answermc){
		
		Connection connection=MyConnection.getConnection();
		
		
 try {
	PreparedStatement statement=connection.prepareStatement("insert into quiz1 values(?,?,?,?,?,?,?)");
	statement.setInt(1, getId());
	statement.setString(2, mcq);
	statement.setString(3, option1);
	statement.setString(4, option2);
	statement.setString(6, option3);
	statement.setString(5, option4);
	statement.setString(7, answermc);
	statement.executeUpdate();
	//connection.commit();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
public void submittf(String tf,String answer){
	
	Connection connection=MyConnection.getConnection();
	
	
try {
PreparedStatement statement=connection.prepareStatement("insert into quiz values(?,?,?)");
statement.setInt(1, getId());
statement.setString(2, tf);
statement.setString(3, answer);
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
			ResultSet result= statement.executeQuery("select max(id) from quiz()");
			
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
