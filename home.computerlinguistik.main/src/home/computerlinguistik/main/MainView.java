package home.computerlinguistik.main;

import home.computerlinguistik.swt.MainFrame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MainView extends ViewPart {

	public static final String ID = "hs.merseburg.miks13.compling.view";

	private Composite parent;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		MainFrame mainFrame = new MainFrame(parent, SWT.None);
		parent.setLayout(new FillLayout());

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {

	}

}