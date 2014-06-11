package home.computerlinguistik.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class MainFrame extends Composite {
	public static final int WIDTH = 780;
	public static final int HEIGHT = 550;
	
	public static final String TAB_1 = "Analyse";
	public static final String TAB_2 = "Lexikon";
	public static final String TAB_2_1 = "Wortarten";
	public static final String TAB_2_2 = "Grammatik";
	public static final String TAB_2_3 = "Grammatikalische Kategorien";
	public static final String TAB_2_4 = "Subkategorisierung";
	

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MainFrame(Composite parent, int style) {
		super(parent, style);
		
		TabFolder folderMain = new TabFolder(this, SWT.NONE);
		folderMain.setBounds(10, 10, WIDTH, HEIGHT);
		
		TabItem tabItem1 = new TabItem(folderMain, SWT.NONE);
		tabItem1.setText(TAB_1);
		
		Composite composite_tab1= new Tab_Analyse(folderMain, SWT.NONE);
		tabItem1.setControl(composite_tab1);
		
		TabItem tabItem2 = new TabItem(folderMain, SWT.NONE);
		tabItem2.setText(TAB_2);
		
		TabFolder folderLexicon = new TabFolder(folderMain, SWT.NONE);
		tabItem2.setControl(folderLexicon);
		
		TabItem tabItem_1 = new TabItem(folderLexicon, SWT.NONE);
		tabItem_1.setText(TAB_2_1);
		
		Composite composite = new Tab_Wortarten(folderLexicon, SWT.NONE);
		tabItem_1.setControl(composite);
		
		TabItem tabItem = new TabItem(folderLexicon, SWT.NONE);
		tabItem.setText(TAB_2_2);
		
		Composite composite_1 = new Composite(folderLexicon, SWT.NONE);
		tabItem.setControl(composite_1);
		
		TabItem tabItem_2 = new TabItem(folderLexicon, SWT.NONE);
		tabItem_2.setText(TAB_2_3);
		
		Composite composite_2 = new Composite(folderLexicon, SWT.NONE);
		tabItem_2.setControl(composite_2);
		
		TabItem tabItem_3 = new TabItem(folderLexicon, SWT.NONE);
		tabItem_3.setText(TAB_2_4);
		
		Composite composite_3 = new Composite(folderLexicon, SWT.NONE);
		tabItem_3.setControl(composite_3);



	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
