package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.MainView;
import home.computerlinguistik.main.gui.GrammarSelectedListener;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public abstract class AbstractCompositeBrowse extends Composite implements
		GrammarSelectedListener {
	private Table table;
	TableViewer tableViewer;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public AbstractCompositeBrowse(Composite parent, int style) {
		super(parent, style);
		setLayout(new FormLayout());
		Composite composite = new Composite(this, SWT.NONE);
		RowLayout rl_composite = new RowLayout(SWT.HORIZONTAL);
		rl_composite.marginLeft = 10;
		composite.setLayout(rl_composite);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(100);
		fd_composite.right = new FormAttachment(100);
		fd_composite.top = new FormAttachment(10);
		fd_composite.width = 100;
		composite.setLayoutData(fd_composite);

		Button btnNeu = new Button(composite, SWT.NONE);
		btnNeu.setLayoutData(new RowData(70, SWT.DEFAULT));
		btnNeu.setText("Neu");
		btnNeu.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				createNew();
				super.widgetSelected(e);
			}
		});

		Button btnBearbeiten = new Button(composite, SWT.NONE);
		btnBearbeiten.setLayoutData(new RowData(70, SWT.DEFAULT));
		btnBearbeiten.setText("Bearbeiten");
		btnBearbeiten.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				edit();
				super.widgetSelected(e);
			}
		});

		Button btnLschen = new Button(composite, SWT.NONE);
		btnLschen.setLayoutData(new RowData(70, SWT.DEFAULT));
		btnLschen.setText("L\u00F6schen");
		btnLschen.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				delete();

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		FormData fd_table = new FormData();
		fd_table.bottom = new FormAttachment(100);
		fd_table.right = new FormAttachment(composite);
		fd_table.top = new FormAttachment(0);
		fd_table.left = new FormAttachment(0);
		table.setLayoutData(fd_table);
		MainView.getInstance().addGrammarSelectedListener(this);
		configureViewer();
	}

	protected abstract void delete();

	protected abstract void edit();

	protected abstract void createNew();

	protected abstract void configureViewer();

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	protected TableViewerColumn createTableViewerColumn(String title,
			int bound, final int colNumber) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(false);
		column.setMoveable(false);
		return viewerColumn;
	}
}
