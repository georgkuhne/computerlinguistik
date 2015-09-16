package home.computerlinguistik.main.gui;

import home.computerlinguistik.main.MainView;
import home.computerlinguistik.main.algorithm.earlyparser.EarlyParser;
import home.computerlinguistik.main.algorithm.earlyparser.WordNotInLexikonException;
import home.computerlinguistik.main.gui.showvalidationresult.DialogResults;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.ArrayList;

import model.LexikalischFunktionaleGrammatik;
import model.LexikonEintrag;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.hibernate.Session;

public class CompositeMain extends Composite implements GrammarSelectedListener {
	private Text text;
	private long grammarId;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public CompositeMain(Composite parent, int style) {
		super(parent, style);
		MainView.getInstance().addGrammarSelectedListener(this);
		setLayout(new FormLayout());

		TabFolder tabFolder = new TabFolder(this, SWT.NONE);
		TabItem tbtmValidator = new TabItem(tabFolder, SWT.NONE);
		tbtmValidator.setText("Validator");

		Button b_close = new Button(this, SWT.DEFAULT);
		b_close.setText("Schlieﬂen");

		b_close.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				close();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		FormData fd_close = new FormData();
		fd_close.left = new FormAttachment(0);
		fd_close.right = new FormAttachment(100);
		fd_close.bottom = new FormAttachment(100);
		fd_close.height = 30;

		FormData fd_tabFolder = new FormData();
		fd_tabFolder.top = new FormAttachment(0);
		fd_tabFolder.left = new FormAttachment(0);
		fd_tabFolder.right = new FormAttachment(100);
		fd_tabFolder.bottom = new FormAttachment(b_close);

		b_close.setLayoutData(fd_close);
		tabFolder.setLayoutData(fd_tabFolder);

		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmValidator.setControl(composite);
		composite.setLayout(new FormLayout());

		Label lblEingabe = new Label(composite, SWT.NONE);
		FormData fd_lblEingabe = new FormData();
		fd_lblEingabe.top = new FormAttachment(0, 23);
		fd_lblEingabe.left = new FormAttachment(0, 23);
		lblEingabe.setLayoutData(fd_lblEingabe);
		lblEingabe.setText("Eingabe:");

		text = new Text(composite, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.height = 20;
		fd_text.right = new FormAttachment(100);
		fd_text.top = new FormAttachment(lblEingabe, 6);
		fd_text.left = new FormAttachment(0);
		text.setLayoutData(fd_text);
		text.setText("the little baby needs a bed");
		Button btnValidieren = new Button(composite, SWT.NONE);
		btnValidieren.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validieren();
			}
		});
		FormData fd_btnValidieren = new FormData();
		fd_btnValidieren.top = new FormAttachment(text, 6);
		fd_btnValidieren.right = new FormAttachment(text, 0, SWT.RIGHT);
		btnValidieren.setLayoutData(fd_btnValidieren);
		btnValidieren.setText("validieren");

		TabItem tbtmGrammatikeditor = new TabItem(tabFolder, SWT.NONE);
		tbtmGrammatikeditor.setText("Grammatikeditor");
		CompositeGrammatikMain compositegrammatik = new CompositeGrammatikMain(
				tabFolder, SWT.None);
		tbtmGrammatikeditor.setControl(compositegrammatik);
	}

	protected void validieren() {
		if (text.getText().trim().length() < 1) {
			return;
		}

		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik grammatik = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarId, session);
		ArrayList<LexikonEintrag> eintraege = null;
		try {
			eintraege = EarlyParser.parseWords(text.getText(), grammatik);
		} catch (WordNotInLexikonException e) {
			MessageDialog.openWarning(getShell(), "Wort nicht gefunden",
					"Das Wort \"" + e.getWord()
							+ "\" wurde nicht im Lexikon gefunden");

			session.close();
			return;
		}
		if (EarlyParser.getInstance().performEarlyParser(grammatik, eintraege)) {
			//earlysucceed
			
		} else {
			DialogResults dialog=new DialogResults(getShell());
			dialog.setEarlyProgressString(EarlyParser.getInstance().getAusgabeEarly());
			dialog.open();
			//earlyfailed
		}

		session.close();
	}

	protected void close() {
		MainView.getInstance().closeGrammar();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	@Override
	public void updateGrammarSelection(long grammarId1) {
		grammarId = grammarId1;
	}
}
