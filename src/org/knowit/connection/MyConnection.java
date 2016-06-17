package org.knowit.connection;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Deepak
 */

public class MyConnection

{

	static Connection con;

	public static Connection getConnection()

	{

		try

		{
			if (con == null)

			{
				Class.forName("com.mysql.jdbc.Driver");

				con = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/knowit?user=root&password=password");

			}
		} catch (Exception ex)

		{
			ex.printStackTrace();

		}
		return con;

	}

	public static void CloseConnection()

	{
		if (con != null)

		{
			try

			{
				con.close();

				con = null;
			}

			catch (SQLException ex)

			{
				ex.printStackTrace();

			}

		}

	}

}
