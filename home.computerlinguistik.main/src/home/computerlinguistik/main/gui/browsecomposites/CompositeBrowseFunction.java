package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.funktion.DialogCreateNewOrEditFunktion;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.List;

import model.Funktion;
import model.LexikalischFunktionaleGrammatik;
import model.ModelFactory;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseFunction extends AbstractCompositeBrowse {
	long grammarid;

	public CompositeBrowseFunction(Composite parent, int style) {
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
		Funktion funktion = ((Funktion) structuredSelection.getFirstElement());
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(funktion);
		LexikalischFunktionaleGrammatik grammar = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		grammar.getFunktionen().remove(funktion);
		session.delete(funktion);
		session.flush();
		session.close();
		refreshTable();
	}

	@Override
	protected void createNew() {
		DialogCreateNewOrEditFunktion dialog = new DialogCreateNewOrEditFunktion(
				Display.getCurrent().getActiveShell());
		if (dialog.open() == DialogCreateNewOrEditFunktion.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();
			if (dialog.getName().trim().length() != 0) {
				Funktion funktion = ModelFactory.eINSTANCE.createFunktion();
				funktion.setName(dialog.getName());
				LexikalischFunktionaleGrammatik grammar = PersistenceUtility
						.getLexikalischFunktionaleGrammatikById(grammarid,
								session);
				grammar.getFunktionen().add(funktion);

				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void edit() {
		ISelection selected = tableViewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		Funktion funktion = ((Funktion) structuredSelection.getFirstElement());
		if (funktion == null)
			return;
		DialogCreateNewOrEditFunktion dialog = new DialogCreateNewOrEditFunktion(
				Display.getCurrent().getActiveShell(), funktion);
		if (dialog.open() == DialogCreateNewOrEditFunktion.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();

			if (dialog.getName().trim().length() != 0) {
				funktion.setName(dialog.getName());
				session.saveOrUpdate(funktion);
				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		List list = wb.getFunktionen();
		tableViewer.setInput(list);
		session.flush();
		session.close();
	}

	@Override
	protected void configureViewer() {
		TableViewerColumn col = createTableViewerColumn("Name", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Funktion wb = (Funktion) element;
				return "" + wb.getName(); //$NON-NLS-1$

			}
		});
	}

}
