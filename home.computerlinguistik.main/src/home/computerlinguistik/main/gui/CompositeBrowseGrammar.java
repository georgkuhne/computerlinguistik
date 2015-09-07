package home.computerlinguistik.main.gui;

import home.computerlinguistik.main.MainView;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.List;

import model.LexikalischFunktionaleGrammatik;
import model.Lexikon;
import model.ModelFactory;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.xml.sax.ext.LexicalHandler;

public class CompositeBrowseGrammar extends Composite {
	MainView mainView;
	private TableViewer viewer;
	private Table table;
	private Button b_open;
	private Button b_new;
	private Button btnLschen;

	public CompositeBrowseGrammar(Composite parent, int style,
			MainView mainView1) {
		super(parent, style);
		// define the TableViewer
		mainView = mainView1;
		viewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);

		// create the columns
		// not yet implemented
		createColumns(viewer);
		this.setLayout(new FormLayout());
		table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		Composite c_buttons = new Composite(this, SWT.None);
		c_buttons.setLayout(new RowLayout(SWT.HORIZONTAL));
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection S = (IStructuredSelection) viewer
						.getSelection();
				if (S.getFirstElement() != null) {
					b_open.setEnabled(true);
				} else {
					b_open.setEnabled(false);
				}
			}
		});
		b_open = new Button(c_buttons, SWT.None);
		b_open.setText("Öffnen");
		b_open.setEnabled(false);
		b_open.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				openWbs();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		b_new = new Button(c_buttons, SWT.None);
		b_new.setText("Neu");
		b_new.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				createNewWBS();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		FormData fdviewer = new FormData();
		fdviewer.top = new FormAttachment(0);
		fdviewer.bottom = new FormAttachment(100);
		fdviewer.left = new FormAttachment(0);
		fdviewer.right = new FormAttachment(90);

		FormData fdbutton = new FormData();
		fdbutton.top = new FormAttachment(0);
		fdbutton.bottom = new FormAttachment(100);
		fdbutton.left = new FormAttachment(table);
		fdbutton.right = new FormAttachment(100);
		table.setLayoutData(fdviewer);
		c_buttons.setLayoutData(fdbutton);

		btnLschen = new Button(c_buttons, SWT.NONE);
		btnLschen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				delete();
			}
		});
		btnLschen.setText("l\u00F6schen");
		refreshTable();

	}

	protected void delete() {
		IStructuredSelection s = (IStructuredSelection) viewer.getSelection();
		LexikalischFunktionaleGrammatik wb = (LexikalischFunktionaleGrammatik) s
				.getFirstElement();
		PersistenceUtility.getINSTANCE().delete(wb);
		refreshTable();
	}

	protected void openWbs() {
		IStructuredSelection s = (IStructuredSelection) viewer.getSelection();
		LexikalischFunktionaleGrammatik wb = (LexikalischFunktionaleGrammatik) s
				.getFirstElement();
		mainView.openGrammar(wb.getID());
	}

	protected void createNewWBS() {
		DiaLogCreateNewGrammar dialog = new DiaLogCreateNewGrammar();
		if (dialog.open() == DiaLogCreateNewGrammar.OK) {
			String grammarname = dialog.getWBSName();
			LexikalischFunktionaleGrammatik wissensbasis = ModelFactory.eINSTANCE
					.createLexikalischFunktionaleGrammatik();
			Lexikon lexikon=ModelFactory.eINSTANCE.createLexikon();
			wissensbasis.setLexikon(lexikon);
			wissensbasis.setName(grammarname);
			wissensbasis.setGrammatik(ModelFactory.eINSTANCE.createGrammatik());
			PersistenceUtility.getINSTANCE().save(wissensbasis);
			refreshTable();
		}
	}

	private void createColumns(TableViewer viewer) {
		TableViewerColumn col = createTableViewerColumn("ID", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				LexikalischFunktionaleGrammatik wb = (LexikalischFunktionaleGrammatik) element;
				return "" + wb.getID();

			}
		});
		col = createTableViewerColumn("Name", 100, 0);
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				LexikalischFunktionaleGrammatik wb = (LexikalischFunktionaleGrammatik) element;
				return wb.getName();

			}
		});
	}

	private TableViewerColumn createTableViewerColumn(String title, int bound,
			final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
				SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}

	public void refreshTable() {
		List list = PersistenceUtility.getINSTANCE().getAll(
				"LexikalischFunktionaleGrammatik", null, null);
		viewer.setInput(list);
	}
}
