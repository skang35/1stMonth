//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import bit.r45.dbt.UserGUI;

public class ConDB {
	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public static void main(String[] args) {
		new ConDB();
	}// main()

	// DB연결
	public ConDB() {
		try {
			// 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "kss", "1234");
			//			userUpdate();
			//			userListInsert();
			userSelectAll();
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 로드 fail");
		} catch (SQLException e) {
			System.out.println(e + "=> 연결 fail");
		}
	}// 생성자

	public void dbClose() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (ps != null)
				ps.close();
		} catch (Exception e) {
			System.out.println(e + "=> dbClose fail");
		}
	}// dbClose()

	public void userSelectAll() {
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM emp30");
			System.out.println("NAME \tAGE \tSALARY");
			System.out.print("-----------------------");
			while (rs.next()) {
				Object data[] = { rs.getString(1), rs.getInt(2), rs.getInt(3) };
				System.out.println("");
				//				for (int i = 0; i < data.length; i++)
				//					System.out.print(data[i] + " ");
				System.out.printf("%s \t%3d \t%5d", data[0], data[1], data[2]);
				//				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e + "=> userSelectAll fail");
		} finally {
			dbClose();
		}
	}// userSelectAll()

	// 추가는 텍스트창에 입력후 버튼클릭하면 작동하게
	public int userListInsert() {
		int result = 0;
		try {
			ps = con.prepareStatement("insert into emp30 values(?,?,?)");
			//			ps.setString(1, user.id.getText());
			//			ps.setString(2, user.name.getText());
			//			ps.setInt(3, Integer.parseInt(user.age.getText()));

			ps.setString(1,"이길동");
			ps.setString(2,"50");
			ps.setString(3,"500");
			result = ps.executeUpdate(); // 실행 -> 저장
		} catch (SQLException e) {
			System.out.println(e + "=> userListInsert fail");
		} finally {
			dbClose();
		}
		return result;
	}// userListInsert()

	// 갱신은 필드에서 직접선택해서 할수있도록해보자
	public int userUpdate() {
		int result = 0;
		//		String sql = "UPDATE emp30 SET NAME=?, age=? , salary =? WHERE name = ?";
		String sql = "UPDATE emp30 SET salary =? WHERE name = ?";
		try {
			ps = con.prepareStatement(sql);
			// ?의 순서대로 값 넣기
			//			ps.setString(1, "홍길동");
			//			ps.setString(2, "50");
			//			ps.setString(3, "500");
			//			ps.setString(4,"호랑이");			

			ps.setString(1, "3000");
			ps.setString(2, "김세헌");
			//			ps.setString(1, user.name.getText());
			//			ps.setString(2, user.age.getText());
			//			ps.setString(3, user.addr.getText());
			//			ps.setString(4, user.id.getText().trim());
			// 실행하기
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e + "=> userUpdate fail");
		} finally {
			dbClose();
		}
		return result;
	}// userUpdate()
}
// class