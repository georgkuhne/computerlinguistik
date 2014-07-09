package home.computerlinguistik.logic;

import home.computerlinguistik.grammarmodel.Regel;
import home.computerlinguistik.lexiconmodel.Eintrag;
import home.computerlinguistik.lexiconmodel.Lexicon;

import java.util.ArrayList;
import java.util.List;

public class Analyzer {
	
	private Lexicon lexicon;
	
	private List<Regel> rules = new ArrayList<Regel>();
	
	public Analyzer(Lexicon lexicon, List<Regel> rules) {
		this.lexicon = lexicon;
		this.rules = rules;
	}
	
	public List<Eintrag> analyze(String sentence) {
		throw new RuntimeException("NOT IMPLEMENTED");
	}
}
