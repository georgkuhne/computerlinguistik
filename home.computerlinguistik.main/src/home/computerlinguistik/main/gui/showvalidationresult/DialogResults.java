package home.computerlinguistik.main.gui.showvalidationresult;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class DialogResults extends Dialog {
		boolean earlyParsingSucceed=false;
		boolean unificationSucceed=false;
		public void setEarlyParsingSucceed(boolean earlyParsingSucceed) {
			this.earlyParsingSucceed = earlyParsingSucceed;
		}
		public void setUnificationSucceed(boolean unificationSucceed) {
			this.unificationSucceed = unificationSucceed;
		}
		
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public DialogResults(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		return container;
	}

	/**
	 * Create contents of the button bar.
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
		return new Point(450, 300);
	}
	public void setEarlyProgressString(String ausgabeEarly) {
		
	}

}
