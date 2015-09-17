package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.ArrayList;
import java.util.Iterator;

import model.AbleitungsRegel;

public class Zustandsmenge {
	ArrayList<Zustand> zustaende = new ArrayList<Zustand>();
	int i;

	public ArrayList<Zustand> getZustaende() {
		return zustaende;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Zustandsmenge(int i) {
		this.i = i;
	}

	public boolean containsRegel(AbleitungsRegel regel) {
		for (Iterator<Zustand> iterator = zustaende.iterator(); iterator
				.hasNext();) {
			Zustand zustand = iterator.next();
			if (zustand.getRegel().equals(regel))
				return true;
		}
		return false;
	}

	public boolean containsZustand(Zustand z) {
		for (Iterator<Zustand> iterator = zustaende.iterator(); iterator
				.hasNext();) {
			Zustand zustand = iterator.next();
			if (zustand.getRegel().equals(z.getRegel())
					&& zustand.getTeilungsPosition() == z.teilungsPosition)
				return true;
		}
		return false;
	}
}
