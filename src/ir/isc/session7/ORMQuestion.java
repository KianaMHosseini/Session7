package ir.isc.session7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ORMQuestion {

		    // JDBC URL, username and password of H2 server
		    private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
		    private static final String USER = "sa"; // Default username
		    private static final String PASSWORD = ""; // Default password (empty)

		    /**
		     * @param args
		     * @throws SQLException
		     */
		    public static void main(String[] args) throws SQLException {
		    	String CountryID= "US";
		    	String sql = """
		    			SELECT LOCATION_ID,DEPARTMENT_NAME, LOCATIONS.COUNTRY_ID
		    			FROM   LOCATIONS,DEPARTMENTS
		    			WHERE 
		    				   LOCATIONS.LOCATION_ID=DEPARTMENTS.LOCATION_ID 
		    				   AND
		    				   COUNTRY_ID = ?
		    			""";
		    	List <Departments> department1 = new ArrayList<>();
		    
		    try (
	                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        		PreparedStatement preparedStatement = connection.prepareStatement(sql);                
	            ) {
	                System.out.println("Connected to the H2 database successfully!"); 
	                preparedStatement.setString(1, CountryID);
	                
	                try(ResultSet resultSet = preparedStatement.executeQuery()){
		                // Process the result set
		                while (resultSet.next()) {
	                	
		                	Departments department = new Departments();
		                	department.setId( resultSet.getString("DEPARTMENT_ID") );
		                	department.setName(resultSet.getString("DEPARTMENT_NAME") );
		                	
		                	Locations location = new Locations();
		                	location.setId(resultSet.getString("COUNTRY_ID"));
		                	department1.add(department);
	                
		                }        
		                department1.forEach( System.out::println );
}}
	}
		    }
