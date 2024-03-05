package fr.ecole3il.tdma2.exo1;

public class ListeTableau<T> {
	private Object[] elements;
	private int taille;
	
	public ListeTableau(int tailleInitiale){
		elements = new Object[tailleInitiale];
		this.taille = 0;
	}
	
	public int getTaille() {
		return taille;
	}
	
	public void ajouter(T element) {
		if(taille == elements.length) {
			Object[] nouveauTableau = new Object[2*taille];
			for (int i = 0; i < elements.length; i++)
				nouveauTableau[i] = elements[i];
			elements = nouveauTableau;
		}
		elements[taille++] = element;
	}
	
	public T get(int index) {
		return (T) elements[index];
	}
}
