package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.lexiconeintrag.DialogCreateNewOrEditLexiconEintrag;
import home.computerlinguistik.main.gui.merkmal.DialogCreateNewOrEditMerkmal;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.List;

import model.LexikalischFunktionaleGrammatik;
import model.LexikonEintrag;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseLexikon extends AbstractCompositeBrowse {
	long grammarid;

	public CompositeBrowseLexikon(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateGrammarSelection(long grammarId) {
		grammarid = grammarId;
		refreshTable();

	}

	public void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);
		List list = wb.getLexikon().getEintraege();
		tableViewer.setInput(list);
		session.flush();
		session.close();
	}

	@Override
	protected void delete() {
		StructuredSelection selection = (StructuredSelection) tableViewer
				.getSelection();
		if (selection.isEmpty())
			return;
		Session session = PersistenceUtility.getINSTANCE().createSession();
		try {

			LexikalischFunktionaleGrammatik grammar = PersistenceUtility
					.getLexikalischFunktionaleGrammatikById(grammarid, session);

			LexikonEintrag eintrag = (LexikonEintrag) selection
					.getFirstElement();
			session.update(eintrag);
			grammar.getLexikon().getEintraege()
					.remove(selection.getFirstElement());
			session.save(grammar);
			session.flush();
		} finally {
			session.close();
			refreshTable();

		}

	}

	@Override
	protected void edit() {
		StructuredSelection selection = (StructuredSelection) tableViewer
				.getSelection();
		if (selection.isEmpty())
			return;
		LexikonEintrag eintrag1 = (LexikonEintrag) selection.getFirstElement();
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(eintrag1);
		try {

			LexikalischFunktionaleGrammatik grammar = PersistenceUtility
					.getLexikalischFunktionaleGrammatikById(grammarid, session);
			DialogCreateNewOrEditLexiconEintrag dialog = new DialogCreateNewOrEditLexiconEintrag(
					Display.getCurrent().getActiveShell(), grammar,
					(LexikonEintrag) eintrag1);
			if (dialog.open() == DialogCreateNewOrEditMerkmal.OK) {
				LexikonEintrag eintrag = dialog.getEintrag();
				session.save(eintrag);
				session.flush();

			}
		} finally {
			session.close();
			refreshTable();
		}
	}

	@Override
	protected void createNew() {

		Session session = PersistenceUtility.getINSTANCE().createSession();
		try {
			LexikalischFunktionaleGrammatik grammar = PersistenceUtility
					.getLexikalischFunktionaleGrammatikById(grammarid, session);

			DialogCreateNewOrEditLexiconEintrag dialog = new DialogCreateNewOrEditLexiconEintrag(
					Display.getCurrent().getActiveShell(), grammar);
			if (dialog.open() == DialogCreateNewOrEditMerkmal.OK) {
				LexikonEintrag eintrag = dialog.getEintrag();
				grammar.getLexikon().getEintraege().add(eintrag);
				session.save(grammar);
				session.flush();
			}
		} finally {
			session.close();
			refreshTable();

		}
	}

	@Override
	protected void configureViewer() {
		TableViewerColumn col = createTableViewerColumn("Name", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				LexikonEintrag wb = (LexikonEintrag) element;
				return "" + wb.getName(); //$NON-NLS-1$

			}
		});
		col = createTableViewerColumn("Terminal", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				LexikonEintrag wb = (LexikonEintrag) element;
				return "" + wb.getWortart().getName(); //$NON-NLS-1$

			}
		});
	}

}
