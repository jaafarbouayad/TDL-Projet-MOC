package moc.tds;

import moc.gc.Emplacement;
import moc.type.DTYPE;

import java.util.LinkedList;

/**
 * Cette classe décrit une fonction
 * 
 * @author BOUAYAD, PRIEUL
 * 
 */
public class INFOFONCT implements INFO { 

	/**
	 * Le type de retour de la fonction
	 */
	protected DTYPE typeRetour;

	public DTYPE getTypeRetour() {
		return typeRetour;
	}

	/**
	 * La liste chainee des arguments (representes par des couples DTYPE/String)
	 */
	protected LinkedList<Argument> args;

	public LinkedList<Argument> getArgs() {
	  	return args;
	}


	/**
	 * Une fonction a un type de retour et une liste d'arguments
	 * @param t
	 * @param a
	 */
	public INFOFONCT(DTYPE t, LinkedList<Argument> a) {
		typeRetour = t;
		args = a;
	}

	@Override
	public String toString() {
	  	String retour = "INFOFONCT [typeRetour=" + typeRetour.getNom() + ", args=(";
		for (int i=0; i<args.size(); i++) {
		  retour += args.get(i);
		  if (i != args.size()) {retour += " ,";}
		}
		retour += ")]";

		return retour;
	}

}
