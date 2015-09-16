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
String ausgabeEarly="";
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
		// init
		grammarTreeRoot=null;
		Nichterminal startNichterminal = grammar.getGrammatik().getS0();
		zustandsMengen = parseText();
		ArrayList<Zustand> lastzustaende = zustandsMengen.get(zustandsMengen.size()-1).getZustaende();
		for (Iterator iterator = lastzustaende.iterator(); iterator.hasNext();) {
			Zustand zustand = (Zustand) iterator.next();
			if((zustand.getRegel().getVon().equals(startNichterminal)&&zustand.getTeilungsPosition()==zustandsMengen.size()-1));
			finalZustandFound = true;
		}
		if(!finalZustandFound)
		return false;
		
		 grammarTreeRoot=	buildgrammarTree(zustandsMengen);
		
		return true;
	}
	public GrammarTreeNode getGrammarTreeRoot() {
		return grammarTreeRoot;
	}

	private GrammarTreeNode buildgrammarTree(ArrayList<Zustandsmenge> zustandsMengen2) {
		return null;
		// TODO Auto-generated method stub
		
	}
	private ArrayList<Zustandsmenge> parseText() {
	ausgabeEarly="";
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
		ausgabeEarly+=	"INIT:	" + getZustandsString(z)+"\n";
		}
		for (int i = 0; i < chart.size(); i++) {

			if (i > 0) {
				scanner(chart.get(i - 1), chart.get(i));
				completor(chart, chart.get(i));
			}
			predictor(chart.get(i));

		}
		return null;
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

					for (int j = chart.indexOf(q1) - 1; j >= 0; j--) {
						zustandsmenge = chart.get(j).getZustaende();
						for (Iterator iterator = zustandsmenge.iterator(); iterator
								.hasNext();) {
							zustand1 = (Zustand) iterator.next();
							// System.err.println("Check:"
							// + getZustandsString(zustand1));
							// checkZustand1
							if (zustand1.getRegel().getAuf().size() > zustand1.teilungsPosition
									&& zustand1
											.getRegel()
											.getAuf()
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
								ausgabeEarly+="COMP:	"
										+ getZustandsString(z)+"\n";

								hinzugefuegt = true;
							}
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
							zustand0.getTeilungsPosition() + 1, q0.i);
					q1.getZustaende().add(z);
					ausgabeEarly+="SCAN:	" + getZustandsString(z)+"\n";
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
								ausgabeEarly+="PRED:	"
										+ getZustandsString(z)+"\n";
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
