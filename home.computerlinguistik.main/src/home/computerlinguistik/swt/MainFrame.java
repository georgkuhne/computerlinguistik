package home.computerlinguistik.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class MainFrame extends Composite {
	public static final int WIDTH = 780;
	public static final int HEIGHT = 550;

	public static final String TAB_ANALYSE = "Analyse";
	public static final String TAB_LEXICON = "Lexikon";
	public static final String TAB_WORTARTEN = "Wortarten";
	public static final String TAB_GRAMMATIK = "Grammatik";
	public static final String TAB_GRAMMKAT = "Grammatikalische Kategorien";
	public static final String TAB_SUBKAT = "Subkategorisierung";
	public static final String TAB_GRAMMREG = "Regeln";
	public static final String TAB_UEBERSICHT = "Übersicht";

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public MainFrame(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new FillLayout());
		TabFolder folderMain = new TabFolder(this, SWT.NONE);
		folderMain.setBounds(10, 10, WIDTH, HEIGHT);

		TabItem tabItem1 = new TabItem(folderMain, SWT.NONE);
		tabItem1.setText(TAB_ANALYSE);

		Composite composite_analyse = new Tab_Analyse(folderMain, SWT.NONE);
		tabItem1.setControl(composite_analyse);

		TabItem tabItem2 = new TabItem(folderMain, SWT.NONE);
		tabItem2.setText(TAB_LEXICON);

		TabFolder folderLexicon = new TabFolder(folderMain, SWT.NONE);
		tabItem2.setControl(folderLexicon);

		TabItem tabItem = new TabItem(folderLexicon, SWT.NONE);
		tabItem.setText(TAB_UEBERSICHT);

		Composite composite_uebersicht = new Tab_Lexicon_Uebersicht(folderLexicon,
				SWT.NONE);
		tabItem.setControl(composite_uebersicht);

		TabItem tabItem3 = new TabItem(folderLexicon, SWT.NONE);
		tabItem3.setText(TAB_WORTARTEN);

		TabItem tabItem4 = new TabItem(folderMain, SWT.NONE);
		tabItem4.setText(TAB_GRAMMATIK);

		TabFolder folderGrammatik = new TabFolder(folderMain, SWT.NONE);
		tabItem4.setControl(folderGrammatik);

		TabItem tabItem5 = new TabItem(folderLexicon, SWT.NONE);
		tabItem5.setText(TAB_GRAMMKAT);

		TabItem tabItem6 = new TabItem(folderGrammatik, SWT.NONE);
		tabItem6.setText(TAB_SUBKAT);

		TabItem tabItem7 = new TabItem(folderGrammatik, SWT.NONE);
		tabItem7.setText(TAB_GRAMMREG);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
