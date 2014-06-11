package home.computerlinguistik.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class Tab_Analyse extends Composite {
	private Text txtEingabe;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Tab_Analyse(Composite parent, int style) {
		super(parent, style);
		
		txtEingabe = new Text(this, SWT.BORDER | SWT.WRAP | SWT.H_SCROLL | SWT.CANCEL | SWT.MULTI);
		txtEingabe.setText("Eingabe");
		txtEingabe.setBounds(10, 10, 752, 105);
		
		Button btnLeeren = new Button(this, SWT.NONE);
		btnLeeren.setBounds(10, 121, 75, 25);
		btnLeeren.setText("Leeren");
		
		Button btnAnalysieren = new Button(this, SWT.NONE);
		btnAnalysieren.setBounds(91, 121, 75, 25);
		btnAnalysieren.setText("Analysieren");
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
