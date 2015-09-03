package home.computerlinguistik.main.gui.lexiconeintrag;

import java.util.ArrayList;

import model.AttributWertePaar;
import model.FStruktur;
import model.Funktion;
import model.LexikalischFunktionaleGrammatik;
import model.LexikonEintrag;
import model.Merkmal;
import model.MerkmalFunktion;
import model.ModelFactory;
import model.Terminal;
import model.WertTyp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DialogCreateNewOrEditLexiconEintrag extends Dialog {
	private Text t_name;
	private Table table;
	private TableViewer viewerTableFstruktur;
	private ComboViewer viewerComboTerminal;
	private LexikalischFunktionaleGrammatik grammar;
	private boolean editmode = false;
	private LexikonEintrag eintrag;
	private ComboViewer viewerComboAuspraegungSelector;
	private Button btnHinzufgen;
	private ArrayList<FStruktur> auspraegungen;
	private ComboViewer viewerComboMerkmalFKT;
	private ComboViewer viewerComboWertFKT;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public DialogCreateNewOrEditLexiconEintrag(Shell parentShell,
			LexikalischFunktionaleGrammatik grammar1) {
		super(parentShell);
		grammar = grammar1;
		eintrag = ModelFactory.eINSTANCE.createLexikonEintrag();
		auspraegungen = new ArrayList(eintrag.getAuspraegungen());

	}

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogCreateNewOrEditLexiconEintrag(Shell parentShell,
			LexikalischFunktionaleGrammatik grammar1, LexikonEintrag eintrag1) {
		super(parentShell);
		grammar = grammar1;
		editmode = true;
		eintrag = eintrag1;
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
		fd_lblName.top = new FormAttachment(0, 10);
		fd_lblName.left = new FormAttachment(0, 10);

		lblName.setLayoutData(fd_lblName);
		lblName.setText("Name:");

		t_name = new Text(container, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(0, 10);
		fd_text.left = new FormAttachment(20);
		fd_text.width = 300;
		t_name.setLayoutData(fd_text);

		Label lblTerminal = new Label(container, SWT.NONE);
		FormData fd_lblTerminal = new FormData();
		fd_lblTerminal.top = new FormAttachment(lblName, 20);
		fd_lblTerminal.left = new FormAttachment(0, 10);

		lblTerminal.setLayoutData(fd_lblTerminal);
		lblTerminal.setText("Terminal:");

		viewerComboTerminal = new ComboViewer(container, SWT.NONE);
		Combo comboTerminal = viewerComboTerminal.getCombo();
		FormData fd_comboTerminal = new FormData();
		fd_comboTerminal.top = new FormAttachment(lblName, 20);
		fd_comboTerminal.left = new FormAttachment(20);
		fd_comboTerminal.width = 200;
		comboTerminal.setLayoutData(fd_comboTerminal);

		Group grpFstruktur = new Group(container, SWT.NONE);
		grpFstruktur.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD
				| SWT.ITALIC));
		grpFstruktur.setText("F-Struktur");
		grpFstruktur.setLayout(new FormLayout());
		FormData fd_grpFstruktur = new FormData();
		fd_grpFstruktur.top = new FormAttachment(lblTerminal, 30);
		fd_grpFstruktur.bottom = new FormAttachment(100);
		fd_grpFstruktur.right = new FormAttachment(100);
		fd_grpFstruktur.left = new FormAttachment(0, 10);
		grpFstruktur.setLayoutData(fd_grpFstruktur);

		viewerComboAuspraegungSelector = new ComboViewer(grpFstruktur, SWT.NONE);
		Combo comboAuspraegung = viewerComboAuspraegungSelector.getCombo();
		FormData fd_comboAuspraegung = new FormData();
		comboAuspraegung.setLayoutData(fd_comboAuspraegung);

		Label lblAusprgung = new Label(grpFstruktur, SWT.NONE);
		fd_comboAuspraegung.left = new FormAttachment(lblAusprgung, 19);
		fd_comboAuspraegung.top = new FormAttachment(lblAusprgung, -3, SWT.TOP);
		FormData fd_lblAusprgung = new FormData();
		fd_lblAusprgung.top = new FormAttachment(0, 10);
		fd_lblAusprgung.left = new FormAttachment(0);
		lblAusprgung.setLayoutData(fd_lblAusprgung);
		lblAusprgung.setText("Auspr\u00E4gung:");

		btnHinzufgen = new Button(grpFstruktur, SWT.NONE);
		btnHinzufgen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addAuspraegung();
			}
		});
		fd_comboAuspraegung.right = new FormAttachment(100, -425);
		FormData fd_btnHinzufgen = new FormData();
		fd_btnHinzufgen.top = new FormAttachment(comboAuspraegung, -2, SWT.TOP);
		fd_btnHinzufgen.left = new FormAttachment(comboAuspraegung, 25);
		btnHinzufgen.setLayoutData(fd_btnHinzufgen);
		btnHinzufgen.setText("hinzuf\u00FCgen");

		Button btnEntfernen = new Button(grpFstruktur, SWT.NONE);
		FormData fd_btnEntfernen = new FormData();
		fd_btnEntfernen.top = new FormAttachment(comboAuspraegung, -2, SWT.TOP);
		fd_btnEntfernen.left = new FormAttachment(btnHinzufgen, 23);
		btnEntfernen.setLayoutData(fd_btnEntfernen);
		btnEntfernen.setText("entfernen");

		viewerTableFstruktur = new TableViewer(grpFstruktur, SWT.BORDER
				| SWT.FULL_SELECTION);
		table = viewerTableFstruktur.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		FormData fd_table = new FormData();
		fd_table.right = new FormAttachment(btnHinzufgen, 0, SWT.RIGHT);
		fd_table.top = new FormAttachment(comboAuspraegung, 54);
		fd_table.bottom = new FormAttachment(100, -15);
		fd_table.left = new FormAttachment(0, 16);
		table.setLayoutData(fd_table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				viewerTableFstruktur, SWT.NONE);
		TableColumn tblclmnMerkmalfunktion = tableViewerColumn.getColumn();
		tblclmnMerkmalfunktion.setWidth(143);
		tblclmnMerkmalfunktion.setText("Merkmal/Funktion");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				viewerTableFstruktur, SWT.NONE);
		TableColumn tblclmnWert = tableViewerColumn_1.getColumn();
		tblclmnWert.setWidth(100);
		tblclmnWert.setText("Wert");

		Label label = new Label(grpFstruktur, SWT.SEPARATOR | SWT.HORIZONTAL);
		FormData fd_label = new FormData();
		fd_label.bottom = new FormAttachment(comboAuspraegung, 38, SWT.BOTTOM);
		fd_label.right = new FormAttachment(0, 593);
		fd_label.top = new FormAttachment(comboAuspraegung, 15);
		fd_label.left = new FormAttachment(0, 4);
		label.setLayoutData(fd_label);

		Label lblNewLabel = new Label(grpFstruktur, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(label, 1);
		fd_lblNewLabel.left = new FormAttachment(btnEntfernen, 0, SWT.LEFT);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Merkmal/FKT");

		Label lblWert = new Label(grpFstruktur, SWT.NONE);
		FormData fd_lblWert = new FormData();
		fd_lblWert.bottom = new FormAttachment(lblNewLabel, 0, SWT.BOTTOM);
		fd_lblWert.left = new FormAttachment(lblNewLabel, 57);
		lblWert.setLayoutData(fd_lblWert);
		lblWert.setText("Wert");

		viewerComboMerkmalFKT = new ComboViewer(grpFstruktur, SWT.NONE);
		Combo comboMerkmalFKT = viewerComboMerkmalFKT.getCombo();
		FormData fd_comboMerkmalFKT = new FormData();
		fd_comboMerkmalFKT.top = new FormAttachment(lblNewLabel);
		fd_comboMerkmalFKT.left = new FormAttachment(btnEntfernen, 0, SWT.LEFT);
		comboMerkmalFKT.setLayoutData(fd_comboMerkmalFKT);
		viewerComboWertFKT = new ComboViewer(grpFstruktur, SWT.NONE);
		Combo comboWert = viewerComboWertFKT.getCombo();
		FormData fd_comboWert = new FormData();
		fd_comboWert.top = new FormAttachment(table, 0, SWT.TOP);
		fd_comboWert.left = new FormAttachment(comboMerkmalFKT, 16);
		comboWert.setLayoutData(fd_comboWert);

		Button btnHinzufgen_1 = new Button(grpFstruktur, SWT.NONE);
		btnHinzufgen_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addMerkmalFKTToFstruktur();
			}
		});
		FormData fd_btnHinzufgen_1 = new FormData();
		fd_btnHinzufgen_1.top = new FormAttachment(table, 0, SWT.TOP);
		fd_btnHinzufgen_1.left = new FormAttachment(comboWert, 12);
		btnHinzufgen_1.setLayoutData(fd_btnHinzufgen_1);
		btnHinzufgen_1.setText("hinzuf\u00FCgen");

		Button btnEntfernen_1 = new Button(grpFstruktur, SWT.NONE);
		FormData fd_btnEntfernen_1 = new FormData();
		fd_btnEntfernen_1.top = new FormAttachment(comboMerkmalFKT, 6);
		fd_btnEntfernen_1.right = new FormAttachment(lblNewLabel, 0, SWT.RIGHT);
		btnEntfernen_1.setLayoutData(fd_btnEntfernen_1);
		btnEntfernen_1.setText("entfernen");
		initViewer();
		return container;
	}

	protected void addMerkmalFKTToFstruktur() {
		StructuredSelection selection = (StructuredSelection) viewerComboMerkmalFKT
				.getSelection();
		if (selection.isEmpty())
			return;
		MerkmalFunktion mf = (MerkmalFunktion) selection.getFirstElement();
		AttributWertePaar wertpar = ModelFactory.eINSTANCE
				.createAttributWertePaar();
		if (mf instanceof Merkmal) {

		} else {
			wertpar.setWertTyp(WertTyp.FUNKTION);
			wertpar.setFunktion((Funktion) mf);
			EList fstruktur = (EList) viewerTableFstruktur.getInput();
			fstruktur.add(wertpar);
			viewerTableFstruktur.refresh();
		}
	}

	protected void addAuspraegung() {
		auspraegungen.add(ModelFactory.eINSTANCE.createFStruktur());
		viewerComboAuspraegungSelector.refresh();
		viewerComboAuspraegungSelector.getCCombo().select(
				auspraegungen.size() - 1);
		viewerTableFstruktur
				.setInput(auspraegungen.get(auspraegungen.size() - 1));
	}

	private void initViewer() {
		// Set ArrayContentProvider to viewers
		viewerComboAuspraegungSelector
				.setContentProvider(new ArrayContentProvider());
		viewerComboTerminal.setContentProvider(new ArrayContentProvider());
		viewerTableFstruktur.setContentProvider(new ArrayContentProvider());
		viewerComboMerkmalFKT.setContentProvider(new ArrayContentProvider());
		viewerComboWertFKT.setContentProvider(new ArrayContentProvider());

		// set LabelProvider to viewers
		viewerComboMerkmalFKT.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				MerkmalFunktion m = (MerkmalFunktion) element;
				return m.getName();
			}
		});
		viewerComboWertFKT.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {

				return (String) element;
			}
		});
		viewerComboAuspraegungSelector.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				FStruktur fs = (FStruktur) element;

				return "Auspraegung" + auspraegungen.indexOf(fs);
			}
		});

		viewerComboTerminal.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				Terminal terminal = (Terminal) element;
				return terminal.getName();
			}
		});
		TableViewerColumn col = createTableViewerColumn("Merkmal/Funktion", 50,
				0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributWertePaar paar = (AttributWertePaar) element;
				return paar.getMerkmal().getName();
			}
		});

		col = createTableViewerColumn("Wert", 50, 1);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributWertePaar paar = (AttributWertePaar) element;
				int type = paar.getWertTyp().getValue();
				String returnwert = "";
				switch (type) {
				case WertTyp.FUNKTION_VALUE:
					break;
				case WertTyp.MERKMAL_VALUE:
					returnwert = paar.getMerkmalsWert();
					break;
				default:
					break;
				}
				return returnwert;
			}
		});

		viewerTableFstruktur.getTable().setHeaderVisible(true);
		viewerComboTerminal.setInput(grammar.getGrammatik().getTerminale());
		viewerComboAuspraegungSelector.setInput(auspraegungen);
		if (auspraegungen.size() > 0) {
			viewerComboAuspraegungSelector.getCombo().select(0);
			viewerTableFstruktur.setInput(auspraegungen.get(0)
					.getAttributWertePaare());
			viewerTableFstruktur.refresh();
		}
		viewerComboMerkmalFKT
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						StructuredSelection selection = (StructuredSelection) event
								.getSelection();
						if (selection.isEmpty())
							return;
						MerkmalFunktion mf = (MerkmalFunktion) selection
								.getFirstElement();
						Merkmal merkmal;
						if (mf instanceof Funktion) {
							viewerComboWertFKT
									.setInput(new ArrayList<String>());
							viewerComboWertFKT.refresh();
							return;
						} else

							merkmal = (Merkmal) mf;
						viewerComboWertFKT.setInput(new ArrayList<String>(
								merkmal.getMoeglicheWerte()));
						viewerComboWertFKT.refresh();

					}
				});
		viewerComboAuspraegungSelector
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						StructuredSelection selection = (StructuredSelection) event
								.getSelection();
						if (selection.isEmpty())
							return;
						viewerTableFstruktur.setInput(((FStruktur) selection
								.getFirstElement()).getAttributWertePaare());
						viewerTableFstruktur.refresh();

					}
				});
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
		return new Point(619, 466);
	}

	public static void test() {
		DialogCreateNewOrEditLexiconEintrag dia = new DialogCreateNewOrEditLexiconEintrag(
				Display.getDefault().getActiveShell(),
				ModelFactory.eINSTANCE.createLexikalischFunktionaleGrammatik());
		dia.open();
	}

	protected TableViewerColumn createTableViewerColumn(String title,
			int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(
				viewerTableFstruktur, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}
}
