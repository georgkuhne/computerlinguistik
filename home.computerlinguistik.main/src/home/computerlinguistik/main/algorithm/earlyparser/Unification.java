package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.ArrayList;
import java.util.Iterator;

import model.FStruktur;

public class Unification {

	public boolean univicateGrammarTree(GrammarTreeNode rootNode) {

		try {
			unificate(rootNode);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	ArrayList<FStruktur> unificate(GrammarTreeNode node) throws Exception {

		if (node.blatteintrag != null)
			return node.fstruktur;
		ArrayList<ArrayList<FStruktur>> tounificate = new ArrayList<ArrayList<FStruktur>>();
		for (Iterator iterator = node.getChildren().iterator(); iterator
				.hasNext();) {
			GrammarTreeNode type = (GrammarTreeNode) iterator.next();
			tounificate.add(unificate(type));
		}
		return null;
	}
}
