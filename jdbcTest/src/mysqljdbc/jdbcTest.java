package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.List;

public class jdbcTest {
		
		static final String JDBC_DRIVER1 = "com.mysql.jdbc.Driver";
    	static final String DB_URL = "jdbc:mysql://localhost:3306/study?serverTimezone=UTC";
	    static final String USERNAME = "user2";
    	static final String PASSWORD = "102938475Q6";

    	public static void main(String[] args) {
    		
    		List<Professor> members;
    		members = new ArrayList<Professor>();
    		
    		
    		
    	try {
    		Class.forName(JDBC_DRIVER1);
    	} catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	
    	try {
    		Connection conn = DriverManager.getConnection(DB_URL);
    		Statement stmt = conn.createStatement();
    		String sql = "select * from professor";
    		
    		ResultSet rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			String belong = rs.getString("belong");
    			String name = rs.getString("name");
    			String phone = rs.getString("phone");
    			
    			Professor professor = new Professor(name, belong, phone);
    			members.add(professor);
    			
//    			System.out.println(
//    					"name =" + name 
//    					+ " " + belong 
//    					+" " + phone);
//				
    		}
    		rs.close();
    		stmt.close();
    		conn.close();
    	
    	} catch(SQLExceptioon e) {
    		e.printStackTrace();
    	}
    	
    	for(Professor p : members) {
    		System.out.println("Name: " + p.name + " " + p.belong + " " + p.phone);
    	
    	
    	String
    	}
	}

}
