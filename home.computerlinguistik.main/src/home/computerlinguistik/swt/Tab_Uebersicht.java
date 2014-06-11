package home.computerlinguistik.swt;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;

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
		btnNeuesWortAnlegen.setBounds(10, 10, 117, 23);
		btnNeuesWortAnlegen.setText("Neues Wort anlegen");
		
		TableViewer tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setBounds(10, 39, 743, 420);
		
		Button btnEintragBearbeiten = new Button(this, SWT.NONE);
		btnEintragBearbeiten.setBounds(10, 465, 101, 23);
		btnEintragBearbeiten.setText("Eintrag bearbeiten");
		
		Button btnEintragLschen = new Button(this, SWT.NONE);
		btnEintragLschen.setBounds(117, 465, 101, 23);
		btnEintragLschen.setText("Eintrag l\u00F6schen");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
