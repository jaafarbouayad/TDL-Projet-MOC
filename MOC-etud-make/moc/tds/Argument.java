package moc.tds;

import moc.type.DTYPE;

/**
 * Cette classe décrit un argument d'une fonction, c'est à dire le nom de l'argument ainsi que son type
 * 
 * @author BOUAYAD, PRIEUL
 * 
 */
public class Argument { 

  	/**
	 * Le type de l'argument
	 */
  	private DTYPE type;

	public DTYPE getType() {
	  return type;
	}

	/**
	 * Le nom de l'argument
	 */
	private String nom;

	public String getNom() {
	  return nom;
	}


	public String toString() {
	  return type + " " + nom;
	}

}
