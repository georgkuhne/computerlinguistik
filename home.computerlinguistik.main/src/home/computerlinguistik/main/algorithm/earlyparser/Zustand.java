package home.computerlinguistik.main.algorithm.earlyparser;

import model.AbleitungsRegel;

public class Zustand {
	AbleitungsRegel regel;
	int teilungsPosition;
	int nrUrsprungsmenge;

	public Zustand(AbleitungsRegel regel, int teilungsPosition,
			int ursprungsmenge) {
		super();
		this.regel = regel;
		this.teilungsPosition = teilungsPosition;
		this.nrUrsprungsmenge = ursprungsmenge;
	}

	public AbleitungsRegel getRegel() {
		return regel;
	}

	public int getUrsprungsmenge() {
		return nrUrsprungsmenge;
	}

	public int getTeilungsPosition() {
		return teilungsPosition;
	}
}
