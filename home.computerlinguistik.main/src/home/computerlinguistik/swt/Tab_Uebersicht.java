package home.computerlinguistik.swt;

import home.cpmputerlinguistik.persistence.PersistenceUtility;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.hibernate.Session;

public class Tab_Uebersicht extends Composite {
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Tab_Uebersicht(Composite parent, int style) {
		super(parent, style);
		
		Button btnNeuesWortAnlegen = new Button(this, SWT.NONE);
		btnNeuesWortAnlegen.setBounds(10, 10, 145, 25);
		btnNeuesWortAnlegen.setText("Neues Wort  anlegen");
		
		TableViewer tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setBounds(10, 41, 745, 416);
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(10, 463, 75, 25);
		button.setText("1");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(91, 463, 75, 25);
		button_1.setText("2");

		
		Session session = PersistenceUtility.getINSTANCE().createSession();
		
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
