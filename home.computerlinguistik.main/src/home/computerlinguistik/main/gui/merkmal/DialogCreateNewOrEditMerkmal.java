package home.computerlinguistik.main.gui.merkmal;

import java.util.ArrayList;

import model.Merkmal;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DialogCreateNewOrEditMerkmal extends Dialog {
	private Text text;
	String name;
	Merkmal merkmal;
	private Text tnewwert;
	private ArrayList<String> werte = new ArrayList<String>();
	private ListViewer listViewer;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public DialogCreateNewOrEditMerkmal(Shell parentShell) {
		super(parentShell);
	}

	public String getName() {
		return name;
	}

	public DialogCreateNewOrEditMerkmal(Shell parentShell, Merkmal merkmal1) {
		super(parentShell);
		merkmal = merkmal1;
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
		fd_lblName.left = new FormAttachment(0);
		fd_lblName.top = new FormAttachment(5);
		fd_lblName.width = 40;
		lblName.setLayoutData(fd_lblName);
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(5);
		fd_text.left = new FormAttachment(lblName, 11);
		fd_text.right = new FormAttachment(95);
		text.setLayoutData(fd_text);
		listViewer = new ListViewer(container, SWT.BORDER | SWT.V_SCROLL);
		listViewer.setContentProvider(ArrayContentProvider.getInstance());
		listViewer.setLabelProvider(new LabelProvider() {
			public Image getImage(Object element) {
				return null;
			}

			public String getText(Object element) {
				return (String) element;
			}
		});
		List list = listViewer.getList();
		if (merkmal != null)
			werte.addAll(merkmal.getMoeglicheWerte());
		listViewer.setInput(werte);
		FormData fd_list = new FormData();
		fd_list.left = new FormAttachment(0, 16);
		fd_list.bottom = new FormAttachment(100, -40);
		fd_list.right = new FormAttachment(0, 135);
		list.setLayoutData(fd_list);

		Label lblWerte = new Label(container, SWT.NONE);
		fd_list.top = new FormAttachment(lblWerte, 6);
		lblWerte.setText("Werte:");
		FormData fd_lblWerte = new FormData();
		fd_lblWerte.bottom = new FormAttachment(100, -149);
		fd_lblWerte.right = new FormAttachment(lblName, 0, SWT.RIGHT);
		lblWerte.setLayoutData(fd_lblWerte);

		tnewwert = new Text(container, SWT.BORDER);
		FormData fd_tnewwert = new FormData();
		fd_tnewwert.right = new FormAttachment(list, 148, SWT.RIGHT);
		fd_tnewwert.top = new FormAttachment(text, 44);
		fd_tnewwert.left = new FormAttachment(list, 38);
		tnewwert.setLayoutData(fd_tnewwert);

		Button btnAdd = new Button(container, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addWert();
			}
		});
		FormData fd_btnAdd = new FormData();
		fd_btnAdd.top = new FormAttachment(tnewwert, -2, SWT.TOP);
		fd_btnAdd.left = new FormAttachment(tnewwert, 12);
		btnAdd.setLayoutData(fd_btnAdd);
		btnAdd.setText("addWert");

		Button btnRemove = new Button(container, SWT.NONE);
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				remoweWert();
			}
		});
		FormData fd_btnRemove = new FormData();
		fd_btnRemove.top = new FormAttachment(btnAdd, 20);
		fd_btnRemove.right = new FormAttachment(list, 206, SWT.RIGHT);
		fd_btnRemove.left = new FormAttachment(list, 38);
		btnRemove.setLayoutData(fd_btnRemove);
		btnRemove.setText("Remove");
		if (merkmal != null)
			text.setText(merkmal.getName());

		return container;
	}

	protected void remoweWert() {
		IStructuredSelection selection = (IStructuredSelection) listViewer
				.getSelection();
		String wert = (String) selection.getFirstElement();
		if (wert == null) {
			System.out.println("Please select a language first.");
			return;
		}

		werte.remove(wert);
		listViewer.setInput(werte);

	}

	protected void addWert() {
		String wert = tnewwert.getText();
		tnewwert.setText("");
		if (wert.trim().length() <= 0)
			return;
		werte.add(wert);
		listViewer.setInput(werte);
	}

	public ArrayList<String> getWerte() {
		return werte;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void okPressed() {
		name = text.getText();
		super.okPressed();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.OK_LABEL, true);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
}
