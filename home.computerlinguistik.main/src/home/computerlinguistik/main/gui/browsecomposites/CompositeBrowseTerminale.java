package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.terminal.DialogCreateNewOrEditTerminal;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.List;

import model.LexikalischFunktionaleGrammatik;
import model.ModelFactory;
import model.Terminal;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseTerminale extends AbstractCompositeBrowse {
	long grammarid;

	public CompositeBrowseTerminale(Composite parent, int style) {
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
		Terminal terminal = ((Terminal) structuredSelection.getFirstElement());
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(terminal);
		LexikalischFunktionaleGrammatik grammar = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		grammar.getGrammatik().getTerminale().remove(terminal);
		session.delete(terminal);
		session.flush();
		session.close();
		refreshTable();
	}

	@Override
	protected void edit() {
		ISelection selected = tableViewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		Terminal terminal = ((Terminal) structuredSelection.getFirstElement());
		if (terminal == null)
			return;
		DialogCreateNewOrEditTerminal dialog = new DialogCreateNewOrEditTerminal(
				Display.getCurrent().getActiveShell(), terminal);
		if (dialog.open() == DialogCreateNewOrEditTerminal.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();

			if (dialog.getName().trim().length() != 0) {
				terminal.setName(dialog.getName());
				session.saveOrUpdate(terminal);
				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void createNew() {
		DialogCreateNewOrEditTerminal dialog = new DialogCreateNewOrEditTerminal(
				Display.getCurrent().getActiveShell());
		if (dialog.open() == DialogCreateNewOrEditTerminal.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();
			if (dialog.getName().trim().length() != 0) {
				Terminal terminal = ModelFactory.eINSTANCE.createTerminal();
				terminal.setName(dialog.getName());
				LexikalischFunktionaleGrammatik grammar = PersistenceUtility
						.getLexikalischFunktionaleGrammatikById(grammarid,
								session);
				grammar.getGrammatik().getTerminale().add(terminal);

				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void configureViewer() {
		TableViewerColumn col = createTableViewerColumn("Name", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Terminal wb = (Terminal) element;
				return "" + wb.getName(); //$NON-NLS-1$

			}
		});
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		List list = wb.getGrammatik().getTerminale();
		tableViewer.setInput(list);
		session.flush();
		session.close();
	}
}
