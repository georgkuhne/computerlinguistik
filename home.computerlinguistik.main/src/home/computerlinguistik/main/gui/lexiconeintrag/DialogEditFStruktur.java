package home.computerlinguistik.main.gui.lexiconeintrag;

import java.util.List;

import model.AttributWertePaar;
import model.FStruktur;
import model.Funktion;
import model.LexikalischFunktionaleGrammatik;
import model.Merkmal;
import model.MerkmalFunktion;
import model.ModelFactory;
import model.WertTyp;

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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class DialogEditFStruktur extends Dialog {
	private Table table;
	private LexikalischFunktionaleGrammatik grammar;
	private FStruktur fstruktur;
	private TableViewer tableViewer;
	private ComboViewer comboViewerMerkmal;
	private ComboViewer comboViewerWert;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogEditFStruktur(Shell parentShell) {
		super(parentShell);
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

		tableViewer = new TableViewer(container, SWT.BORDER
				| SWT.FULL_SELECTION);
		tableViewer.setContentProvider(new ArrayContentProvider());
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100, -2);
		fd_table.left = new FormAttachment(0, 10);
		fd_table.right = new FormAttachment(0, 213);
		fd_table.top = new FormAttachment(0, 10);
		table.setLayoutData(fd_table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnMerkmal = tableViewerColumn.getColumn();
		tblclmnMerkmal.setWidth(100);
		tblclmnMerkmal.setText("Merkmal");
		tableViewerColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributWertePaar paar = (AttributWertePaar) element;
				if (paar.getMerkmal() == null) {
					return paar.getFunktion().getName();
				}
				return paar.getMerkmal().getName();
			}
		});
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(
				tableViewer, SWT.NONE);
		TableColumn tblclmnWert = tableViewerColumn_1.getColumn();
		tblclmnWert.setWidth(100);
		tblclmnWert.setText("Wert");
		tableViewerColumn_1.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AttributWertePaar paar = (AttributWertePaar) element;
				if (paar.getMerkmal() == null) {
					return paar.getFunktion().getName();
				}
				return paar.getMerkmalsWert();
			}
		});

		comboViewerMerkmal = new ComboViewer(container, SWT.NONE);
		comboViewerMerkmal.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {

				return ((Merkmal) element).getName();
			}
		});
		comboViewerMerkmal
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

						merkmal = (Merkmal) mf;
						comboViewerWert.setInput(merkmal.getMoeglicheWerte());
						comboViewerWert.refresh();

					}
				});
		comboViewerMerkmal.setContentProvider(new ArrayContentProvider());
		comboViewerMerkmal.setInput(grammar.getMerkmale());
		Combo combo = comboViewerMerkmal.getCombo();
		FormData fd_combo = new FormData();
		fd_combo.width = 50;
		fd_combo.top = new FormAttachment(0, 34);
		fd_combo.left = new FormAttachment(table, 18);
		combo.setLayoutData(fd_combo);

		comboViewerWert = new ComboViewer(container, SWT.NONE);
		comboViewerWert.setContentProvider(new ArrayContentProvider());
		comboViewerWert.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {

				return (String) element;
			}
		});
		Combo combo_1 = comboViewerWert.getCombo();
		FormData fd_combo_1 = new FormData();
		fd_combo_1.width = 50;
		fd_combo_1.top = new FormAttachment(combo, 0, SWT.TOP);
		fd_combo_1.left = new FormAttachment(combo, 32);
		combo_1.setLayoutData(fd_combo_1);

		Label lblMerkmal = new Label(container, SWT.NONE);
		FormData fd_lblMerkmal = new FormData();
		fd_lblMerkmal.top = new FormAttachment(table, 0, SWT.TOP);
		fd_lblMerkmal.left = new FormAttachment(table, 31);
		lblMerkmal.setLayoutData(fd_lblMerkmal);
		lblMerkmal.setText("Merkmal");

		Label lblWert = new Label(container, SWT.NONE);
		FormData fd_lblWert = new FormData();
		fd_lblWert.top = new FormAttachment(table, 0, SWT.TOP);
		fd_lblWert.left = new FormAttachment(lblMerkmal, 75);
		lblWert.setLayoutData(fd_lblWert);
		lblWert.setText("Wert");

		Button btnHinzufgen = new Button(container, SWT.NONE);
		btnHinzufgen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addMerkmalFKTToFstruktur();
			}
		});
		FormData fd_btnHinzufgen = new FormData();
		fd_btnHinzufgen.top = new FormAttachment(combo, 15);
		fd_btnHinzufgen.left = new FormAttachment(combo, 0, SWT.LEFT);
		btnHinzufgen.setLayoutData(fd_btnHinzufgen);
		btnHinzufgen.setText("hinzuf\u00FCgen");

		Button btnEntfernen = new Button(container, SWT.NONE);
		btnEntfernen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				entfernenAttributWertpaar();
			}
		});
		FormData fd_btnEntfernen = new FormData();
		fd_btnEntfernen.top = new FormAttachment(btnHinzufgen, 21);
		fd_btnEntfernen.left = new FormAttachment(combo, 0, SWT.LEFT);
		btnEntfernen.setLayoutData(fd_btnEntfernen);
		btnEntfernen.setText("entfernen");
		tableViewer.setInput(fstruktur.getAttributWertePaare());
		return container;
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
		return new Point(505, 300);
	}

	protected void addMerkmalFKTToFstruktur() {
		if (tableViewer.getInput() == null) {
			return;
		}
		StructuredSelection selection = (StructuredSelection) comboViewerMerkmal
				.getSelection();
		if (selection.isEmpty())
			return;
		MerkmalFunktion mf = (MerkmalFunktion) selection.getFirstElement();
		AttributWertePaar wertpaar = ModelFactory.eINSTANCE
				.createAttributWertePaar();
		if (mf instanceof Merkmal) {
			StructuredSelection wertselection = (StructuredSelection) comboViewerWert
					.getSelection();
			if (wertselection.isEmpty())
				return;
			String wert = (String) wertselection.getFirstElement();
			wertpaar.setMerkmal((Merkmal) mf);
			wertpaar.setWertTyp(WertTyp.MERKMAL);
			wertpaar.setMerkmalsWert(wert);
			List list = (List) tableViewer.getInput();
			list.add(wertpaar);
			tableViewer.refresh();

		} else {
			wertpaar.setFunktionsWert(ModelFactory.eINSTANCE.createFStruktur());
			wertpaar.setFunktion((Funktion) mf);
			wertpaar.setWertTyp(WertTyp.FUNKTION);
			List list = (List) tableViewer.getInput();
			list.add(wertpaar);
			tableViewer.refresh();

			tableViewer.add(wertpaar);
			tableViewer.refresh();
		}
	}

	protected void entfernenAttributWertpaar() {
		StructuredSelection selection = (StructuredSelection) tableViewer
				.getSelection();
		if (selection.isEmpty())
			return;
		tableViewer.remove(selection.getFirstElement());

	}

	public void setFStruktur(FStruktur fstruktur,
			LexikalischFunktionaleGrammatik grammar) {
		this.grammar = grammar;
		this.fstruktur = fstruktur;
	}
}
