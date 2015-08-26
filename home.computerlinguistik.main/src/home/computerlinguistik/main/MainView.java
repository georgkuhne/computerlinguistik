package home.computerlinguistik.main;

import home.computerlinguistik.main.gui.CompositeBrowseGrammar;
import home.computerlinguistik.main.gui.CompositeMain;
import home.computerlinguistik.main.gui.GrammarSelectedListener;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class MainView extends ViewPart {
	public static final String ID = "home.computerlinguistik.main.view";
	private static MainView instance;

	private TableViewer viewer;
	ArrayList<GrammarSelectedListener> listener = new ArrayList<GrammarSelectedListener>();
	CompositeMain maincomposite;
	CompositeBrowseGrammar cbrowse;
	StackLayout stacklayout = new StackLayout();
	private boolean isgrammarActive = false;
	long grammarid;
	private Composite parent;

	public MainView() {
		instance = this;
	}

	public static MainView getInstance() {
		return instance;
	}

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */

	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			if (parent instanceof Object[]) {
				return (Object[]) parent;
			}
			return new Object[0];
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayout(stacklayout);
		maincomposite = new CompositeMain(parent, SWT.None);
		cbrowse = new CompositeBrowseGrammar(parent, SWT.None, this);
		stacklayout.topControl = cbrowse;

	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		if (viewer != null)
			viewer.getControl().setFocus();
	}

	public void openGrammar(long id2) {
		this.grammarid = id2;
		for (Iterator iterator = listener.iterator(); iterator.hasNext();) {
			GrammarSelectedListener type = (GrammarSelectedListener) iterator
					.next();
			type.updateGrammarSelection(id2);

		}
		stacklayout.topControl = maincomposite;
		parent.layout();
		this.isgrammarActive = true;

	}

	public long getGrammarid() {
		return grammarid;
	}

	public boolean isIsgrammarActive() {
		return isgrammarActive;
	}

	public void addGrammarSelectedListener(GrammarSelectedListener listener1) {
		listener.add(listener1);
	}

	public void closeGrammar() {
		stacklayout.topControl = cbrowse;
		parent.layout();

	}

}