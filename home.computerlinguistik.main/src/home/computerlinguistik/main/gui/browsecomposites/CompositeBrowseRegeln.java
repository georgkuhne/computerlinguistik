package home.computerlinguistik.main.gui.browsecomposites;

import home.computerlinguistik.main.gui.merkmal.DialogCreateNewOrEditMerkmal;
import home.computerlinguistik.main.gui.regeln.DialogNewOrEditRulre;
import home.cpmputerlinguistik.persistence.PersistenceUtility;

import java.util.Iterator;

import model.AbleitungsRegel;
import model.AnnotiertesTerminalNichtTerminal;
import model.LexikalischFunktionaleGrammatik;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.hibernate.Session;

public class CompositeBrowseRegeln extends AbstractCompositeBrowse {

	private long grammarid;

	public CompositeBrowseRegeln(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public void updateGrammarSelection(long grammarId) {

		grammarid = grammarId;
		refreshTable();
	}

	protected void refreshTable() {
		Session session = PersistenceUtility.getINSTANCE().createSession();
		LexikalischFunktionaleGrammatik wb = PersistenceUtility
				.getLexikalischFunktionaleGrammatikById(grammarid, session);

		EList<AbleitungsRegel> list = wb.getGrammatik().getRegeln();
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

			AbleitungsRegel regel = (AbleitungsRegel) selection
					.getFirstElement();
			session.update(regel);
			grammar.getGrammatik().getRegeln().remove(regel);
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
		AbleitungsRegel regel = (AbleitungsRegel) selection.getFirstElement();
		Session session = PersistenceUtility.getINSTANCE().createSession();
		session.update(regel);
		try {

			LexikalischFunktionaleGrammatik grammar = PersistenceUtility
					.getLexikalischFunktionaleGrammatikById(grammarid, session);
			DialogNewOrEditRulre dialog = new DialogNewOrEditRulre(Display
					.getCurrent().getActiveShell(), grammar, regel);
			if (dialog.open() == DialogCreateNewOrEditMerkmal.OK) {
				session.save(dialog.getRegel());
				session.flush();

			}
		} catch (Exception e) {
			e.printStackTrace();
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

			DialogNewOrEditRulre dialog = new DialogNewOrEditRulre(Display
					.getCurrent().getActiveShell(), grammar);
			if (dialog.open() == DialogCreateNewOrEditMerkmal.OK) {
				AbleitungsRegel regel = dialog.getRegel();
				grammar.getGrammatik().getRegeln().add(regel);
				session.save(grammar);
				session.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			refreshTable();

		}
	}

	@Override
	protected void configureViewer() {
		TableViewerColumn col = createTableViewerColumn("VON", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				AbleitungsRegel wb = (AbleitungsRegel) element;
				return wb.getVon().getName();
			}
		});
		col = createTableViewerColumn("", 100, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return "\u2192"; //$NON-NLS-1$

			}
		});
		col = createTableViewerColumn("AUF", 500, 0); //$NON-NLS-1$
		col.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {

				AbleitungsRegel wb = (AbleitungsRegel) element;
				EList<AnnotiertesTerminalNichtTerminal> list = wb.getAuf();
				String ret = "";
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					AnnotiertesTerminalNichtTerminal annotiertesTerminalNichtTerminal = (AnnotiertesTerminalNichtTerminal) iterator
							.next();

					ret = ret
							+ annotiertesTerminalNichtTerminal
									.getTerminalNichtTerminal().getName()
							+ " | ";
				}
				return ret;
			}
		});

	}

}
