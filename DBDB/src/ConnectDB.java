import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Tree;

public class ConnectDB {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ConnectDB window = new ConnectDB();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("관리창(매니저전용)");
		
		CCombo combo = new CCombo(shell, SWT.NONE);
		combo.setBounds(10, 26, 66, 23);
		combo.setText("클릭");
		
		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		dateTime.setBounds(10, 72, 88, 24);
		
		Tree tree = new Tree(shell, SWT.BORDER);
		tree.setBounds(25, 123, 85, 85);

	}
}
