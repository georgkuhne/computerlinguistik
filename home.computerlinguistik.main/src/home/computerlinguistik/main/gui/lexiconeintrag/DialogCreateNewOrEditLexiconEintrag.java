package home.computerlinguistik.main.gui.lexiconeintrag;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DialogCreateNewOrEditLexiconEintrag extends Dialog {
	private Text text;
	private Table table;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogCreateNewOrEditLexiconEintrag(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());

		Label lblName = new Label(container, SWT.NONE);
		FormData fd_lblName = new FormData();
		fd_lblName.top = new FormAttachment(0, 10);
		fd_lblName.left = new FormAttachment(0, 10);

		lblName.setLayoutData(fd_lblName);
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(0, 10);
		fd_text.left = new FormAttachment(20);
		fd_text.width = 300;
		text.setLayoutData(fd_text);

		Label lblTerminal = new Label(container, SWT.NONE);
		FormData fd_lblTerminal = new FormData();
		fd_lblTerminal.top = new FormAttachment(lblName, 20);
		fd_lblTerminal.left = new FormAttachment(0, 10);

		lblTerminal.setLayoutData(fd_lblTerminal);
		lblTerminal.setText("Terminal:");

		ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
		Combo comboTerminal = comboViewer.getCombo();
		FormData fd_comboTerminal = new FormData();
		fd_comboTerminal.top = new FormAttachment(lblName, 20);
		fd_comboTerminal.left = new FormAttachment(20);
		fd_comboTerminal.width = 200;
		comboTerminal.setLayoutData(fd_comboTerminal);

		Group grpFstruktur = new Group(container, SWT.NONE);
		grpFstruktur.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD
				| SWT.ITALIC));
		grpFstruktur.setText("F-Struktur");
		grpFstruktur.setLayout(new FormLayout());
		FormData fd_grpFstruktur = new FormData();
		fd_grpFstruktur.top = new FormAttachment(lblTerminal, 30);
		fd_grpFstruktur.bottom = new FormAttachment(100);
		fd_grpFstruktur.right = new FormAttachment(100);
		fd_grpFstruktur.left = new FormAttachment(0, 10);
		grpFstruktur.setLayoutData(fd_grpFstruktur);

		ComboViewer comboViewer_1 = new ComboViewer(grpFstruktur, SWT.NONE);
		Combo comboAuspraegung = comboViewer_1.getCombo();
		FormData fd_comboAuspraegung = new FormData();
		comboAuspraegung.setLayoutData(fd_comboAuspraegung);

		Label lblAusprgung = new Label(grpFstruktur, SWT.NONE);
		fd_comboAuspraegung.left = new FormAttachment(lblAusprgung, 19);
		fd_comboAuspraegung.top = new FormAttachment(lblAusprgung, -3, SWT.TOP);
		FormData fd_lblAusprgung = new FormData();
		fd_lblAusprgung.top = new FormAttachment(0, 10);
		fd_lblAusprgung.left = new FormAttachment(0);
		lblAusprgung.setLayoutData(fd_lblAusprgung);
		lblAusprgung.setText("Auspr\u00E4gung:");

		Button btnHinzufgen = new Button(grpFstruktur, SWT.NONE);
		fd_comboAuspraegung.right = new FormAttachment(100, -425);
		FormData fd_btnHinzufgen = new FormData();
		fd_btnHinzufgen.top = new FormAttachment(comboAuspraegung, -2, SWT.TOP);
		fd_btnHinzufgen.left = new FormAttachment(comboAuspraegung, 25);
		btnHinzufgen.setLayoutData(fd_btnHinzufgen);
		btnHinzufgen.setText("hinzuf\u00FCgen");

		Button btnEntfernen = new Button(grpFstruktur, SWT.NONE);
		FormData fd_btnEntfernen = new FormData();
		fd_btnEntfernen.top = new FormAttachment(comboAuspraegung, -2, SWT.TOP);
		fd_btnEntfernen.left = new FormAttachment(btnHinzufgen, 23);
		btnEntfernen.setLayoutData(fd_btnEntfernen);
		btnEntfernen.setText("entfernen");

		TableViewer tableViewerFstruktur = new TableViewer(grpFstruktur,
				SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewerFstruktur.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		FormData fd_table = new FormData();
		fd_table.right = new FormAttachment(btnHinzufgen, 0, SWT.RIGHT);
		fd_table.top = new FormAttachment(comboAuspraegung, 54);
		fd_table.bottom = new FormAttachment(100, -15);
		fd_table.left = new FormAttachment(0, 16);
		table.setLayoutData(fd_table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewerFstruktur, SWT.NONE);
		TableColumn tblclmnMerkmalfunktion = tableViewerColumn.getColumn();
		tblclmnMerkmalfunktion.setWidth(143);
		tblclmnMerkmalfunktion.setText("Merkmal/Funktion");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				tableViewerFstruktur, SWT.NONE);
		TableColumn tblclmnWert = tableViewerColumn_1.getColumn();
		tblclmnWert.setWidth(100);
		tblclmnWert.setText("Wert");

		Label label = new Label(grpFstruktur, SWT.SEPARATOR | SWT.HORIZONTAL);
		FormData fd_label = new FormData();
		fd_label.bottom = new FormAttachment(comboAuspraegung, 38, SWT.BOTTOM);
		fd_label.right = new FormAttachment(0, 593);
		fd_label.top = new FormAttachment(comboAuspraegung, 15);
		fd_label.left = new FormAttachment(0, 4);
		label.setLayoutData(fd_label);

		Label lblNewLabel = new Label(grpFstruktur, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(label, 1);
		fd_lblNewLabel.left = new FormAttachment(btnEntfernen, 0, SWT.LEFT);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Merkmal/FKT");

		Label lblWert = new Label(grpFstruktur, SWT.NONE);
		FormData fd_lblWert = new FormData();
		fd_lblWert.bottom = new FormAttachment(lblNewLabel, 0, SWT.BOTTOM);
		fd_lblWert.left = new FormAttachment(lblNewLabel, 57);
		lblWert.setLayoutData(fd_lblWert);
		lblWert.setText("Wert");

		Combo comboMerkmalFKT = new Combo(grpFstruktur, SWT.NONE);
		FormData fd_comboMerkmalFKT = new FormData();
		fd_comboMerkmalFKT.top = new FormAttachment(lblNewLabel);
		fd_comboMerkmalFKT.left = new FormAttachment(btnEntfernen, 0, SWT.LEFT);
		comboMerkmalFKT.setLayoutData(fd_comboMerkmalFKT);

		Combo comboWert = new Combo(grpFstruktur, SWT.NONE);
		FormData fd_comboWert = new FormData();
		fd_comboWert.top = new FormAttachment(table, 0, SWT.TOP);
		fd_comboWert.left = new FormAttachment(comboMerkmalFKT, 16);
		comboWert.setLayoutData(fd_comboWert);

		Button btnHinzufgen_1 = new Button(grpFstruktur, SWT.NONE);
		FormData fd_btnHinzufgen_1 = new FormData();
		fd_btnHinzufgen_1.top = new FormAttachment(table, 0, SWT.TOP);
		fd_btnHinzufgen_1.left = new FormAttachment(comboWert, 12);
		btnHinzufgen_1.setLayoutData(fd_btnHinzufgen_1);
		btnHinzufgen_1.setText("hinzuf\u00FCgen");

		Button btnEntfernen_1 = new Button(grpFstruktur, SWT.NONE);
		FormData fd_btnEntfernen_1 = new FormData();
		fd_btnEntfernen_1.top = new FormAttachment(comboMerkmalFKT, 6);
		fd_btnEntfernen_1.right = new FormAttachment(lblNewLabel, 0, SWT.RIGHT);
		btnEntfernen_1.setLayoutData(fd_btnEntfernen_1);
		btnEntfernen_1.setText("entfernen");

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(619, 466);
	}
}
