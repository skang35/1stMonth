package bit.r45.dbt2;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UserGUI extends JDialog implements ActionListener,MouseListener {

	ConDB cdb = new ConDB();

	JPanel pw = new JPanel(new GridLayout(2, 2));
	JPanel top = new JPanel();
	JPanel fbtn = new JPanel();
	
	JLabel lname = new JLabel("이름");
	JLabel lage = new JLabel("나이");
	JLabel lsalary = new JLabel("월급");
	
	JTextField name = new JTextField(12);
	JTextField age = new JTextField(12);
	JTextField salary = new JTextField(12);
	
	JButton insert = new JButton("추가");
	JButton update = new JButton("갱신");
	JButton delete = new JButton("삭제");

	

	// 목차부분설정
	String[] fieldname = { "name", "age", "salary" };
	DefaultTableModel dt = new DefaultTableModel(fieldname, 0);
	JTable jt = new JTable(dt);
	JScrollPane jsp = new JScrollPane(jt);

	// 하단 선택버튼
	JPanel p = new JPanel(new GridLayout(2, 2));
	JButton read = new JButton("Reading");

	public static void main(String[] args) {
		new UserGUI();
	}// main()

	public UserGUI() {
		// 텍스트필드 및 추가,갱신버튼
		top.add(lname);
		top.add(name);
		top.add(lage);
		top.add(age);
		top.add(lsalary);
		top.add(salary);

		fbtn.add(insert);
		fbtn.add(update);
		fbtn.add(delete);

		pw.add(top, "North");
		pw.add(fbtn, "South");

		p.add(read);
		

		// 패널들 추가
		add(pw, "North");
		add(jsp, "Center");
		add(p, "South");

		// 버튼이벤트
		read.addActionListener(new ActionListener() {
			// 전송버튼이벤트
			@Override
			public void actionPerformed(ActionEvent e) {
				cdb.userSelectAll(dt);
			}
		});// read

		insert.addActionListener(this);

		update.addActionListener(this);
		
		delete.addActionListener(this);
		
		jt.addMouseListener(this);
		

		// 사이즈설정 및 가시화
		setSize(600, 500);
		setVisible(true);
	}// 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnLabel = e.getActionCommand();

		if (btnLabel.equals("추가")) {
			if (cdb.userListInsert(this) > 0) {
				cdb.userSelectAll(dt);
			}else {
				messageBox(this, "추가실패");
			}
		}
		else if (btnLabel.equals("갱신")) {
			if(cdb.userUpdate(this)>0) {			
			cdb.userSelectAll(dt);
			
			}else {
				messageBox(this, "갱신실패");
			}
		}
	}//actionPerformed

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = jt.getSelectedRow();// 선택된 행
		name.setText(jt.getValueAt(row, 0).toString());
		age.setText(jt.getValueAt(row, 1).toString());
		salary.setText(jt.getValueAt(row, 2).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public static void messageBox(Object obj, String message) {
		JOptionPane.showMessageDialog((Component) obj, message);
	}
	
}//class


//삭제 기능 추가, sql 문 통일, 메세지 박스 기능 추가