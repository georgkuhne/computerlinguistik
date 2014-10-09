package home.computerlinguistik.swt;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

public class Tab_Lexicon_Uebersicht extends Composite {
	private Table table;
	private TableViewer tableViewer;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public Tab_Lexicon_Uebersicht(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -31);
		fd_table.left = new FormAttachment(0, 25);
		fd_table.top = new FormAttachment(100, -287);
		fd_table.right = new FormAttachment(0, 354);
		table.setLayoutData(fd_table);

		Button btnNeuerEintrag = new Button(this, SWT.NONE);
		FormData fd_btnNeuerEintrag = new FormData();
		fd_btnNeuerEintrag.left = new FormAttachment(table, 6);
		btnNeuerEintrag.setLayoutData(fd_btnNeuerEintrag);
		btnNeuerEintrag.setText("neuer Eintrag");

		Button btnBearbeiten = new Button(this, SWT.NONE);
		fd_btnNeuerEintrag.bottom = new FormAttachment(btnBearbeiten, -6);
		btnBearbeiten.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBearbeiten.setText("Bearbeiten");
		FormData fd_btnBearbeiten = new FormData();
		fd_btnBearbeiten.top = new FormAttachment(0, 49);
		fd_btnBearbeiten.right = new FormAttachment(100, -26);
		fd_btnBearbeiten.left = new FormAttachment(table, 6);
		btnBearbeiten.setLayoutData(fd_btnBearbeiten);

		Button btnLschen = new Button(this, SWT.NONE);
		btnLschen.setText("L\u00F6schen");
		FormData fd_btnLschen = new FormData();
		fd_btnLschen.top = new FormAttachment(btnBearbeiten, 6);
		fd_btnLschen.left = new FormAttachment(table, 6);
		btnLschen.setLayoutData(fd_btnLschen);

		// Session session = PersistenceUtility.getINSTANCE().createSession();

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
