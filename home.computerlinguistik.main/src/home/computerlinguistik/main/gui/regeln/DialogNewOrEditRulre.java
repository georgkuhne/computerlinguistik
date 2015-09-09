package home.computerlinguistik.main.gui.regeln;

import model.AbleitungsRegel;
import model.AnnotiertesTerminalNichtTerminal;
import model.Funktion;
import model.LexikalischFunktionaleGrammatik;
import model.ModelFactory;
import model.Nichterminal;
import model.TerminalNichtTerminal;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class DialogNewOrEditRulre extends Dialog {

	private ComboViewer viewerComboStartNichterminal;
	private FormData fd_lblArrowup;
	private ListViewer viewerListAbbildungZiel;
	private ComboViewer viewerComboZiel;
	private ComboViewer viewerComboPFeilDown;
	private ListViewer viewerListPfeilDown;
	private ComboViewer viewerComboPfeilUp;
	private ListViewer viewerListPfeilUP;

	private AbleitungsRegel regel;
	private LexikalischFunktionaleGrammatik grammatik;

	/**
	 * 
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public DialogNewOrEditRulre(Shell parentShell,
			LexikalischFunktionaleGrammatik grammatik1, AbleitungsRegel regel1) {
		super(parentShell);
		grammatik = grammatik1;
		regel = regel1;
	}

	/**
	 * 
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogNewOrEditRulre(Shell parentShell,
			LexikalischFunktionaleGrammatik grammatik1) {
		super(parentShell);
		grammatik = grammatik1;
		regel = ModelFactory.eINSTANCE.createAbleitungsRegel();
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

		Group grpCstruktur = new Group(container, SWT.NONE);
		grpCstruktur.setText("C-Struktur");
		grpCstruktur.setLayout(new FormLayout());
		FormData fd_grpCstruktur = new FormData();
		fd_grpCstruktur.top = new FormAttachment(0);
		fd_grpCstruktur.height = 150;
		fd_grpCstruktur.left = new FormAttachment(0);
		fd_grpCstruktur.right = new FormAttachment(100);
		grpCstruktur.setLayoutData(fd_grpCstruktur);

		Group grpAnnotationen = new Group(container, SWT.NONE);
		fd_grpCstruktur.right = new FormAttachment(grpAnnotationen, 0,
				SWT.RIGHT);
		grpAnnotationen.setText("Annotationen");
		grpAnnotationen.setLayout(new FormLayout());
		FormData fd_grpAnnotationen = new FormData();
		fd_grpAnnotationen.bottom = new FormAttachment(100);
		fd_grpAnnotationen.top = new FormAttachment(grpCstruktur, 6);

		viewerComboStartNichterminal = new ComboViewer(grpCstruktur, SWT.NONE);
		Combo combo = viewerComboStartNichterminal.getCombo();
		FormData fd_combo = new FormData();
		fd_combo.top = new FormAttachment(0, 24);
		fd_combo.left = new FormAttachment(0, 10);
		fd_combo.width = 100;
		combo.setLayoutData(fd_combo);

		Label lblPfeil = new Label(grpCstruktur, SWT.NONE);
		lblPfeil.setFont(SWTResourceManager.getFont("Microsoft YaHei", 39,
				SWT.BOLD));
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.left = new FormAttachment(combo, 48);
		fd_lblNewLabel.top = new FormAttachment(0);
		lblPfeil.setLayoutData(fd_lblNewLabel);
		lblPfeil.setText("\u2192");

		viewerListAbbildungZiel = new ListViewer(grpCstruktur, SWT.BORDER
				| SWT.V_SCROLL);
		List list = viewerListAbbildungZiel.getList();
		FormData fd_list = new FormData();
		// fd_list.right = new FormAttachment(lblPfeil, 150);
		fd_list.bottom = new FormAttachment(100, 20);
		fd_list.top = new FormAttachment(0, 10);
		fd_list.left = new FormAttachment(lblPfeil, 36);
		fd_list.width = 100;
		list.setLayoutData(fd_list);

		viewerComboZiel = new ComboViewer(grpCstruktur, SWT.NONE);
		Combo combo_1 = viewerComboZiel.getCombo();
		FormData fd_combo_1 = new FormData();
		fd_combo_1.left = new FormAttachment(list, 25);
		fd_combo_1.top = new FormAttachment(0, 10);
		fd_combo_1.width = 100;
		combo_1.setLayoutData(fd_combo_1);

		Button btnHinzufgen = new Button(grpCstruktur, SWT.NONE);
		FormData fd_btnHinzufgen = new FormData();
		fd_btnHinzufgen.top = new FormAttachment(0, 10);
		fd_btnHinzufgen.left = new FormAttachment(combo_1, 22);
		btnHinzufgen.setLayoutData(fd_btnHinzufgen);
		btnHinzufgen.setText("Hinzuf\u00FCgen");
		btnHinzufgen.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				addToZiel();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		Button btnEntfernen = new Button(grpCstruktur, SWT.NONE);
		FormData fd_btnEntfernen = new FormData();
		fd_btnEntfernen.bottom = new FormAttachment(lblPfeil, 0, SWT.BOTTOM);
		fd_btnEntfernen.left = new FormAttachment(combo_1, 0, SWT.LEFT);
		btnEntfernen.setLayoutData(fd_btnEntfernen);
		btnEntfernen.setText("entfernen");
		btnEntfernen.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				removeFromZiel();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		fd_grpAnnotationen.left = new FormAttachment(0);
		fd_grpAnnotationen.right = new FormAttachment(100);
		grpAnnotationen.setLayoutData(fd_grpAnnotationen);

		Label lblArrowup = new Label(grpAnnotationen, SWT.NONE);
		lblArrowup.setFont(SWTResourceManager.getFont("Segoe UI Symbol", 45,
				SWT.BOLD));
		fd_lblArrowup = new FormData();
		fd_lblArrowup.top = new FormAttachment(0, 30);
		fd_lblArrowup.left = new FormAttachment(0, 10);
		lblArrowup.setLayoutData(fd_lblArrowup);
		lblArrowup.setText("\u2191");

		viewerListPfeilUP = new ListViewer(grpAnnotationen, SWT.BORDER
				| SWT.V_SCROLL);
		List list_1 = viewerListPfeilUP.getList();
		FormData fd_list_1 = new FormData();
		fd_list_1.left = new FormAttachment(lblArrowup, 9);
		fd_list_1.bottom = new FormAttachment(0, 183);
		fd_list_1.top = new FormAttachment(0, 44);
		list_1.setLayoutData(fd_list_1);

		viewerComboPfeilUp = new ComboViewer(grpAnnotationen, SWT.NONE);
		Combo combo_2 = viewerComboPfeilUp.getCombo();
		fd_list_1.right = new FormAttachment(100, -618);
		FormData fd_combo_2 = new FormData();
		fd_combo_2.top = new FormAttachment(list_1, 1, SWT.TOP);
		fd_combo_2.left = new FormAttachment(list_1, 6);
		combo_2.setLayoutData(fd_combo_2);

		Button btnHinzufgen_1 = new Button(grpAnnotationen, SWT.NONE);
		btnHinzufgen_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addToPfeilAuf();
			}
		});
		FormData fd_btnHinzufgen_1 = new FormData();
		fd_btnHinzufgen_1.top = new FormAttachment(list_1, -1, SWT.TOP);
		fd_btnHinzufgen_1.left = new FormAttachment(combo_2, 11);
		btnHinzufgen_1.setLayoutData(fd_btnHinzufgen_1);
		btnHinzufgen_1.setText("Hinzuf\u00FCgen");

		Label lblArrowDown = new Label(grpAnnotationen, SWT.NONE);
		lblArrowDown.setText("\u2193");
		lblArrowDown.setFont(SWTResourceManager.getFont("Segoe UI Symbol", 45,
				SWT.BOLD));
		FormData fd_lblArrowDown = new FormData();
		fd_lblArrowDown.top = new FormAttachment(lblArrowup, 0, SWT.TOP);
		fd_lblArrowDown.left = new FormAttachment(btnHinzufgen_1, 22);
		lblArrowDown.setLayoutData(fd_lblArrowDown);

		viewerListPfeilDown = new ListViewer(grpAnnotationen, SWT.BORDER
				| SWT.V_SCROLL);
		List list_2 = viewerListPfeilDown.getList();
		FormData fd_list_2 = new FormData();
		fd_list_2.bottom = new FormAttachment(lblArrowup, 0, SWT.BOTTOM);
		list_2.setLayoutData(fd_list_2);

		viewerComboPFeilDown = new ComboViewer(grpAnnotationen, SWT.NONE);
		Combo combo_3 = viewerComboPFeilDown.getCombo();
		FormData fd_combo_3 = new FormData();
		fd_combo_3.left = new FormAttachment(list_2, 17);
		fd_combo_3.top = new FormAttachment(list_1, 1, SWT.TOP);
		combo_3.setLayoutData(fd_combo_3);

		Button btnEntfernen_1 = new Button(grpAnnotationen, SWT.NONE);
		btnEntfernen_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeFromPfeilAb();

			}
		});
		FormData fd_btnEntfernen_1 = new FormData();
		fd_btnEntfernen_1.bottom = new FormAttachment(lblArrowup, 0, SWT.BOTTOM);
		fd_btnEntfernen_1.left = new FormAttachment(list_1, 6);
		btnEntfernen_1.setLayoutData(fd_btnEntfernen_1);
		btnEntfernen_1.setText("entfernen");

		Button btnHinzufgen_2 = new Button(grpAnnotationen, SWT.NONE);
		btnHinzufgen_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addToPfeilDown();
			}
		});
		FormData fd_btnHinzufgen_2 = new FormData();
		fd_btnHinzufgen_2.bottom = new FormAttachment(combo_2, 0, SWT.BOTTOM);
		fd_btnHinzufgen_2.left = new FormAttachment(combo_3, 6);
		btnHinzufgen_2.setLayoutData(fd_btnHinzufgen_2);
		btnHinzufgen_2.setText("hinzuf\u00FCgen");

		Button btnEntfernen_2 = new Button(grpAnnotationen, SWT.NONE);
		btnEntfernen_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeFromPfeilDown();
			}
		});
		fd_list_2.right = new FormAttachment(btnEntfernen_2, -6);
		FormData fd_btnEntfernen_2 = new FormData();
		fd_btnEntfernen_2.left = new FormAttachment(0, 514);
		fd_btnEntfernen_2.top = new FormAttachment(combo_3, 6);
		btnEntfernen_2.setLayoutData(fd_btnEntfernen_2);
		btnEntfernen_2.setText("entfernen");
		initViewer();
		return container;
	}

	private void initViewer() {
		viewerComboPFeilDown.setContentProvider(new ArrayContentProvider());
		viewerComboStartNichterminal
				.setContentProvider(new ArrayContentProvider());
		viewerComboPfeilUp.setContentProvider(new ArrayContentProvider());
		viewerComboZiel.setContentProvider(new ArrayContentProvider());
		viewerListAbbildungZiel.setContentProvider(new ArrayContentProvider());
		viewerListPfeilDown.setContentProvider(new ArrayContentProvider());
		viewerListPfeilUP.setContentProvider(new ArrayContentProvider());

		viewerComboPFeilDown.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Funktion f = (Funktion) element;
				return f.getName();
			}
		});
		viewerComboPfeilUp.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Funktion f = (Funktion) element;
				return f.getName();
			}
		});

		viewerComboStartNichterminal.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Nichterminal n = (Nichterminal) element;
				return n.getName();
			}
		});
		viewerComboZiel.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				TerminalNichtTerminal n = (TerminalNichtTerminal) element;
				return n.getName();
			}
		});

		viewerListAbbildungZiel.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				AnnotiertesTerminalNichtTerminal n = (AnnotiertesTerminalNichtTerminal) element;
				return "";
			}
		});
		viewerListPfeilDown.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Funktion f = (Funktion) element;
				return f.getName();
			}
		});
		viewerListPfeilUP.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Funktion f = (Funktion) element;
				return f.getName();
			}
		});
		viewerComboStartNichterminal
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						StructuredSelection selection = (StructuredSelection) viewerComboStartNichterminal
								.getSelection();
						if (selection.isEmpty())
							return;
						regel.setVon((Nichterminal) selection.getFirstElement());
					}
				});
		viewerListAbbildungZiel
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						StructuredSelection selection = (StructuredSelection) viewerComboStartNichterminal
								.getSelection();
						if (selection.isEmpty())
							return;
						regel.setVon((Nichterminal) selection.getFirstElement());
					}
				});

	}

	protected void removeFromPfeilDown() {
		// TODO Auto-generated method stub

	}

	protected void addToPfeilDown() {
		// TODO Auto-generated method stub

	}

	protected void removeFromPfeilAb() {
		// TODO Auto-generated method stub

	}

	protected void addToPfeilAuf() {
		// TODO Auto-generated method stub

	}

	protected void removeFromZiel() {
		// TODO Auto-generated method stub

	}

	protected void addToZiel() {
		// TODO Auto-generated method stub

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
		return new Point(801, 490);
	}
}
