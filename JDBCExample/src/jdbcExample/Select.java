package jdbcExample;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {

	//Load the Driver
	Class.forName("oracle.jdbc.oracleDriver");
	//Create the Connection
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@thin:@1521:XE","System", "n=manager");
	//Create the Statement3
	Statement stmt = con.createStatement();
	//process the Result
	ResultSet rs = stmt.executeQuery("Select * form emp");
	while(rs.next()){
		System.out.println(rs.getInt(1)+ " " + rs.getName(2));
	}
	con.close();

	}

}
