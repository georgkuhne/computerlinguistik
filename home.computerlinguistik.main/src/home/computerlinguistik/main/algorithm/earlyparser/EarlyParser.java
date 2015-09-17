package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.ArrayList;
import java.util.Iterator;

import model.AbleitungsRegel;
import model.AnnotiertesTerminalNichtTerminal;
import model.LexikalischFunktionaleGrammatik;
import model.LexikonEintrag;
import model.Nichterminal;
import model.Terminal;
import model.TerminalNichtTerminal;

import org.eclipse.emf.common.util.EList;

public class EarlyParser {
	static EarlyParser instance = new EarlyParser();
	LexikalischFunktionaleGrammatik grammar;
	private ArrayList<LexikonEintrag> woerter;
	private ArrayList<Zustandsmenge> zustandsMengen;
	private Zustandsmenge angewendetteAbleitungsregeln;
	String ausgabeEarly = "";
	String ausgabeResultregeln = "";

	public String getAusgabeResultregeln() {
		return ausgabeResultregeln;
	}

	private GrammarTreeNode grammarTreeRoot;

	public String getAusgabeEarly() {
		return ausgabeEarly;
	}

	public static EarlyParser getInstance() {
		return instance;
	}

	public ArrayList<Zustandsmenge> getZustaende() {
		return zustandsMengen;
	}

	public boolean performEarlyParser(LexikalischFunktionaleGrammatik grammar,
			ArrayList<LexikonEintrag> woerter) {
		this.grammar = grammar;
		this.woerter = woerter;
		boolean finalZustandFound = false;
		ausgabeResultregeln = ""; //$NON-NLS-1$

		angewendetteAbleitungsregeln = new Zustandsmenge(0);
		// init
		grammarTreeRoot = null;
		Nichterminal startNichterminal = grammar.getGrammatik().getS0();
		zustandsMengen = parseText();
		System.err.println(ausgabeEarly);
		Zustand finalZustand = null;
		ArrayList<Zustand> lastzustaende = zustandsMengen.get(
				zustandsMengen.size() - 1).getZustaende();
		for (Iterator<Zustand> iterator = lastzustaende.iterator(); iterator
				.hasNext();) {
			Zustand zustand = (Zustand) iterator.next();
			if ((zustand.getRegel().getVon().equals(startNichterminal) && zustand
					.getTeilungsPosition() == zustand.getRegel().getAuf()
					.size())) {
				finalZustand = zustand;
				finalZustandFound = true;
			}
		}
		if (!finalZustandFound)
			return false;
		// removeNonFinalZustaende();
		// createAngewendetteAbleitungsregeln();
		grammarTreeRoot = buildgrammarTree(finalZustand);
		ausgabeResultregeln = getResultRulesString();
		return true;
	}

	private void createAngewendetteAbleitungsregeln() {

		angewendetteAbleitungsregeln = new Zustandsmenge(0);
		for (int i = zustandsMengen.size() - 1; i >= 0; i--) {
			for (int j = zustandsMengen.get(i).getZustaende().size() - 1; j >= 0; j--)
				angewendetteAbleitungsregeln.zustaende.add(zustandsMengen
						.get(i).getZustaende().get(j));
		}
	}

	private void removeNonFinalZustaende() {
		ArrayList<Zustandsmenge> temp = new ArrayList<>();
		for (int i = 0; i < zustandsMengen.size(); i++) {
			temp.add(new Zustandsmenge(i));
			Iterator<Zustand> it = zustandsMengen.get(i).getZustaende()
					.iterator();
			while (it.hasNext()) {
				Zustand z = it.next();
				if (z.getRegel().getAuf().size() == z.getTeilungsPosition())
					temp.get(i).getZustaende().add(z);
			}
		}
		zustandsMengen = temp;
	}

