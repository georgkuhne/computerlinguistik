package home.computerlinguistik.main.algorithm.earlyparser;

import java.util.Iterator;

import model.AttributWertePaar;
import model.FStruktur;
import model.Funktion;
import model.MerkmalFunktion;
import model.ModelFactory;
import model.WertTyp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Unification {

	public boolean univicateGrammarTree(GrammarTreeNode rootNode) {

		try {
			unificate(rootNode);
		} catch (IllegalArgumentException e) {
			System.err.println(e);
			return false;
		}
		return true;
	}

	FStruktur unificate(GrammarTreeNode node) throws IllegalArgumentException {

		if (node.blatteintrag != null) {
			if (node.fstruktur.size() > 0)
				return node.fstruktur.get(0);
			else
				return ModelFactory.eINSTANCE.createFStruktur();

		}
		FStruktur tounificate = ModelFactory.eINSTANCE.createFStruktur();

		for (Iterator iterator = node.getChildren().iterator(); iterator
				.hasNext();) {
			GrammarTreeNode type = (GrammarTreeNode) iterator.next();
			if (type.getAnt() != null
					&& type.getAnt().getAufwaertspfeil().size() > 0) {

				MerkmalFunktion mf = null;
				for (int i = 0; i < type.getAnt().getAufwaertspfeil().size(); i++)
					mf = type.getAnt().getAufwaertspfeil().get(i);
				if (mf instanceof Funktion) {
					AttributWertePaar paar = ModelFactory.eINSTANCE
							.createAttributWertePaar();
					paar.setWertTyp(WertTyp.FUNKTION);
					paar.setFunktionsWert(unificate(type));
				}
			} else {
				unificateStructure(tounificate, unificate(type));

			}
		}

		return tounificate;
	}

	private void unificateStructure(FStruktur f1, FStruktur f2)
			throws IllegalArgumentException {

		EList<AttributWertePaar> at1 = f1.getAttributWertePaare();
		EList<AttributWertePaar> at2 = f2.getAttributWertePaare();
		for (Iterator<AttributWertePaar> iterator = at1.iterator(); iterator
				.hasNext();) {
			AttributWertePaar attributWertePaar = (AttributWertePaar) iterator
					.next();
			WertTyp type = attributWertePaar.getWertTyp();
			switch (type.getValue()) {
			case WertTyp.FUNKTION_VALUE:
				for (Iterator<AttributWertePaar> iterator2 = at2.iterator(); iterator
						.hasNext();) {
					AttributWertePaar attributWertePaar2 = (AttributWertePaar) iterator2
							.next();
					if (attributWertePaar2.getWertTyp().getValue() == WertTyp.FUNKTION_VALUE
							&& attributWertePaar2.getFunktion().equals(
									attributWertePaar.getFunktion())) {
						unificateStructure(
								attributWertePaar.getFunktionsWert(),
								attributWertePaar2.getFunktionsWert());
						attributWertePaar.getFunktionsWert().setIsunificated(
								true);
						attributWertePaar2.getFunktionsWert().setIsunificated(
								true);
					}
				}
				break;
			case WertTyp.MERKMAL_VALUE:
				for (Iterator<AttributWertePaar> iterator2 = at2.iterator(); iterator
						.hasNext();) {
					AttributWertePaar attributWertePaar2 = (AttributWertePaar) iterator2
							.next();
					if (attributWertePaar2.getMerkmal().equals(
							attributWertePaar.getMerkmal())) {
						if (!attributWertePaar.getMerkmalsWert().equals(
								attributWertePaar2.getMerkmalsWert()))
							throw new IllegalArgumentException(
									attributWertePaar.getMerkmalsWert()
											+ "!="
											+ attributWertePaar
													.getMerkmalsWert());
					}
				}

			default:
				break;
			}
		}
		Iterator<AttributWertePaar> iterator;
		for (Iterator<AttributWertePaar> iterator1 = at2.iterator(); iterator1
				.hasNext();) {
			AttributWertePaar attributWertePaar2 = (AttributWertePaar) iterator1
					.next();
			boolean contains = false;
			for (iterator = at1.iterator(); iterator.hasNext();) {
				AttributWertePaar attributWertePaar1 = (AttributWertePaar) iterator
						.next();

				WertTyp type = attributWertePaar2.getWertTyp();
				switch (type.getValue()) {
				case WertTyp.FUNKTION_VALUE:
					if (attributWertePaar1.getWertTyp().getValue() == WertTyp.FUNKTION_VALUE
							&& attributWertePaar1.getFunktion().equals(
									attributWertePaar2.getFunktion()))
						contains = true;
					break;
				case WertTyp.MERKMAL_VALUE:
					if (attributWertePaar1.getWertTyp().getValue() == WertTyp.MERKMAL_VALUE
							&& attributWertePaar1.getMerkmal().equals(
									attributWertePaar2.getMerkmal()))
						contains = true;
				}
			}
			if (!contains) {
				at1.add(EcoreUtil.copy(attributWertePaar2));
			}
		}
	}
}
