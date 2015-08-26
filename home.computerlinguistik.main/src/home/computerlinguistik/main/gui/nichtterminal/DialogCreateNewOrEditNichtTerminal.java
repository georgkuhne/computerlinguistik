package home.computerlinguistik.main.gui.nichtterminal;

import model.Nichterminal;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DialogCreateNewOrEditNichtTerminal extends Dialog {
	private Text text;
	String name;
	Nichterminal nichtterminal;
	boolean isStart = false;
	private Button btnStart;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public DialogCreateNewOrEditNichtTerminal(Shell parentShell) {
		super(parentShell);
	}

	public String getName() {
		return name;
	}

	public DialogCreateNewOrEditNichtTerminal(Shell parentShell,
			Nichterminal nichtterminal1, boolean isStart1) {
		super(parentShell);
		nichtterminal = nichtterminal1;
		isStart = isStart1;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(2, false));

		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name:");

		text = new Text(container, SWT.BORDER);
		if (nichtterminal != null)
			text.setText(nichtterminal.getName());
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

		btnStart = new Button(container, SWT.CHECK);
		btnStart.setSelection(isStart);
		btnStart.setText("Start");

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void okPressed() {
		name = text.getText();
		isStart = btnStart.getSelection();
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

	public boolean isStart() {
		return isStart;
	}
}
