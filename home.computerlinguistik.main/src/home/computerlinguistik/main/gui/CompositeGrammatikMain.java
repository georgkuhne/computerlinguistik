package home.computerlinguistik.main.gui;

import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseFunction;
import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseLexikon;
import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseMerkmal;
import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseNichterminale;
import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseRegeln;
import home.computerlinguistik.main.gui.browsecomposites.CompositeBrowseTerminale;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;

public class CompositeGrammatikMain extends Composite {
	private Table table;
	private CompositeBrowseLexikon compositeLexicon;
	private CompositeBrowseFunction compositeFunction;
	private CompositeBrowseTerminale compositeTerminale;
	private CompositeBrowseNichterminale compositeNichtTerminale;
	private CompositeBrowseMerkmal compositeMerkmal;
	private CompositeBrowseRegeln compositeRegeln;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public CompositeGrammatikMain(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));

		TabFolder tabFolder = new TabFolder(this, SWT.NONE);

		TabItem tbtmLexicon = new TabItem(tabFolder, SWT.NONE);
		tbtmLexicon.setText("Lexikon");
		compositeLexicon = new CompositeBrowseLexikon(tabFolder, SWT.NONE);
		tbtmLexicon.setControl(compositeLexicon);

		TabItem tbtmNichterminale = new TabItem(tabFolder, SWT.NONE);
		tbtmNichterminale.setText("Terminale");
		compositeTerminale = new CompositeBrowseTerminale(tabFolder, SWT.NONE);
		tbtmNichterminale.setControl(compositeTerminale);

		TabItem tbtmNichterminale_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNichterminale_1.setText("Nichterminale");
		compositeNichtTerminale = new CompositeBrowseNichterminale(tabFolder,
				SWT.NONE);
		tbtmNichterminale_1.setControl(compositeNichtTerminale);

		TabItem tbtmAbleitungsregeln = new TabItem(tabFolder, SWT.NONE);
		tbtmAbleitungsregeln.setText("Ableitungsregeln");
		compositeRegeln = new CompositeBrowseRegeln(tabFolder, SWT.NONE);
		tbtmAbleitungsregeln.setControl(compositeRegeln);

		TabItem tbtmMerkmale = new TabItem(tabFolder, SWT.NONE);
		tbtmMerkmale.setText("Merkmale");
		compositeMerkmal = new CompositeBrowseMerkmal(tabFolder, SWT.NONE);
		tbtmMerkmale.setControl(compositeMerkmal);

		TabItem tbtmFunktionen = new TabItem(tabFolder, SWT.NONE);
		tbtmFunktionen.setText("Funktionen");
		compositeFunction = new CompositeBrowseFunction(tabFolder, SWT.NONE);
		tbtmFunktionen.setControl(compositeFunction);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
