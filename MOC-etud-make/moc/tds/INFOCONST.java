package moc.tds;

import moc.gc.Emplacement;
import moc.type.DTYPE;

/**
 * Cette classe décrit une constante
 * 
 * @author BOUAYAD, PRIEUL
 * 
 */
public class INFOCONST implements INFO { 

	/**
	 * Le type de la constante
	 */
	protected DTYPE type;

	public DTYPE getType() {
		return type;
	}

	public int getTaille() {
		return this.getType().getTaille();
	}

	/**
	 * La valeur de la constante
	 */
	protected String valeur;

	public String getValeur() {
	  	return valeur;
	}

	/**
	 * Une constante a un type 
	 * @param t
	 */
	public INFOCONST(DTYPE t) {
		type = t;
	}

	@Override
	public String toString() {
		return "INFOCONST [type=" + type.getNom() + "]";
	}

}
