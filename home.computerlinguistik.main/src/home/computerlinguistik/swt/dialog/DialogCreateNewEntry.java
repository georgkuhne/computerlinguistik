package home.computerlinguistik.swt.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class DialogCreateNewEntry extends Dialog {
	private Text textName;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogCreateNewEntry(Shell parentShell) {
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

		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		FormData fd_tabFolder = new FormData();
		fd_tabFolder.bottom = new FormAttachment(100);
		fd_tabFolder.left = new FormAttachment(0, 10);
		fd_tabFolder.top = new FormAttachment(100, -332);
		fd_tabFolder.right = new FormAttachment(100, -10);
		tabFolder.setLayoutData(fd_tabFolder);

		TabItem tbtmAusprgungen = new TabItem(tabFolder, SWT.NONE);
		tbtmAusprgungen.setText("Auspr\u00E4gungen");

		TabItem tbtmRollen = new TabItem(tabFolder, SWT.NONE);
		tbtmRollen.setText("Rollen");

		TabItem tbtmSubkaterorisierungen = new TabItem(tabFolder, SWT.NONE);
		tbtmSubkaterorisierungen.setText("Subkaterorisierungen");

		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 161);
		fd_composite.right = new FormAttachment(0, 641);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		composite.setLayoutData(fd_composite);

		Label lblName = new Label(composite, SWT.NONE);
		GridData gd_lblName = new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1);
		gd_lblName.widthHint = 40;
		lblName.setLayoutData(gd_lblName);
		lblName.setText("Name:");

		textName = new Text(composite, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblWortart = new Label(composite, SWT.NONE);
		lblWortart.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblWortart.setText("Wortart:");

		ComboViewer comboViewer = new ComboViewer(composite, SWT.NONE);
		Combo comboWortart = comboViewer.getCombo();
		comboWortart.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

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
		return new Point(647, 564);
	}
}
