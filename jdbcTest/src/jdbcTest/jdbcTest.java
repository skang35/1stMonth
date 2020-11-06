package jdbcTest;
	    
import java.sql.*;
//import org.apache.log4j.Logger;

import com.sun.jdi.connect.spi.Connection;


public class jdbcTest {

	    	//static Logger logger = Logger.getLogger(dbconn.class);
	    	static final String JDBC_DRIVER1 = "com.mysql.jdbc.Driver";
	    	static final String DB_URL = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";
  	    	static final String USERNAME = "root";
	    	static final String PASSWORD = "102938475Q6";

	    	

	    	public static void main(String[] args) throws SQLException {

	    		Connection conn = null;

	    		Statement stmt = null;

	    		ResultSet rs = null;

	    		

	    		try {

	    			Class.forName(JDBC_DRIVER1);

	    			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

	    			stmt = conn.createStatement();

	    			

	    			String sql1 = "select * from professor";

	    			rs = stmt.executeQuery(sql1);

	    			while(rs.next()) {

	    				String no = rs.getString("belong");

	    				String name = rs.getString("name");

	    				System.out.println("belong = "+belong+" , "+"name = "+name);

	    			}

	    		}catch(SQLException se1) {

	    			se1.printStackTrace();

	    		}catch(Exception ex) {

	    			ex.printStackTrace();

	    		}finally {

	    			rs.close();

	    			stmt.close();

	    			conn.close();

	    		}

	    	}
	
	static Logger logger = Logger.getLogger(jdbcTest.class);
	
	static final String JDBC_DRIVER

}
