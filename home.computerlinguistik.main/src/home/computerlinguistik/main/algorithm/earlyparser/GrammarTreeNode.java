package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.ArrayList;

import model.LexikonEintrag;

public class GrammarTreeNode {

	GrammarTreeNode parent;
	ArrayList<GrammarTreeNode> children=new ArrayList<GrammarTreeNode>();
	LexikonEintrag blatteintrag;
	
	public void setBlatteintrag(LexikonEintrag blatteintrag) {
		this.blatteintrag = blatteintrag;
	}
	public LexikonEintrag getBlatteintrag() {
		return blatteintrag;
	}
	public ArrayList<GrammarTreeNode> getChildren() {
		return children;
	}
	public GrammarTreeNode getParent() {
		return parent;
	}
	public void setParent(GrammarTreeNode parent) {
		this.parent = parent;
	}
	
	
}
