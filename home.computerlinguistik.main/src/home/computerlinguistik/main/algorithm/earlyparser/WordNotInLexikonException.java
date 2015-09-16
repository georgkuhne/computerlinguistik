package home.computerlinguistik.main.algorithm.earlyparser;

public class WordNotInLexikonException extends Exception {
	String word;

	public WordNotInLexikonException(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
}
