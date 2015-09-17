package home.computerlinguistik.main.gui.showvalidationresult;

import home.computerlinguistik.main.algorithm.earlyparser.GrammarTreeNode;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

public class DialogResults extends Dialog {
	boolean earlyParsingSucceed = false;
	boolean unificationSucceed = false;
	private Text textEarleyResult;
	private String ausgabeEarly = "";
	private String ausgabeResultregeln = "";
	private Text textResultRules;
	private Composite compositeGraph;
	private GrammarTreeNode abbleitungsbaum = null;
	private Graph ableitungsgraph;
	private int nodenr = 0;
	private boolean parsingError = false;
	private boolean unificationError = false;
	private String satz = "";

	public void setEarlyParsingSucceed(boolean earlyParsingSucceed) {
		this.earlyParsingSucceed = earlyParsingSucceed;
	}

	public void setSatz(String satz) {
		this.satz = satz;
	}

	public void setUnificationSucceed(boolean unificationSucceed) {
		this.unificationSucceed = unificationSucceed;
	}

	public void setAbbleitungsbaum(GrammarTreeNode abbleitungsbaum) {
		this.abbleitungsbaum = abbleitungsbaum;
	}

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DialogResults(Shell parentShell) {
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

		Group grpberblick = new Group(container, SWT.NONE);
		grpberblick.setText("\u00DCberblick");
		FormData fd_grpberblick = new FormData();
		fd_grpberblick.top = new FormAttachment(0);
		fd_grpberblick.left = new FormAttachment(0);
		fd_grpberblick.height = 100;
		fd_grpberblick.right = new FormAttachment(100);
		grpberblick.setLayoutData(fd_grpberblick);

		TabFolder tabFolder = new TabFolder(container, SWT.NONE);
		FormData fd_tabFolder = new FormData();
		fd_tabFolder.top = new FormAttachment(grpberblick);

		Label lblSatz = new Label(grpberblick, SWT.NONE);
		lblSatz.setBounds(37, 23, 55, 15);
		lblSatz.setText("Satz:");

		Label lblText = new Label(grpberblick, SWT.NONE);
		lblText.setBackground(SWTResourceManager
				.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblText.setBounds(98, 23, 418, 22);

		Label lblValidierung = new Label(grpberblick, SWT.NONE);
		lblValidierung.setBounds(23, 65, 69, 15);
		lblValidierung.setText(" Validierung:");

		Label lblError = new Label(grpberblick, SWT.NONE);
		lblError.setBackground(SWTResourceManager
				.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblError.setBounds(108, 65, 405, 22);
		fd_tabFolder.bottom = new FormAttachment(100);
		fd_tabFolder.left = new FormAttachment(0);
		fd_tabFolder.right = new FormAttachment(100);
		tabFolder.setLayoutData(fd_tabFolder);

		TabItem tbtmEarleyParser = new TabItem(tabFolder, SWT.NONE);
		tbtmEarleyParser.setText("Earley parser");

		textEarleyResult = new Text(tabFolder, SWT.BORDER | SWT.READ_ONLY
				| SWT.V_SCROLL | SWT.MULTI);
		tbtmEarleyParser.setControl(textEarleyResult);
		textEarleyResult.setText(ausgabeEarly);
		;
		TabItem tbtmAbleitungsregeln = new TabItem(tabFolder, SWT.NONE);
		tbtmAbleitungsregeln.setText("Ableitungsregeln");

		textResultRules = new Text(tabFolder, SWT.BORDER | SWT.READ_ONLY
				| SWT.V_SCROLL | SWT.MULTI);
		tbtmAbleitungsregeln.setControl(textResultRules);
		textResultRules.setText(ausgabeResultregeln);
		TabItem tbtmSyntaxbaum = new TabItem(tabFolder, SWT.NONE);
		tbtmSyntaxbaum.setText("Syntaxbaum");

		compositeGraph = new Composite(tabFolder, SWT.NONE);
		buildAbleitungsBaum();
		tbtmSyntaxbaum.setControl(compositeGraph);
		if (!parsingError && !unificationError) {
			lblError.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
			lblError.setText("Validierung erfolgreich");
		} else {
			lblError.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
			if (parsingError) {
				lblError.setText("Early Parser ist fehlgeschlagen ");
			} else
				lblError.setText("Unifikation ist Fehlgeschlagen");
		}
		lblText.setText(satz);

		return container;
	}

	private void buildAbleitungsBaum() {
		if (abbleitungsbaum == null)
			return;
		compositeGraph.setLayout(new FillLayout(SWT.HORIZONTAL));
		ableitungsgraph = new Graph(compositeGraph, SWT.None);

		ableitungsgraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);

		extractAbleitungsGraph(abbleitungsbaum, null);
	}

	private void extractAbleitungsGraph(GrammarTreeNode node, GraphNode parent) {
		if (parent == null) {
			parent = new GraphNode(ableitungsgraph, SWT.NONE, node
					.getStartNichterminal().getName());
			nodenr++;
		}

		ArrayList<GrammarTreeNode> childnodes = node.getChildren();
		ArrayList<GraphNode> graphnodes = new ArrayList<GraphNode>();
		for (int i = childnodes.size() - 1; i >= 0; i--) {
			GrammarTreeNode grammarTreeNode = childnodes.get(i);
			GraphNode newNode = new GraphNode(ableitungsgraph, SWT.NONE,
					grammarTreeNode.getAnt().getTerminalNichtTerminal()
							.getName());
			nodenr++;
			graphnodes.add(newNode);
			new GraphConnection(ableitungsgraph,
					ZestStyles.CONNECTIONS_DIRECTED, parent, newNode);
			if (grammarTreeNode.getBlatteintrag() != null) {
				GraphNode newNode1 = new GraphNode(ableitungsgraph, SWT.NONE,
						grammarTreeNode.getBlatteintrag().getName());
				nodenr++;
				new GraphConnection(ableitungsgraph,
						ZestStyles.CONNECTIONS_DIRECTED, newNode, newNode1);
			}

		}

		for (int i = 0; i < childnodes.size(); i++)
			extractAbleitungsGraph(childnodes.get(i),
					graphnodes.get(childnodes.size() - (i + 1)));

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
		return new Point(606, 534);
	}

	public void setEarlyProgressString(String ausgabeEarly) {
		this.ausgabeEarly = ausgabeEarly;
	}

	public void setUsedRulesString(String ausgabeResultregeln) {
		this.ausgabeResultregeln = ausgabeResultregeln;
	}

	public void setParsingError() {
		parsingError = true;
	}

	public void setUnificationError() {
		unificationError = true;
	}

}
