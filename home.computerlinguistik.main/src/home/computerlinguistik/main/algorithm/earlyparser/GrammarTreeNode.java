package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.ArrayList;

import model.AnnotiertesTerminalNichtTerminal;
import model.FStruktur;
import model.LexikonEintrag;
import model.Nichterminal;

public class GrammarTreeNode {

	GrammarTreeNode parent;
	ArrayList<GrammarTreeNode> children = new ArrayList<GrammarTreeNode>();
	LexikonEintrag blatteintrag;
	Nichterminal startNichterminal;
	AnnotiertesTerminalNichtTerminal ant;
	ArrayList<FStruktur> fstruktur;

	public Nichterminal getStartNichterminal() {

		return startNichterminal;
	}

	public AnnotiertesTerminalNichtTerminal getAnt() {
		return ant;
	}

	public void setBlatteintrag(LexikonEintrag blatteintrag) {
		this.blatteintrag = blatteintrag;
		fstruktur = new ArrayList<FStruktur>(blatteintrag.getAuspraegungen());
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

	public void setStartzustand(Nichterminal von) {
		startNichterminal = von;
	}

	public void setAnnotiertesTerminalNichterminal(
			AnnotiertesTerminalNichtTerminal annotiertesTerminalNichtTerminal) {
		ant = annotiertesTerminalNichtTerminal;
	}

	public void addChild(GrammarTreeNode child) {

		ArrayList<GrammarTreeNode> temp = new ArrayList<>();
		temp.add(child);
		temp.addAll(children);
		children = temp;
	}

}
