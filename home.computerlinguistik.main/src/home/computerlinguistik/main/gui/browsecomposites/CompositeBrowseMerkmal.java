package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.funktion.DialogCreateNewOrEditFunktion;
import home.computerlinguistik.main.gui.merkmal.DialogCreateNewOrEditMerkmal;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.Iterator;
import java.util.List;

import model.LexikalischFunktionaleGrammatik;
import model.Merkmal;
import model.ModelFactory;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseMerkmal extends AbstractCompositeBrowse {
	long grammarid;

	public CompositeBrowseMerkmal(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
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
		Merkmal merkmal = ((Merkmal) structuredSelection.getFirstElement());
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(merkmal);
		LexikalischFunktionaleGrammatik grammar = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		grammar.getMerkmale().remove(merkmal);
		session.delete(merkmal);
		session.flush();
		session.close();
		refreshTable();
	}

	@Override
	protected void edit() {
		ISelection selected = tableViewer.getSelection();
		StructuredSelection structuredSelection = (StructuredSelection) selected;
		Merkmal merkmal = (Merkmal) structuredSelection.getFirstElement();
		if (merkmal == null)
			return;
		DialogCreateNewOrEditMerkmal dialog = new DialogCreateNewOrEditMerkmal(
				Display.getCurrent().getActiveShell(), merkmal);
		if (dialog.open() == DialogCreateNewOrEditFunktion.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();

			if (dialog.getName().trim().length() != 0) {
				merkmal.setName(dialog.getName());
				merkmal.getMoeglicheWerte().clear();
				merkmal.getMoeglicheWerte().addAll(dialog.getWerte());

				session.saveOrUpdate(merkmal);
				session.flush();
				session.close();
				refreshTable();
			}
		}
	}

	@Override
	protected void createNew() {
		DialogCreateNewOrEditMerkmal dialog = new DialogCreateNewOrEditMerkmal(
				Display.getCurrent().getActiveShell());
		if (dialog.open() == DialogCreateNewOrEditMerkmal.OK) {
			Session session = PersistenceUtility.getINSTANCE().createSession();
			if (dialog.getName().trim().length() != 0) {
				Merkmal merkmal = ModelFactory.eINSTANCE.createMerkmal();
				merkmal.setName(dialog.getName());
				LexikalischFunktionaleGrammatik grammar = PersistenceUtility
						.getLexikalischFunktionaleGrammatikById(grammarid,
								session);
				merkmal.getMoeglicheWerte().addAll(dialog.getWerte());
				grammar.getMerkmale().add(merkmal);

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
				Merkmal wb = (Merkmal) element;
				return "" + wb.getName(); //$NON-NLS-1$

			}
		});
		col = createTableViewerColumn("Werte", 500, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				Merkmal wb = (Merkmal) element;
				String ret = "";
				for (Iterator iterator = wb.getMoeglicheWerte().iterator(); iterator
						.hasNext();) {
					String type = (String) iterator.next();

					ret = ret + type;
					if (iterator.hasNext())
						ret = ret + "|";
				}
				return ret;

			}
		});
	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		List list = wb.getMerkmale();
		tableViewer.setInput(list);
		session.flush();
		session.close();
	}
}
