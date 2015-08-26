package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.nichtterminal.DialogCreateNewOrEditNichtTerminal;
import home.computerlinguistik.main.gui.terminal.DialogCreateNewOrEditTerminal;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.List;

import model.LexikalischFunktionaleGrammatik;
import model.ModelFactory;
import model.Nichterminal;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseNichterminale extends AbstractCompositeBrowse {
	long grammarid;
	Nichterminal startSymbol;

	public CompositeBrowseNichterminale(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public void updateGrammarSelection(long grammarId) {
		grammarid = grammarId;
		refreshTable();
	}

	@Override
	protected void delete() {
		ISelection selected = tableViewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		Nichterminal nichtterminal = ((Nichterminal) structuredSelection
				.getFirstElement());
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(nichtterminal);
		LexikalischFunktionaleGrammatik grammar = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		grammar.getGrammatik().getNichtTerminale().remove(nichtterminal);
		if (startSymbol != null && startSymbol.equals(nichtterminal))
			grammar.getGrammatik().setS0(null);

		session.delete(nichtterminal);
		session.flush();
		session.close();
		refreshTable();

	}

	@Override
	protected void edit() {
		ISelection selected = tableViewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		Nichterminal nichtterminal = ((Nichterminal) structuredSelection
				.getFirstElement());
		if (nichtterminal == null)
			return;
		boolean isStart = false;
		if (startSymbol != null && startSymbol.equals(nichtterminal))
			isStart = true;
		DialogCreateNewOrEditNichtTerminal dialog = new DialogCreateNewOrEditNichtTerminal(
				Display.getCurrent().getActiveShell(), nichtterminal, isStart);
		if (dialog.open() == DialogCreateNewOrEditTerminal.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();

			if (dialog.getName().trim().length() != 0) {
				nichtterminal.setName(dialog.getName());
				if (dialog.isStart()) {
					LexikalischFunktionaleGrammatik grammar = PersistenceUtility
							.getLexikalischFunktionaleGrammatikById(grammarid,
									session);
					grammar.getGrammatik().setS0(nichtterminal);
				}
				session.saveOrUpdate(nichtterminal);
				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void createNew() {
		DialogCreateNewOrEditNichtTerminal dialog = new DialogCreateNewOrEditNichtTerminal(
				Display.getCurrent().getActiveShell());
		if (dialog.open() == DialogCreateNewOrEditNichtTerminal.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();
			if (dialog.getName().trim().length() != 0) {
				Nichterminal nichtterminal = ModelFactory.eINSTANCE
						.createNichterminal();
				nichtterminal.setName(dialog.getName());
				LexikalischFunktionaleGrammatik grammar = PersistenceUtility
						.getLexikalischFunktionaleGrammatikById(grammarid,
								session);
				grammar.getGrammatik().getNichtTerminale().add(nichtterminal);
				if (dialog.isStart()) {
					grammar.getGrammatik().setS0(nichtterminal);
				}
				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void configureViewer() {
		TableViewerColumn col = createTableViewerColumn("   ", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				Nichterminal wb = (Nichterminal) element;
				if (startSymbol != null && startSymbol.equals(wb))
					return "S0"; //$NON-NLS-1$
				return "";
			}
		});
		col = createTableViewerColumn("Name", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Nichterminal wb = (Nichterminal) element;
				return "" + wb.getName(); //$NON-NLS-1$

			}
		});
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);

		List list = wb.getGrammatik().getNichtTerminale();
		startSymbol = wb.getGrammatik().getS0();
		tableViewer.setInput(list);
		session.flush();
		session.close();
	}
}