	private String getResultRulesString() {
		String ret = "";
		for (Iterator<Zustand> it = angewendetteAbleitungsregeln.getZustaende()
				.iterator(); it.hasNext();) {
			Zustand q = it.next();
			ret = ret + q.regel.getVon().getName() + "->";
			EList<AnnotiertesTerminalNichtTerminal> list = q.getRegel()
					.getAuf();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				AnnotiertesTerminalNichtTerminal annotiertesTerminalNichtTerminal = (AnnotiertesTerminalNichtTerminal) iterator
						.next();
				ret = ret
						+ " "
						+ annotiertesTerminalNichtTerminal
								.getTerminalNichtTerminal().getName();

			}
			ret += "\n";
		}
		return ret;
	}

	public GrammarTreeNode getGrammarTreeRoot() {
		return grammarTreeRoot;
	}

	private GrammarTreeNode buildgrammarTree(Zustand finalZustand) {
		GrammarTreeNode root = new GrammarTreeNode();
		root.setParent(root);
		root.setStartzustand(finalZustand.getRegel().getVon());
		int i = zustandsMengen.size(), j = 0;
		ArrayList<Zustand> b = new ArrayList<Zustand>();
		b.add(finalZustand);
		// BaumRekursion(i, j, b, zustandsMengen);
		System.err
				.println("_________________________BUILD TREE_________________________");
		R(finalZustand, zustandsMengen.size() - 1, root);

		return root;
		// TODO Auto-generated method stub

	}

	private void BaumRekursion(int i, int j, ArrayList<Zustand> b,
			ArrayList<Zustandsmenge> q) {
		TerminalNichtTerminal Wj;
		int kj;
		int pj;
		while (i > 0) {
			Wj = b.get(j).getRegel().getAuf()
					.get(b.get(j).getTeilungsPosition() - 1)
					.getTerminalNichtTerminal();
			// Rückwärts Predictor
			if (Wj instanceof Nichterminal) {
				kj = b.get(j).nrUrsprungsmenge;
				pj = b.get(j).teilungsPosition;
				for (Iterator iterator = q.iterator(); iterator.hasNext();) {
					Zustand zustand = (Zustand) iterator.next();

				}
			}
		}
	}

	// Sei der Ausdruck: R([A -> b·, j], i)
	// 1. Falls b = X1...Xm, dann setze
	// k = m und l = i
	// 2. Falls Xk Element von Terminale, dann subtrahiere 1
	// von k und l
	// 3. Falls Xk Element von V, dann suche ein Item [Xk ->y·,* r]
	// in Zl für ein r so dass, [A -> X1...Xk -1 · Xk...Xm, j] aus Zr * ist.
	// Dann wird R([Xk _> y·, r], l) ausgeführt, und es wird 1 von k
	// * subtrahiert. Setze l = r
	// 4. Die Schritte 2 und 3 solange wiederholen, bis k = 0 ist.
	private void R(Zustand z, int i, GrammarTreeNode node) {
		if (node.getParent().equals(node))
			node.setStartzustand(z.getRegel().getVon());
		angewendetteAbleitungsregeln.getZustaende().add(z);
		System.err.println(getZustandsString(z) + " " + i + "\n");

		// Ueberpruefung 1.
		if (z.teilungsPosition - 1 < 0)
			return;
		TerminalNichtTerminal b = z.getRegel().getAuf()
				.get(z.teilungsPosition - 1).getTerminalNichtTerminal();
		int k = z.teilungsPosition - 1;
		int l = i;

		while (k > -1) {
			// SCHRITT 2 "
			if (b instanceof Terminal) {
				GrammarTreeNode newnode = new GrammarTreeNode();
				newnode.setBlatteintrag(woerter.get(l - 1));
				newnode.setAnnotiertesTerminalNichterminal(z.getRegel()
						.getAuf().get(k));
				node.addChild(newnode);

				k--;
				l--;
				continue;
			}
			b = z.getRegel().getAuf().get(k).getTerminalNichtTerminal();

			// SCHRITT 3
			if (b instanceof Nichterminal) {
				for (Iterator<Zustand> iterator = zustandsMengen.get(l)
						.getZustaende().iterator(); iterator.hasNext();) {
					Zustand pruefzustand0 = iterator.next();
					if (pruefzustand0.getRegel().getVon().equals(b)) {
						for (Iterator<Zustand> it2 = zustandsMengen
								.get(pruefzustand0.getUrsprungsmenge())
								.getZustaende().iterator(); it2.hasNext();) {
							Zustand pruefzustandZustand = it2.next();

							if (pruefzustandZustand.getRegel().getAuf().size() > pruefzustandZustand.teilungsPosition
									&& pruefzustandZustand
											.getRegel()
											.getAuf()
											.get(pruefzustandZustand.teilungsPosition)
											.getTerminalNichtTerminal()
											.equals(pruefzustand0.getRegel()
													.getVon())) {
								GrammarTreeNode newnode = new GrammarTreeNode();
								newnode.setParent(node);
								node.addChild(newnode);
								newnode.setAnnotiertesTerminalNichterminal(z
										.getRegel().getAuf().get(k));
								R(pruefzustand0, l, newnode);
								k--;
								l = pruefzustand0.getUrsprungsmenge();
								break;
							}
						}

					}
				}
			}
		}
	}

	private ArrayList<Zustandsmenge> parseText() {
		ausgabeEarly = ""; //$NON-NLS-1$
		// lege Zustände an
		ArrayList<Zustandsmenge> chart = new ArrayList<>();
		for (int i = 0; i <= woerter.size(); i++) {
			chart.add(new Zustandsmenge(i));
		}
		ArrayList<AbleitungsRegel> regeln = getRegelnByAuf(grammar
				.getGrammatik().getS0());
		for (Iterator iterator = regeln.iterator(); iterator.hasNext();) {
			AbleitungsRegel ableitungsRegel = (AbleitungsRegel) iterator.next();
			Zustand z = new Zustand(ableitungsRegel, 0, 0);
			chart.get(0).getZustaende().add(z);
			ausgabeEarly += "INIT:	" + getZustandsString(z) + "\n";
		}
		for (int i = 0; i < chart.size(); i++) {

			if (i > 0) {
				scanner(chart.get(i - 1), chart.get(i));
				completor(chart, chart.get(i));
			}
			predictor(chart.get(i));
			ausgabeEarly += "\n";
			if (i < woerter.size())
				ausgabeEarly += woerter.get(i).getName() + "\n";

		}
		return chart;
	}

	private String getZustandsString(Zustand q) {
		String ret = "";
		ret = ret + q.nrUrsprungsmenge + "|" + q.teilungsPosition + "  "
				+ q.regel.getVon().getName() + "->";
		EList<AnnotiertesTerminalNichtTerminal> list = q.getRegel().getAuf();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			AnnotiertesTerminalNichtTerminal annotiertesTerminalNichtTerminal = (AnnotiertesTerminalNichtTerminal) iterator
					.next();
			ret = ret
					+ " "
					+ annotiertesTerminalNichtTerminal
							.getTerminalNichtTerminal().getName();

		}
		return ret;
	}

	private ArrayList<AbleitungsRegel> getRegelnByAuf(Nichterminal nt) {
		ArrayList<AbleitungsRegel> regeln = new ArrayList<AbleitungsRegel>();
		EList<AbleitungsRegel> regelningrammar = grammar.getGrammatik()
				.getRegeln();
		for (Iterator iterator = regelningrammar.iterator(); iterator.hasNext();) {
			AbleitungsRegel ableitungsRegel = (AbleitungsRegel) iterator.next();
			if (ableitungsRegel.getVon().equals(nt))
				regeln.add(ableitungsRegel);
		}
		return regeln;
	}

	private void completor(ArrayList<Zustandsmenge> chart, Zustandsmenge q1) {
		boolean hinzugefuegt = true;
		Zustand zustand1;
		ArrayList<Zustand> zustandsmenge;
		while (hinzugefuegt) {
			hinzugefuegt = false;
			// gehe q1
			for (int i = 0; i < q1.getZustaende().size(); i++) {
				Zustand zustand = q1.getZustaende().get(i);
				if (zustand.teilungsPosition > 0
						&& zustand.getRegel().getAuf().size() == zustand.teilungsPosition) {

					zustandsmenge = chart.get(zustand.nrUrsprungsmenge)
							.getZustaende();
					for (Iterator iterator = zustandsmenge.iterator(); iterator
							.hasNext();) {
						zustand1 = (Zustand) iterator.next();
						// System.err.println("Check:"
						// + getZustandsString(zustand1));
						// checkZustand1
						if (zustand1.getRegel().getAuf().size() > zustand1.teilungsPosition
								&& zustand1.getRegel().getAuf()
										.get(zustand1.teilungsPosition)
										.getTerminalNichtTerminal()
										.equals(zustand.getRegel().getVon())
								&& !q1.containsZustand(new Zustand(zustand1
										.getRegel(),
										zustand1.teilungsPosition + 1,
										zustand1.nrUrsprungsmenge))) {
							Zustand z = new Zustand(zustand1.getRegel(),
									zustand1.teilungsPosition + 1,
									zustand1.nrUrsprungsmenge);
							q1.getZustaende().add(z);
							ausgabeEarly += "COMP:	" + getZustandsString(z)
									+ "\n";

							hinzugefuegt = true;
						}

					}
				}
			}

		}

	}

	private void scanner(Zustandsmenge q0, Zustandsmenge q1) {
		Terminal terminal = woerter.get(q0.i).getWortart();
		ArrayList<Zustand> zustaende0 = q0.getZustaende();
		for (int i = 0; i < zustaende0.size(); i++) {
			Zustand zustand0 = zustaende0.get(i);
			if (zustand0.getRegel().getAuf().size() > zustand0.teilungsPosition) {
				TerminalNichtTerminal tn = zustand0.getRegel().getAuf()
						.get(zustand0.getTeilungsPosition())
						.getTerminalNichtTerminal();
				if (tn.equals(terminal)) {

					Zustand z = new Zustand(zustand0.getRegel(),
							zustand0.getTeilungsPosition() + 1,
							zustand0.nrUrsprungsmenge);
					q1.getZustaende().add(z);
					ausgabeEarly += "SCAN:	" + getZustandsString(z) + "\n";
				}
			}
		}
	}

	public static ArrayList<LexikonEintrag> parseWords(String string,
			LexikalischFunktionaleGrammatik grammatik)
			throws WordNotInLexikonException {
		ArrayList<LexikonEintrag> returnlist = new ArrayList<LexikonEintrag>();
		String[] words = string.split(" ");
		for (int i = 0; i < words.length; i++) {
			boolean wordnotfound = true;
			EList<LexikonEintrag> list = grammatik.getLexikon().getEintraege();
			for (Iterator<LexikonEintrag> iterator = list.iterator(); iterator
					.hasNext();) {
				LexikonEintrag lexikonEintrag = (LexikonEintrag) iterator
						.next();
				if (lexikonEintrag.getName().equals(words[i])) {
					returnlist.add(lexikonEintrag);
					wordnotfound = false;
					break;
				}
			}
			if (wordnotfound)
				throw new WordNotInLexikonException(words[i]);
		}
		return returnlist;
	}

	boolean predictor(Zustandsmenge q1) {
		boolean hinzugefuegt = false;
		AbleitungsRegel regel;
		boolean ready = false;
		EList<AnnotiertesTerminalNichtTerminal> auf;
		Iterator<AbleitungsRegel> itregeln;
		ArrayList<AbleitungsRegel> regeln;
		int size = q1.getZustaende().size();
		AnnotiertesTerminalNichtTerminal ant;
		Zustand zustand;
		while (!ready) {
			ready = true;
			size = q1.getZustaende().size();
			for (int i = 0; i < size; i++) {
				zustand = q1.getZustaende().get(i);
				auf = zustand.getRegel().getAuf();
				if (auf.size() > zustand.getTeilungsPosition()) {
					ant = (AnnotiertesTerminalNichtTerminal) auf.get(zustand
							.getTeilungsPosition());
					if (ant.getTerminalNichtTerminal() instanceof Nichterminal) {
						regeln = getRegelnByAuf((Nichterminal) ant
								.getTerminalNichtTerminal());
						for (itregeln = regeln.iterator(); itregeln.hasNext();) {
							regel = (AbleitungsRegel) itregeln.next();
							if (!q1.containsRegel(regel)) {
								Zustand z = new Zustand(regel, 0, q1.i);
								q1.getZustaende().add(z);
								ausgabeEarly += "PRED:	" + getZustandsString(z)
										+ "\n";
								ready = false;
								hinzugefuegt = true;
							}
						}
					}
				}

			}
		}
		return hinzugefuegt;

	}
}
