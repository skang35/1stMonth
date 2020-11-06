import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Menu extends Composite {
	private Text text;
	private Text text_1;
	private Button btnNewButton;
	private Label lblNewLabel;
	private Text text_2;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Menu(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		setLayout(new GridLayout(2, false));
		
		Button btnFirstName = new Button(this, SWT.NONE);
		btnFirstName.setText("First Name");
		
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));	
		
		Button btnLastName = new Button(this, SWT.NONE);
		btnLastName.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		btnLastName.setText("Last Name");
		
		text_1 = new Text(this, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setText("New Button");
		new Label(this, SWT.NONE);
		
		lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("New Label");
		
		text_2 = new Text(this, SWT.BORDER);
		text_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
