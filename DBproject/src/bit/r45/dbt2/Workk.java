package bit.r45.dbt2;
//import java.beans.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import bit.r45.dbt2.UserGUI;
public class Workk {
	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public static void main(String[] args) {
		new Workk();
	}// main()
	// DB�뿰寃�
	public Workk() {
		try {
			// 濡쒕뱶
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �뿰寃�
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "jjh", "1234");
//			userUpdate();
//			userListInsert();
//			userSelectAll();
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 濡쒕뱶 fail");
		} catch (SQLException e) {
			System.out.println(e + "=> �뿰寃� fail");
		}
	}// �깮�꽦�옄
	
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
	
	public void userSelectAll(DefaultTableModel t_model) {
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM emp30");
//			System.out.println("NAME \tAGE \tSALARY");
//			System.out.print("-----------------------");
			
			// DefaultTableModel�뿉 �엳�뒗 湲곗〈 �뜲�씠�꽣 吏��슦湲�
            for (int i = 0; i < t_model.getRowCount();) {
                t_model.removeRow(0);
            }
            
			while (rs.next()) {
				Object data[] = { rs.getString(1), rs.getInt(2), rs.getInt(3) };
//				System.out.println("");
				t_model.addRow(data); //DefaultTableModel�뿉 �젅肄붾뱶 異붽�
//				System.out.printf("%s \t%3d \t%5d", data[0], data[1], data[2]);
//				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e + "=> userSelectAll fail");
		} finally {
			dbClose();
		}
	}// userSelectAll()
	
	// 異붽��뒗 �뀓�뒪�듃李쎌뿉 �엯�젰�썑 踰꾪듉�겢由��븯硫� �옉�룞�븯寃�
	public int userListInsert(UserGUI usg) {
		int result = 0;
		try {
			ps = con.prepareStatement("insert into emp30 values(?,?,?)");
			
			ps.setString(1, usg.name.getText());
			ps.setInt(2, Integer.parseInt(usg.age.getText()));
			ps.setInt(3, Integer.parseInt(usg.salary.getText()));
			result = ps.executeUpdate(); // �떎�뻾 -> ���옣
		} catch (SQLException e) {
			System.out.println(e + "=> userListInsert fail");
		} finally {
			dbClose();
		}
		return result;
	}// userListInsert()
	
	// 媛깆떊�� �븘�뱶�뿉�꽌 吏곸젒�꽑�깮�빐�꽌 �븷�닔�엳�룄濡앺빐蹂댁옄
	public int userUpdate(UserGUI usg) {
		int result = 0;
//		String sql = "UPDATE emp30 SET NAME=?, age=? , salary =? WHERE name = ?";
		String sql = "UPDATE emp30 SET salary =? WHERE name = ? AND age=?";
		try {
			ps = con.prepareStatement(sql);
			// ?�쓽 �닚�꽌��濡� 媛� �꽔湲�
			ps.setString(1, usg.salary.getText());
			ps.setString(2, usg.name.getText());
			ps.setString(3, usg.age.getText());
			
//			ps.setString(1, usg.name.getText());
//			ps.setString(2, usg.age.getText());
//			ps.setString(3, usg.salary.getText());
//			ps.setString(4, usg.name.getText().trim());
			// �떎�뻾�븯湲�
			result = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e + "=> userUpdate fail");
		} finally {
			dbClose();
		}
		return result;
	}// userUpdate()
	
	public int userDelete(UserGUI usg) {
        int result = 0;
        
        String sql= "DELETE emp30 where name = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usg.name.getText());
            result = ps.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e + "=> userDelete fail");
        }finally {
            dbClose();
        }
 
        return result;
    }//userDelete()
}
// class